package onetomanyrelationship;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Course_units", schema = "kayongosdb")
public class CourseUnits {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", length = 50, nullable = false, unique = false)
	private int id;
	@Column(name = "Course_unit1", length = 50, nullable = false, unique = false)
	private String courseUnit1;
	@Column(name = "Course_unit2", length = 50, nullable = false, unique = false)
	private String courseUnit2;
	@Column(name = "Course_unit3", length = 50, nullable = false, unique = false)
	private String courseUnit3;
	@Column(name = "Course_unit4", length = 50, nullable = false, unique = false)
	private String courseUnit4;
	@Column(name = "Course_unit5", length = 50, nullable = false, unique = false)
	private String courseUnit5;
	@Column(name = "Course_unit6", length = 50, nullable = false, unique = false)
	private String courseUnit6;
	@ManyToOne
	@JoinColumn(name = "Student_id", referencedColumnName = "id")
	private EconomicsStudent student;
	

	public CourseUnits(String courseUnit1, String courseUnit2, String courseUnit3, String courseUnit4,
			String courseUnit5, String courseUnit6, EconomicsStudent student) {
		this.courseUnit1 = courseUnit1;
		this.courseUnit2 = courseUnit2;
		this.courseUnit3 = courseUnit3;
		this.courseUnit4 = courseUnit4;
		this.courseUnit5 = courseUnit5;
		this.courseUnit6 = courseUnit6;
		this.student = student;
	}
	public CourseUnits() {
		
	}
	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseUnit1() {
		return courseUnit1;
	}
	public void setCourseUnit1(String courseUnit1) {
		this.courseUnit1 = courseUnit1;
	}
	public String getCourseUnit2() {
		return courseUnit2;
	}
	public void setCourseUnit2(String courseUnit2) {
		this.courseUnit2 = courseUnit2;
	}
	public String getCourseUnit3() {
		return courseUnit3;
	}
	public void setCourseUnit3(String courseUnit3) {
		this.courseUnit3 = courseUnit3;
	}
	public String getCourseUnit4() {
		return courseUnit4;
	}
	public void setCourseUnit4(String courseUnit4) {
		this.courseUnit4 = courseUnit4;
	}
	public String getCourseUnit5() {
		return courseUnit5;
	}
	public void setCourseUnit5(String courseUnit5) {
		this.courseUnit5 = courseUnit5;
	}
	public String getCourseUnit6() {
		return courseUnit6;
	}
	public void setCourseUnit6(String courseUnit6) {
		this.courseUnit6 = courseUnit6;
	}
	public EconomicsStudent getStudent() {
		return student;
	}
	public void setStudent(EconomicsStudent student) {
		this.student = student;
	}
	public static void main(String[] args) {
		

	}

}
