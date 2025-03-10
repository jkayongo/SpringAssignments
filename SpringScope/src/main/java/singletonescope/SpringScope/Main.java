package singletonescope.SpringScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student1 = context.getBean(Student.class);
		System.out.println( student1.getStudentId() + " " + student1.getStudentName() + " " + student1.getCourse());

	}

}
