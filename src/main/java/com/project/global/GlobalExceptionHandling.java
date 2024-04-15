package com.project.global;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
//	@ExceptionHandler(value=NoNameException.class)
//	public ResponseEntity<Object> nameException(NoNameException na){
//		return new ResponseEntity<>("Error!!!!!!",HttpStatus.NOT_FOUND);
//	}
	@ExceptionHandler(value=ExperienceException.class)
	public ResponseEntity<Object> ageException(ExperienceException na){
		return new ResponseEntity<>("No one with this Experience is found",HttpStatus.NOT_FOUND);
	}

}
