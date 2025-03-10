package onetomanyrelationship;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Economics_students", schema = "kayongosdb")
public class EconomicsStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", length = 50, nullable = false, unique = false)
	private int id;
	@Column(name = "Student_name", length = 50, nullable = false, unique = false)
	private String studentName;
	@Column(name = "Student_course", length = 50, nullable = false, unique = false)
	private String studentCourse;
	@OneToMany(mappedBy = "student" , cascade = CascadeType.ALL)
	//one Student has many course units objects
	//student owns the relationship
	private List<CourseUnits> courseunits = new ArrayList<>(); //student's list
	
	
	public EconomicsStudent(String studentName, String studentCourse, List<CourseUnits> courseunits) {
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.courseunits = courseunits;
	}
	public EconomicsStudent() {
		
	}
	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public List<CourseUnits> getCourseunits() {
		return courseunits;
	}
	public void setCourseunits(List<CourseUnits> courseunits) {
		this.courseunits = courseunits;
	}
	public static void main(String[] args) {
		

	}

}
