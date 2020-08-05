package com.springbootapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@SpringBootApplication
public class SpringbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootappApplication.class, args);
	}
	
	@GetMapping
	public String home() {
		return "Welcome to AWS!";
	}

}
