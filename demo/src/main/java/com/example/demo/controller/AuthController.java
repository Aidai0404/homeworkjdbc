package com.example.demo.controller;

import com.example.demo.dto.AuthenticationRequest;
import com.example.demo.dto.AuthenticationResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtService;
import com.example.demo.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/gadgetarium/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final JwtService tokenUtil;

     @PostMapping("/register")
    public AuthenticationResponse register(@RequestBody RegisterRequest request){
         System.out.println("sdlfjsldkfjsldf");
         System.out.println("sdlfjsldkfjsldf");
         System.out.println("sdlfjsldkfjsldf");
        return  authService.register(request);
//         return new AuthenticationResponse();
    }

    @PostMapping("/authenticate")
    public AuthenticationResponse login(@RequestBody AuthenticationRequest request){
      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
      User user = userRepository.findByEmail(request.getEmail()).orElseThrow();
      var jwtToken = tokenUtil.generateToken(user);
       return AuthenticationResponse.builder().token(jwtToken).build();
    }
}
