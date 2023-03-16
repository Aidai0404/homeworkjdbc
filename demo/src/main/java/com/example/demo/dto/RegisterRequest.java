package com.example.demo.dto;

import com.example.demo.entity.Role;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class RegisterRequest {
    private String firstName;
    private String lastname;
    private String email;
    private Role role;
    private String password;
    private String passwordAdmit;

}
