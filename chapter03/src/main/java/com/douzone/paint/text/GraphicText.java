package com.douzone.paint.text;

import com.douzone.paint.i.Drawable;

public class GraphicText implements Drawable {
	private String text;
	
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public GraphicText(String text) {
		this.text = text;
	}
	
	public void draw() {
		System.out.println(text+"를 그렸습니다.");
	}

}
