package yk.book.springExam2018.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import yk.book.springExam2018.vo.EchoForm;

@Controller
@RequestMapping("echo")
public class EchoController {

	public static final String type = "application/json;charset=utf-8";
	private static final Logger logger = LoggerFactory.getLogger(EchoController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res) throws Exception {
		logger.info("viewInput");
		EchoForm form = new EchoForm();
		model.addAttribute(form);
		return "echo/input";
	}
	
	
	
	
	
}//.class
