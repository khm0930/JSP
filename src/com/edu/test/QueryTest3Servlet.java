package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/queryTest3")
public class QueryTest3Servlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>GET 방식으로 요청 되었습니다.</h1>");

		String name = req.getParameter("name");
		System.out.println(name);
		out.print("이름 : " + name + "<br/>");

		out.println("</body></html>");
		out.close();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8"); 
		//resp 객체는 서버에서 클라이언트로 보내는 응답에 관한 기능을 처리 (응답)
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>질의 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>POST 방식으로 요청 되었습니다.</h1>");

		req.setCharacterEncoding("UTF-8");//한글을 처리해주는 메소드
		//req 객체는 클라이언트가 보낸 정보를 서버쪽에서 처리 할때 (요청)
		String name = req.getParameter("name");
		out.print("이름 : " + name + "<br/>");

		out.println("</body></html>");
		out.close();
	}
}
