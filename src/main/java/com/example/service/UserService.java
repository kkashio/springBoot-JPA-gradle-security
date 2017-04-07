package com.example.service;

import com.example.model.User;

/**
 * Created by Je.vinci.Inc. on 2017. 4. 6..
 */
public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
