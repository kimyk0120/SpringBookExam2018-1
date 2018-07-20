package yk.book.springExam2018.vo;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class AccountCreateForm implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Size(min=1,max=50)
	private String name;
	
	@NotNull
	@Size(min=9,max=11)
	private String tel;
	
	@NotNull
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date dateOfBirth;
	
	@NotNull
	@Size(min=9,max=256)
	private String email;
	
	
	
}//.class
