package com.studentManagementSystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> handleRuntimeException(StudentNotFoundException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
	            .body("Error: " + ex.getMessage());
	}
	
@ExceptionHandler(RuntimeException.class)
public ResponseEntity<String> handleRuntimeException(RuntimeException ex){
	return ResponseEntity.badRequest().body("Error:"+ex.getMessage());
}
@ExceptionHandler(Exception.class)
public ResponseEntity<String>handleCheckedException(Exception ex){
	return ResponseEntity.internalServerError().body("something went wrong(check the url path or any error in code)");
}


}
