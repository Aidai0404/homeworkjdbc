package com.peaksoft.springbootrestapi.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Getter
@Setter
public class StudentResponse {
    private String studentName;
    private String surname;
    private int age;
    private Boolean isActive = true;
    @CreatedDate
    private LocalDate created;
}
