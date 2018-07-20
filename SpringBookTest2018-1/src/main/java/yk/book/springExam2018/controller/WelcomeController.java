package yk.book.springExam2018.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import yk.book.springExam2018.service.WelcomeService;
import yk.book.springExam2018.vo.EchoForm;

@Controller
@RequestMapping("welcome")
public class WelcomeController {

	public static final String type = "application/json;charset=utf-8";
	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@Autowired
	WelcomeService service;
	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String home(Locale locale, Model model, BindingResult bindResult, HttpServletRequest req, HttpServletResponse res) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		res.setContentType(type);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "index";
	}
	
	
	// PathVariable
	@RequestMapping(value = "pathVarTest/{id}", method = RequestMethod.GET)
	public String pathVarTest(@PathVariable String id
			, @RequestParam(value="format",required=true) String formatStr
			) throws Exception {
		logger.info("id : " + id);
		logger.info("formatStr : " + formatStr);
		return "index";
	}
	
	@InitBinder
	public void initBinfer(WebDataBinder binder) {
		binder.addCustomFormatter(new DateFormatter("yyyyMMdd"),"targetDate");
	}
	
	// RedirectAttributes
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String redirectAttributes(RedirectAttributes redirectAttributes 
			) throws Exception {
		redirectAttributes.addFlashAttribute("test", "test addFlashAttribute");
		return "redirect:redirectReception?test";
	}

	@RequestMapping(value = "redirectReception", method = RequestMethod.GET,params={"test"})
	public String getRedirectAttributes() throws Exception { 
		return "index";
	}
	
	
	
	
	
}//.class
