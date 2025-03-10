package learningsingletonscope.LearningSpringScope;

public class Student {
	int studentId;
	String studentName;
	String course;
	
	

	public Student(int studentId, String studentName, String course) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
