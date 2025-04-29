package mywebappworkspace.MyWebApp.model;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
@Table(name = "students", schema = "jkdatabase")
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private LocalDate dateOfBirth;
	@Transient
	//we are now saying age should not appear in our database
	private int age;
	
	public Student() {
		
	}
	
	
	public Student(Long id, String name, String email, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		
	}


	public Student(String name, String email, LocalDate dateOfBirth) {
		
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public int getAge() {
		if(this.dateOfBirth == null) {
			throw new IllegalStateException("Date of birth does not exist" + " " + this.name);
		}
		return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
	}


//	public void setAge(int age) {
//		this.age = age;
//	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", age="
				+ age + "]";
	}
	
	
	

}
