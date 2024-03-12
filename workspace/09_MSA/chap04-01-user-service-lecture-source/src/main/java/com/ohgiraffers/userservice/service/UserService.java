package com.ohgiraffers.userservice.service;

import com.ohgiraffers.userservice.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void registUser(UserDTO userDTO);

    UserDTO getUserDetailsByEmail(String email);

    UserDTO getUserById(String id);
}
