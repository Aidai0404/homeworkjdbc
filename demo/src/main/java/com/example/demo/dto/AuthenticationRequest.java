package com.example.demo.dto;

import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class AuthenticationRequest {
    private String email;
    private String password;
}
