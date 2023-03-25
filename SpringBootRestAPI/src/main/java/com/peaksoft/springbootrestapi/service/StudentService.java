package com.peaksoft.springbootrestapi.service;

import com.peaksoft.springbootrestapi.dto.StudentRequest;
import com.peaksoft.springbootrestapi.dto.StudentResponse;
import com.peaksoft.springbootrestapi.entity.Student;
import com.peaksoft.springbootrestapi.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    //private final QuerydslJpaRepository querydslJpaRepository;

    public Student mapToStudent(StudentRequest request){
        Student student = new Student();
        student.setStudentName(request.getStudentName());
        student.setSurname(request.getSurname());
        student.setAge(request.getAge());
        return student;
    }
    public StudentResponse mapToResponse( Student student ){
           StudentResponse studentResponse = new StudentResponse();
           studentResponse.setStudentName(student.getStudentName());
           studentResponse.setSurname(student.getSurname());
           studentResponse.setAge(student.getAge());
           studentResponse.setIsActive(student.getIsActive());
           studentResponse.setCreated(student.getCreated());
           return studentResponse;
    }
    public StudentResponse create( StudentRequest request ){
        Student student = mapToStudent(request);
        student.setCreated(LocalDate.now());
        studentRepository.save(student);
        return mapToResponse(student);
    }

    public List<StudentResponse>getAll(){
        List<Student>students = studentRepository.findAll();
        List<StudentResponse> studentResponses = new ArrayList<>();
        for (Student student : students){
            studentResponses.add(mapToResponse(student));
        }
        return studentResponses;
    }

    public StudentResponse update(Long id, StudentRequest request){
        Student student = studentRepository.getById(id);
        student.setStudentName(request.getStudentName());
        student.setSurname(request.getSurname());
        student.setAge(request.getAge());
        studentRepository.save(student);
        return  mapToResponse(student);
    }

    public StudentResponse getById(long id){
        Student student = studentRepository.getById(id);
        return mapToResponse(student);
    }

    public void deleteById(Long id){
        Student student = studentRepository.getById(id);
        studentRepository.delete(student);
    }

    public List<StudentResponse>responses(String text, int page, int size){
      String text1 = text == null ? "" : text;
        Pageable pageable = PageRequest.of(page-1,size);
        List<Student>students = studentRepository.searchStudentsAndPagination(text1.toUpperCase(), pageable);
        List<StudentResponse>responses = new ArrayList<>();
        for (Student student : students) {
            responses.add(mapToResponse(student));
        }
        return responses;

    }

}
