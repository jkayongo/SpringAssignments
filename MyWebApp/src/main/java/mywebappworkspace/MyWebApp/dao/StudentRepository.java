package mywebappworkspace.MyWebApp.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mywebappworkspace.MyWebApp.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	Optional<Student> findStudentByEmail(String email);

}
