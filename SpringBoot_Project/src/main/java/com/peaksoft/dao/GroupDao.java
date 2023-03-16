package com.peaksoft.dao;

import com.peaksoft.entity.Course;
import com.peaksoft.entity.Group;
import com.peaksoft.entity.Student;

import java.util.List;

public interface GroupDao {
    List<Group> getAllGroups();
    void addGroup(Group group);
    void updateGroup(Long id, Group group);
    Group getById(Long id);
    void deleteGroup(Group group);
    List<Student>getStudentsByGroupId(Long id);
    List<Course>getCoursesByGroupId(Long id);
    Student searchStudent(Long id,Long courseId);
    List<Student> search(String studentName,Long groupId);
}
