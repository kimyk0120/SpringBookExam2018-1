package yk.book.springExam2018.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import yk.book.springExam2018.vo.EchoForm;

@Controller
@RequestMapping("echo")
public class EchoController {

	public static final String type = "application/json;charset=utf-8";
	private static final Logger logger = LoggerFactory.getLogger(EchoController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) throws Exception {
		logger.info("viewInput");
		EchoForm form = new EchoForm();
		model.addAttribute(form);
		return "echo/input";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String viewInput(@Valid EchoForm form, BindingResult result) throws Exception {
		// BindingResult 참고 :  https://okky.kr/article/341115 , http://springsource.tistory.com/18
		
		logger.info("viewInputPOST");	
		
		if(result.hasErrors()){
			return "echo/input";
		}
		return "echo/output";
	}
	
	
	
	
	
}//.class
