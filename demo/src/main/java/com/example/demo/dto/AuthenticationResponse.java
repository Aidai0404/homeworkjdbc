package com.example.demo.dto;

import com.example.demo.entity.Role;
import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class AuthenticationResponse {
    private String token;
    private String message;
    private String authority;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phoneNumber;
    private Role role;
    private LocalDate createdDate;


}
