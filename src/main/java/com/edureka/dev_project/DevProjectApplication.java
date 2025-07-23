package com.edureka.dev_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevProjectApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "<h1>Hello There!!! Welcome to my project</h1>";
	}

	
	@GetMapping("/inbox")
	public String inbox() {
		return "<h1>This is the inbox module</h1>";
	}
}
