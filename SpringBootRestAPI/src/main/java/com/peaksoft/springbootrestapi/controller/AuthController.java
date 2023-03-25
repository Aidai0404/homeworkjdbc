package com.peaksoft.springbootrestapi.controller;

import com.peaksoft.springbootrestapi.dto.*;
import com.peaksoft.springbootrestapi.entity.User;
import com.peaksoft.springbootrestapi.repository.UserRepository;
import com.peaksoft.springbootrestapi.security.jwt.JwtTokenUtil;
import com.peaksoft.springbootrestapi.service.UserDetailsServiceIml;
import com.peaksoft.springbootrestapi.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/jwt")
@RequiredArgsConstructor
public class AuthController {
    private final UserDetailsService userDetailsService;
    private final UserService userService;
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final LoginMapper loginMapper;
    private final JwtTokenUtil tokenUtil;

    @PostMapping("/register")
    @Operation(description = "all users can register")
    public UserResponse register(@RequestBody UserRequest request){
        return userService.create(request);
    }

    @PostMapping("/login")
    @Operation(description = "Using username and password, user can sign in")
    public LoginResponse login(@RequestBody LoginRequest request){
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword());
        authenticationManager.authenticate(token);
        User user = userRepository.findUserByUsername(token.getName());
        return loginMapper.view(tokenUtil.generatedToken(user), "successful", user);
    }

}
