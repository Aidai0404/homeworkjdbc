package com.peaksoft.springbootrestapi.repository;

import com.peaksoft.springbootrestapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}