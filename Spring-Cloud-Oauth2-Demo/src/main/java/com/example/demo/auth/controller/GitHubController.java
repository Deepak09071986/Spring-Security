package com.example.demo.auth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubController {
    
	@GetMapping("/")
	public String getMessage(Principal principle) {
		return "Hi " + principle.getName() + " Welcome to my site ";
	}
}
