package com.peaksoft.service;

import com.peaksoft.entity.Course;
import com.peaksoft.entity.Group;
import com.peaksoft.entity.Student;

import java.util.List;

public interface GroupService {
    List<Group> getAllGroups();
    void addGroup(Group group,Long courseId);
    void updateGroup(Long id, Group group, Long courseId);
    Group getById(Long id);
    void deleteGroup(Group group);
    List<Student>getStudentsByGroupId(Long id);
    List<Course>getCoursesByGroupId(Long id);
    Student searchStudent(Long id,Long courseId);
    List<Student> search(String studentName,Long groupId);
}
