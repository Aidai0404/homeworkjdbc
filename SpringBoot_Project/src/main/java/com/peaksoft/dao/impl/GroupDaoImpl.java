package com.peaksoft.dao.impl;

import com.peaksoft.dao.GroupDao;
import com.peaksoft.entity.Course;
import com.peaksoft.entity.Group;
import com.peaksoft.entity.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class GroupDaoImpl implements GroupDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Group> getAllGroups() {
        return entityManager.createQuery("from Group").getResultList();
    }

    @Override
    public void addGroup(Group group) {
       entityManager.persist(group);
    }

    @Override
    public void updateGroup(Long id, Group group) {
       Group group1 = entityManager.find(Group.class,id);
       group1.setGroupName(group.getGroupName());
       group1.setDateOfStart(group.getDateOfStart());
       group1.setDateOfFinish(group.getDateOfFinish());
       group1.setCourse(group.getCourse());
       entityManager.merge(group1);
    }

    @Override
    public Group getById(Long id) {
        return entityManager.find(Group.class,id);
    }

    @Override
    public void deleteGroup(Group group) {
       entityManager.remove(entityManager.contains(group) ? group : entityManager.merge(group));
    }

    @Override
    public List<Student> getStudentsByGroupId(Long id) {
        List<Student>students = entityManager.createQuery("select s from Student s join s.group gr where gr.id=?1").setParameter(1,id).getResultList();
        return students;
    }

    @Override
    public List<Course> getCoursesByGroupId(Long id) {
        List<Course>courses = entityManager.createQuery("select c from Course c join c.groups gr1 where gr1.id=?1").setParameter(1,id).getResultList();
        return courses;
    }

    @Override
    public Student searchStudent(Long id,Long courseId) {
        Student student = (Student) entityManager.createQuery("select s from Student s  join s.group g where g.id=?1 having s.name like '%'").setParameter(1,id).getResultList();
        student.setGroupId(id);
        return student;
    }
//    List<Student>students = entityManager.createQuery("select s from Student s join " +
//                    " s.group g join g.course c join c.company com where com.id=?1")
//            .setParameter(1,id).getResultList();
//        return students;
//}
@Override
public  List<Student> search(String studentName,Long groupId) {
    List<Student> students = entityManager.createQuery("select  s from Student s  join s.group gr where gr.id=?1 and s.name =?2").setParameter(1, groupId).setParameter(2,studentName).getResultList();
    return students;
}
}
