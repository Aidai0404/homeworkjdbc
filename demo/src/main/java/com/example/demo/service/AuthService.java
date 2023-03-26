package com.example.demo.service;

import com.example.demo.dto.AuthenticationResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
   // private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;


    public User mapToEntity(RegisterRequest request) {
        User user = User.builder().firstname(request.getFirstName())
                .lastname(request.getLastname()).email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
//                .phoneNumber(request.getPhoneNumber())
                .createdDate(LocalDate.now())
                .build();
        return user;

    }

    public AuthenticationResponse responseForRegister(User user) {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        authenticationResponse.setFirstname(user.getFirstname());
        authenticationResponse.setLastname(user.getLastname());
        authenticationResponse.setEmail(user.getEmail());
//        authenticationResponse.setPhoneNumber(user.getPhoneNumber());
        authenticationResponse.setCreatedDate(user.getCreatedDate());
        authenticationResponse.setPassword(user.getPassword());
        return authenticationResponse;
    }

    public AuthenticationResponse register(RegisterRequest request) {
        User user = mapToEntity(request);
        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return responseForRegister(user).builder().token(jwtToken).build();
    }

    public AuthenticationResponse view(String token, String message, User user) {
        AuthenticationResponse response = new AuthenticationResponse();
        User user1 = userRepository.findById(user.getId()).get();
        response.setEmail(user1.getEmail());
        response.setPassword(user1.getPassword());
        response.setFirstname(user1.getFirstname());
        response.setLastname(user1.getLastname());
        response.setCreatedDate(user1.getCreatedDate());
        response.setAuthority(user1.getEmail());
        response.setPhoneNumber(user1.getPhoneNumber());
        response.setRole(user1.getRole());
        response.setToken(token);
        response.setMessage(message);

        if (user != null) {
            response.setAuthority(user.getRole().getAuthority());
        }
        return response;
    }


}
