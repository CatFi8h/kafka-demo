package com.example.kafkademo.web;

import com.example.kafkademo.model.User;
import com.example.kafkademo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class UserController {

    @Autowired
    private  UserRepository userRepository;

    @GetMapping("users")
    public List<User> getAllUsers() {
        List<User> all = userRepository.findAll();
        return all;
    }
}
