package com.peaksoft.springbootrestapi.controller;

import com.peaksoft.springbootrestapi.dto.StudentRequest;
import com.peaksoft.springbootrestapi.dto.StudentResponse;
import com.peaksoft.springbootrestapi.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
@RequestMapping("api/students")
@RequiredArgsConstructor
//@PreAuthorize("hasAuthority('ADMIN')")
@Tag(name = "StudentController",description = "User with role Admin can create, update, get and delete students")
public class StudentController {
    private final StudentService studentService;
    @GetMapping
    @Operation(summary = "get all students", description = "get all students from database")
    public List<StudentResponse>getAll(){
        return studentService.getAll();
    }
    @PostMapping
    @Operation(description = "add new students to lms")
    public StudentResponse save(@RequestBody StudentRequest studentRequest){
      return studentService.create(studentRequest);
    }
    @GetMapping("{id}")
    @Operation(description = "find students by id")
    public StudentResponse getById (@PathVariable("id") Long id){
        return  studentService.getById(id);
    }
    @PutMapping("{id}")
    @Operation(description = "update an existing student by id")
    public StudentResponse update(@PathVariable("id") Long id,@RequestBody StudentRequest request){
        return studentService.update(id,request);
    }
    @DeleteMapping("{id}")
    @Operation(description = "delete an existing student by id")
    public String delete(@PathVariable("id") Long id){
        studentService.deleteById(id);
        return "User with id " + id + " was deleted";
    }

    @GetMapping("/search")
    public List<StudentResponse>search (@RequestParam(name = "text", required = false) String text, @RequestParam(value = "page"
    , required = false) int page, @RequestParam(name = "size", required = false) int size) {
     return studentService.responses(text,page,size);
    }
}
