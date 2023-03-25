package com.peaksoft.springbootrestapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest {
    private String studentName;
    private String surname;
    private int age;
}
