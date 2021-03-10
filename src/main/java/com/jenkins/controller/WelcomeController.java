package com.jenkins.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

//	@GetMapping
//	public ResponseEntity<?> welcome() {
//		return ResponseEntity.ok("Welcome to LearnJenkins Maven Project");
//	}
	
	@GetMapping("/")
	public String welcomeHome(Model model) {
		model.addAttribute("name", "Ashish");
		return "welcome";
	}
}
