package com.shahzad.management.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.shahzad.management.model.User;
import com.shahzad.management.repo.UserRegistrationDto;

public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
}
