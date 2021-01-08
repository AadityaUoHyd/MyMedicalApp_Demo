package com.aadi.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aadi.boot.controller.dto.UserRegistrationDto;
import com.aadi.boot.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	private UserService userService;	

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")   //Thymeleaf gets user obj from here
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	//This also works.
	/* 
	
	@GetMapping
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new UserRegistrationDto());
		return "registration";
	}
	
	*/
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}

}