package yk.book.springExam2018.service;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import yk.book.springExam2018.vo.BookResouce;

@Service
public class BookServiceImpl implements BookService {

	private final Map<String,BookResouce > bookrepo = new ConcurrentHashMap<>();
	
	@PostConstruct
	public void loadDummyData(){
		System.out.println("loadDummyData");
		BookResouce resource = new BookResouce();
		resource.setBookId("111");
		resource.setName("bNm");
		resource.setPublishedDate(LocalDate.now());
		bookrepo.put(resource.getBookId(), resource);
	}
	
	
	@Override
	public BookResouce find(String bookId) throws Exception {
		BookResouce resource = bookrepo.get(bookId);
		return resource;
	}

	
	
}//.class




//endDoc