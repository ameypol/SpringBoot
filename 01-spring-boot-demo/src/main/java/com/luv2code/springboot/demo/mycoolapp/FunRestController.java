package com.luv2code.springboot.demo.mycoolapp;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	//expose / to return hello world
	@GetMapping("/")
	public String sayhello() {
		return "hello world tome is" + LocalDateTime.now();
	}
}
