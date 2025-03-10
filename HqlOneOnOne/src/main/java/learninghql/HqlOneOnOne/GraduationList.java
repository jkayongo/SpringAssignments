package learninghql.HqlOneOnOne;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class GraduationList {
	static Configuration configuration;
	static SessionFactory sef;
	static Session session;
	static Transaction transaction;
	public static void configuration() {
		configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sef = configuration.buildSessionFactory();
		session = sef.openSession();
	    transaction = session.beginTransaction();
	}
	//method selecting all students from GraduationBook.
	public static void selectAllHqlQuery() {
		configuration();
		Query<GraduationBook> query = session.createQuery("FROM GraduationBook", GraduationBook.class);
		List<GraduationBook> students = query.list();
		for(GraduationBook student : students) {
			System.out.println(student.getStudentId() + " " + student.getStudentName() + " " + student.getAge() + " " + student.getDegree() + " " + student.getGrade());
	}
		transaction.commit();
		session.close();
		}
	//method filtering students whose grade is first class
	public static void filterByFirstClass() {
		configuration();
		Query<GraduationBook> firstClassStudentsQuery = session.createQuery("FROM GraduationBook WHERE grade = 'First class' ", GraduationBook.class);
		List<GraduationBook> firstClassStudents = firstClassStudentsQuery.list();
		for(GraduationBook firstClassStudent : firstClassStudents) {
			System.out.println("Student name: " + firstClassStudent.getStudentName() + " " + "Degree:" + firstClassStudent.getDegree());
		}
		transaction.commit();
		session.close();
	}
	//order students by age
	public static void orderByAge() {
		configuration();
		Query<GraduationBook> orderByAgeQuery = session.createQuery("FROM GraduationBook ORDER BY age DESC", GraduationBook.class);
		List<GraduationBook> graduates = orderByAgeQuery.list();
		for(GraduationBook graduate : graduates) {
			System.out.println(graduate.getStudentName() + " " + graduate.getDegree() + " " + graduate.getAge());
		}
		transaction.commit();
		session.close();
	}
	//pagination
	//select all from GraduationBook,but start with the record at the position specified and get us only 5 records.
	public static void fiveRecordsPerLoad() {
		configuration();
		int positionOfTheFirstRecord = 2;
		int recordLimit = 5;
		Query<GraduationBook> recordsQuery = session.createQuery("FROM GraduationBook", GraduationBook.class);
		recordsQuery.setFirstResult((positionOfTheFirstRecord - 1 ) * recordLimit);// 
		recordsQuery.setMaxResults(recordLimit);
		List<GraduationBook> records = recordsQuery.list();
		for(GraduationBook record : records) {
			System.out.println(record.getStudentName() + " " + record.getGrade());
		}
		transaction.commit();
		session.close();
		
	}
	//parametarized query: getting students by their Degree
	public static void getStudentsByDegree(String degreeProgram) {
		configuration();
		Query<GraduationBook> studentsByCourseQuery = session.createQuery("From GraduationBook WHERE degree = :studentDegree", GraduationBook.class);
		studentsByCourseQuery.setParameter("studentDegree", degreeProgram);
		List<GraduationBook> studentsForThisDegree = studentsByCourseQuery.list();
		for(GraduationBook individualStudent :  studentsForThisDegree) {
			System.out.println(individualStudent.getStudentName() + " " + individualStudent.getDegree() + " " + individualStudent.getGrade());
		}
		
	}

	public static void main(String[] args) {
		//getting students from Graduation_book table in the db.
		//selectAllHqlQuery();
		//filterByFirstClass();
		//orderByAge();
		//fiveRecordsPerLoad();
		//getStudentsByDegree("data science");
		
		
		}


	}


