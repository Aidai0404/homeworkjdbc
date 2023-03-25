package com.peaksoft.springbootrestapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginResponse {
    private String token;
    private String message;
    private String authority;
}
