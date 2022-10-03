package com.masai.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionsHandler {
   
	public String tutorialExceptionHandler(TutorialException tutorialException){
		return tutorialException.getMessage();
		
	}
}
