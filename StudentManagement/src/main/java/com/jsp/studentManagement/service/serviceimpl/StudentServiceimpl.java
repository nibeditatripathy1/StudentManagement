package com.jsp.studentManagement.service.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.studentManagement.entity.Student;
import com.jsp.studentManagement.repository.StudentRepository;
import com.jsp.studentManagement.service.StudentService;
import com.jsp.studentManagementexceptionHandler.StudentNotFoundException;
@Component
public class StudentServiceimpl implements StudentService {
	@Autowired
	StudentRepository studentrepository;


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentrepository.findAll();
			}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentrepository.findById(id).orElseThrow(()->new StudentNotFoundException("Student not found with ID:"+id));
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

	@Override
	public Student updateStudent(int id, Student updateStudent) {
		// TODO Auto-generated method stub
		Student student=studentrepository.findById(id).orElseThrow(()->new StudentNotFoundException("Student not found with ID:"+id));
		student.setName(updateStudent.getName());
		student.setCourse(updateStudent.getCourse());
		return studentrepository.save(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		Student student=studentrepository.findById(id).orElseThrow(()->new RuntimeException("id is not found"));
		studentrepository.deleteById(id);
	}

}
