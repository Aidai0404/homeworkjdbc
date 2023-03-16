package com.peaksoft.service;

import com.peaksoft.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void update(User user,Long id);
    User getById(Long id);
    List<User>getAllUsers();
    User getUserByUserName(String userName);
}
