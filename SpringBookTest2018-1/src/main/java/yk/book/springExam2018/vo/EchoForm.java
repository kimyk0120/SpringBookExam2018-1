package yk.book.springExam2018.vo;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class EchoForm implements Serializable{

	private static final long serialVersionUID = 1115232259783191726L;
	
	@NotEmpty
	@Size(max=100)
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
