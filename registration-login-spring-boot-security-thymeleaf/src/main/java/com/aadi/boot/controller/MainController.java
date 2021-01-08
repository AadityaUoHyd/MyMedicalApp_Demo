package com.aadi.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/dental")
	public String dental() {
		return "dental";
	}
	
	@GetMapping("/cardio")
	public String cardio() {
		return "cardio";
	}
	
	@GetMapping("/veterinary")
	public String veterinary() {
		return "veterinary";
	}

}