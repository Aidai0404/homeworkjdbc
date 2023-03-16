package com.peaksoft.service;

import com.peaksoft.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student>getAllStudents();
    void addStudent(Student student,Long groupId);
    void updateStudent(Long id, Student student, Long groupId);
    Student getById(Long id);
    void deleteStudent(Student student);
//    Group studentGroup(Long id);
}
