package com.edu.customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport {
	int cnt = 1;

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println("시작 태그를 만났습니다.");
		System.out.println("color 속성값 " + color);
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doAfterBody() throws JspException {
		System.out.println("body ó���� �������ϴ�. : " + cnt);
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		System.out.println("���±׸� �������ϴ�.");
		return EVAL_PAGE;
	}

}
