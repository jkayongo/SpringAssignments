package onetomanyrelationship;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		//create an economics student.
		EconomicsStudent student = new EconomicsStudent();
		student.setStudentName("Nakanwagi Vanesa");
		student.setStudentCourse("Development Economics");
		//create the student's course unit and give it to her.
		CourseUnits courseUnits = new CourseUnits();
		courseUnits.setCourseUnit1("Micro economics");	
		courseUnits.setCourseUnit2("Macro economics");
		courseUnits.setCourseUnit3("Political economy");
		courseUnits.setCourseUnit4("Sociology");
		courseUnits.setCourseUnit5("Business communication skills");
		courseUnits.setCourseUnit6("Mathematical economics");
		courseUnits.setStudent(student);
		
		
		CourseUnits myCourseUnits = new CourseUnits();
		myCourseUnits.setCourseUnit1("Entreprenuership");	
		myCourseUnits.setCourseUnit2("Research methods");
		myCourseUnits.setCourseUnit3("Public Policy");
		myCourseUnits.setCourseUnit4("Rural finance");
		myCourseUnits.setCourseUnit5("Welfare economics");
		myCourseUnits.setCourseUnit6("Environmental economics");
		myCourseUnits.setStudent(student);
		//add course units to the student's list
//		student.getCourseunits().add(0, courseUnit1);
//		student.getCourseunits().add(1, courseUnit2);
		List<CourseUnits> courseunits = new ArrayList<>();
		courseunits.add(courseUnits);
		courseunits.add(myCourseUnits);
		student.setCourseunits(courseunits);
		Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sef = configuration.buildSessionFactory();
        Session session = sef.openSession();
        Transaction transaction = session.beginTransaction();
        //we persist student.
        session.persist(student);
        transaction.commit();
        session.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
