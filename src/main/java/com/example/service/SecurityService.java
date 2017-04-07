package com.example.service;

/**
 * Created by Je.vinci.Inc. on 2017. 4. 6..
 */
public interface SecurityService {
    String findLoggedInUsername();
    void autologin(String username, String password);
}
