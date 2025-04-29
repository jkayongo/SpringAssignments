package mywebappworkspace.MyWebApp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mywebappworkspace.MyWebApp.dao.StudentRepository;
import mywebappworkspace.MyWebApp.model.Student;

@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student student1 = new Student(
					"jeremiahAchiri",
					"jachiri@gmail.com",
					LocalDate.of(1999, 3, 1)
					);
			Student student2 = new Student(
					"Cranmar Kyambadde",
					"ckyambadde@gmail.com",
					LocalDate.of(2000, 7, 9)
					);
			
			studentRepository.saveAll(
					List.of(student1, student2)
					);
			 List <Student> students = studentRepository.findAll();
			 for(Student student: students) {
				 System.out.println(student.getName() + " " + student.getEmail() + " " + student.getDateOfBirth() + " " + student.getAge());
			 }
			
		};
	}

}
