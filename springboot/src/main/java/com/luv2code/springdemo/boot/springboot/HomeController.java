package com.luv2code.springdemo.boot.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	private String setMapping() {
		return "hello world";
	}
	
	
	
}
