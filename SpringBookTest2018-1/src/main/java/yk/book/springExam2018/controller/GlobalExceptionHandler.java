package yk.book.springExam2018.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice 
public class GlobalExceptionHandler {

		
		@ExceptionHandler
		@ResponseStatus(HttpStatus.NOT_FOUND)
		public String handleException(Exception e,Model model){
			
			model.addAttribute("errMsg", e.getMessage());
			return "/error/systemError";
		}
		
		
		
		
	
}//.class












//endDom
