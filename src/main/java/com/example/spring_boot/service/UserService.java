package com.example.spring_boot.service;

import com.example.spring_boot.model.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);

    List<User> findAll();

    void updateUser(User user);

    void saveUser(User user);

    void deleteUser(Long id);
}
