package com.pavel.springeshop.service;

import com.pavel.springeshop.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {//security
    boolean save(UserDTO userDTO);
}
