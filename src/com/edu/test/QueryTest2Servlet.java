package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/queryTest2") //POST 방식의 전체 문자열 추출 코드
public class QueryTest2Servlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>Post 방식 질의 문자열 추출</h1>");
		ServletInputStream input = req.getInputStream();
		//요청 정보의 몸체와 서블릿 프로그램 간에 연결된 입력스트림을 생성하여 반환
		int len = req.getContentLength(); //몸체에 담겨있는 문자열의 길이
		byte[] buf = new byte[len]; //바이트배열을 메모리에 생성
		input.readLine(buf, 0, len); //input입력 스트림으로부터 줄 단위로 데이터를 읽어 들임
		String s = new String(buf); //버프배열의 데이터를 string 타입으로 새로 생성
		out.print("전체 문자열 : " + s); 
		out.println("</body></html>");
		out.close();
	}
}