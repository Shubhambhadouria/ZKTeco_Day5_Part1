package com.zkteco.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zkteco.entity.Guardian;
import com.zkteco.entity.Student;

@SpringBootTest
class StudentRepositoryTest {

	@Autowired
	StudentRepository studentRepository;

//	@Test
//	public void saveStudent() {
//		Student student = Student.builder()
//				.emailId("shubh145@gmail.com")
//				.firstName("Shubham")
//				.lastName("Singh")
////				.guardianName("Nihil")
////				.guardianPhone("7974003538")
////				.guardianEmail("guardian@gmail.com")
//				.build();
//		
//		studentRepository.save(student);
//	}
	
	@Test
	public void saveStudentWithGuardian() {
		
		Guardian guardian = Guardian.builder()
				.email("nikh@gmail.com")
				.name("Nikhil")
				.phone("7974223538")
				.build();
		
		Student student = Student.builder()
				.firstName("Shubham")
				.emailId("s8997458948@gmail.com")
				.lastName("Kumar")
				.guardian(guardian)
				.build();
		
		studentRepository.save(student);
		
	}
	
	@Test
	public void printAllStudents() {
		List<Student> studentList = studentRepository.findAll();
	}
	
	@Test
	public void printStudentByFirstName() {
		List<Student> students = 
				studentRepository.findByFirstName("Shivam");
		System.out.println(students);
	}
	
	@Test
	public void printStudentByFirstNameContaining() {
		List<Student> students = 
				studentRepository.findByFirstNameContaining("hi");
		System.out.println(students);
	}
	
	@Test
	public void printStudentByFirstNameAndLastName() {
		List<Student> students = 
				studentRepository.findByFirstNameAndLastName("Shivam", "Gumar");
		System.out.println(students);
	}
	
	@Test
	public void printStudentByEmail() {
		List<Student> students = 
				studentRepository.findByFirstNameAndLastName("Shivam", "Gumar");
		System.out.println(students);
	}
}
