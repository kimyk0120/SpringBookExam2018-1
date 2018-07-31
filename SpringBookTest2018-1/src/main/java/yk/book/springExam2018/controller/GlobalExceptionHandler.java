package yk.book.springExam2018.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice 
public class GlobalExceptionHandler {

		
		@ExceptionHandler
		public String handleException(Exception e,Model model){
			model.addAttribute("errMsg", e.getMessage());
			return "/error/systemError";
		}
		
		
		
		
	
}//.class












//endDom
