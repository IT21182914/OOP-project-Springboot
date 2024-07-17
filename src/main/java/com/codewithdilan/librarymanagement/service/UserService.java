package com.codewithdilan.librarymanagement.service;

import com.codewithdilan.librarymanagement.model.User;
import com.codewithdilan.librarymanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}