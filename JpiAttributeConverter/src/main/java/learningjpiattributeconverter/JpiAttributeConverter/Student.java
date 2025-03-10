package learningjpiattributeconverter.JpiAttributeConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students_table", schema = "kayongosdb")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id", length = 50, nullable = false, unique = false)
	private int studentId;
	@Column(name = "student_name", length = 50, nullable = false, unique = false)
	private String studentName;
	@Column(name = "course", length = 50, nullable = false, unique = false)
	private String course;
	@Convert(converter = ContactConverter.class)
	private Contact contact;
	

	public Student(String studentName, String course, Contact contact) {
		super();
		this.studentName = studentName;
		this.course = course;
		this.contact = contact;
	}
	public Student() {
		
	}

	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}


	public static void main(String[] args) {
		

	}

}
