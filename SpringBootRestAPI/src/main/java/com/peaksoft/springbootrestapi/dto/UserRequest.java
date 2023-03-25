package com.peaksoft.springbootrestapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class UserRequest {
    private String email;
    private String username;
    private String firstname;
    private String lastname;
    private String password;
}
