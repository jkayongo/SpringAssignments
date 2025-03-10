package com.example.MyFirstSpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleOwner {
	@GetMapping("/greet")
	public String welcomeToApiDev() {
		return "Hello world, welcome Joshua to the world of API development.";
	}
	

	public static void main(String[] args) {
		

	}

}
