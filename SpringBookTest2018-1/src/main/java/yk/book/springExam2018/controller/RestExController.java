package yk.book.springExam2018.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import yk.book.springExam2018.service.BookService;
import yk.book.springExam2018.vo.BookResouce;

@RestController
@RequestMapping("books")
public class RestExController {

	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "{bookId}", method = RequestMethod.GET)
	@ResponseBody
	public BookResouce getBook(@PathVariable String bookId) throws Exception{
		System.out.println("test ," +bookId);
		BookResouce resouce = bookService.find(bookId);
		
		return resouce;
	} 
	
	
	
}//.class












//endDom
