package com.aadi.boot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.aadi.boot.controller.dto.UserRegistrationDto;
import com.aadi.boot.model.User;

public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);

}
