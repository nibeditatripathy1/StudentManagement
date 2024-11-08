package com.jsp.studentManagementexceptionHandler;

public class StudentNotFoundException extends RuntimeException{
 public StudentNotFoundException(String message)
 {
	 super(message);
 }
}
