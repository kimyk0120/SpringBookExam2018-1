package yk.book.springExam2018.vo;

import java.io.Serializable;

public class EchoForm implements Serializable{

	private static final long serialVersionUID = 1115232259783191726L;
	
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
