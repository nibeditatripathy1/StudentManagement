package com.jsp.studentManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jsp.studentManagement.entity.Student;
@Service
public interface StudentService {

	List<Student>getAllStudents();
	 Student getStudentById(int id);
	Student saveStudent(Student student);
	Student updateStudent(int id,Student updateStudent);
	void deleteStudent(int id);
}
