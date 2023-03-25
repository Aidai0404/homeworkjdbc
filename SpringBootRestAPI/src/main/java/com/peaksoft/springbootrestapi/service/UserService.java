package com.peaksoft.springbootrestapi.service;

import com.peaksoft.springbootrestapi.dto.StudentRequest;
import com.peaksoft.springbootrestapi.dto.StudentResponse;
import com.peaksoft.springbootrestapi.dto.UserRequest;
import com.peaksoft.springbootrestapi.dto.UserResponse;
import com.peaksoft.springbootrestapi.entity.Role;
import com.peaksoft.springbootrestapi.entity.User;
import com.peaksoft.springbootrestapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User mapToEntity(UserRequest request){
        User user = new User();
        user.setFirstname(request.getFirstname());
        user.setLastname(request.getLastname());
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setCreatedDate(user.getCreatedDate());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.USER);
        return user;
    }
    public UserResponse mapToResponse(User user){
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setFirstname(user.getFirstname());
        userResponse.setLastname(user.getLastname());
        userResponse.setUsername(user.getUsername());
        userResponse.setEmail(user.getEmail());
        userResponse.setCreatedDate(user.getCreatedDate());
        userResponse.setRoleName(user.getRole().name());
        return userResponse;
    }
    public UserResponse create(UserRequest request){
        User user = mapToEntity(request);
        user.setCreatedDate(LocalDate.now());
        userRepository.save(user);
        return mapToResponse(user);
    }

    public List<UserResponse>getAll(){
       List<UserResponse>userResponses = new ArrayList<>();
       List<User> user = userRepository.findAll();
       for (User user1 : user){
           userResponses.add(mapToResponse(user1));
       }
       return userResponses;
    }
    public UserResponse update(Long id, UserRequest request){
        User user = userRepository.getById(id);
        user.setFirstname(request.getFirstname());
        user.setLastname(request.getLastname());
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        userRepository.save(user);
        return mapToResponse(user);
    }
    UserResponse getById(Long id){
        User user = userRepository.findById(id).get();
        return mapToResponse(user);
    }

    public void deleteById(Long id){
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
    }



}
