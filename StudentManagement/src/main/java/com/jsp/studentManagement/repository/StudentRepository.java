package com.jsp.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.studentManagement.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
