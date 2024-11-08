package com.jsp.studentManagementexceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> handleStudentNotfoundException(StudentNotFoundException ex){
	  return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
  }
}
