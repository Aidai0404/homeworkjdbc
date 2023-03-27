package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDeleteResponse {
   // private static final String message = "The product is deleted";
    HttpStatus httpStatus;

}
