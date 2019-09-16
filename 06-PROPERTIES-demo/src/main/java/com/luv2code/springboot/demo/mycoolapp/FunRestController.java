package com.luv2code.springboot.demo.mycoolapp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	//inject properties form appliction file
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	//expose / to return hello world
	@GetMapping("/")
	public String sayhello() {
		return "hello world tome is" + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "run 5 k";
	}
	
	@GetMapping("/fortune")
	public String getfortune() {
		return "Today is your lucky day";
	}
	
	@GetMapping("/teaminfo")
	public String getteaminfo() {
		return "Coach name "+ coachName + " team name: " + teamName;
	}
}
