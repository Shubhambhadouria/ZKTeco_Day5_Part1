package com.zkteco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zkteco.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByFirstName(String firstName);
	
	List<Student> findByFirstNameContaining(String name);
	
	List<Student> findByFirstNameAndLastName(String firstName, String lastName);
	
	@Query("select s from Student s where s.emailId=?1")
	Student getStudentByEmailAddress(String EmailId);
	
}
