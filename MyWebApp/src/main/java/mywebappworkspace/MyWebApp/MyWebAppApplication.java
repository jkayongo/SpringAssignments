package mywebappworkspace.MyWebApp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mywebappworkspace.MyWebApp.model.Student;

@SpringBootApplication
@RestController
public class MyWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppApplication.class, args);
	}
	
//	@GetMapping
//	public String hello() {
//		return "Welcome to software engineering with Spring boot!";
//	}
	

}
