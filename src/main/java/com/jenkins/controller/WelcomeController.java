package com.jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

	@GetMapping
	public ResponseEntity<?> welcome() {
		return ResponseEntity.ok("Welcome to LearnJenkins Maven Project");
	}
	
	@GetMapping("/home")
	public String welcomeHome() {
		return "welcome";
	}
}
