package yk.book.springExam2018.service;

import yk.book.springExam2018.vo.BookResouce;

public interface BookService {

	public BookResouce find(String bookId) throws Exception;
	
}
