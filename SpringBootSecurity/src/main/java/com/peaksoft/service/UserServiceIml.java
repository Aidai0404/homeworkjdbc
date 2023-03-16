package com.peaksoft.service;

import com.peaksoft.entity.User;
import com.peaksoft.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceIml implements UserService{
    private final UserRepository userRepository;
    @Override
    public void save(User user) {
     userRepository.save(user);
    }

    @Override
    public void update(User user, Long id) {
     User user1 = userRepository.getById(id);
     user1.setUserName(user.getUserName());
     user1.setPassword(user.getPassword());
     user1.setRoleSet(user.getRoleSet());
     userRepository.saveAndFlush(user1);
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByUserName(String userName) {
        return userRepository.getUserByUserName(userName);
    }
}
