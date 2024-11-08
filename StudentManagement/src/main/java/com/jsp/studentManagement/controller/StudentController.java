package com.jsp.studentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.studentManagement.entity.Student;
import com.jsp.studentManagement.service.StudentService;

@RestController
@RequestMapping("/student") 
public class StudentController {
  
	@Autowired
	StudentService studentservice;
	@GetMapping("/get")
	public List<Student> getAllStudents()
	{
		return studentservice.getAllStudents();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id)
	{
		Student student=studentservice.getStudentById(id);
		return ResponseEntity.ok(student);
	}
	@PostMapping("/save")
	public Student createStudent(@RequestBody Student student)
	{
		
		return  studentservice.saveStudent(student);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Student>updateStudent(@PathVariable int id,@RequestBody Student updatestudent)
	{
		Student student=studentservice.updateStudent(id, updatestudent);
		return student!=null?ResponseEntity.ok(student):ResponseEntity.badRequest().body(null);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>deleteStudent(@PathVariable int id)
	{
		studentservice.deleteStudent(id);
		return ResponseEntity.noContent().build();
	}
}
