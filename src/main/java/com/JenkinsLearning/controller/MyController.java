package com.JenkinsLearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome to .war deployment-> it worked yrr";
	}

}
