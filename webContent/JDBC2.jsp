<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0"/>

<h2>JDBC드라이버 테스트 </h2>

<%
  Connection conn=null;

  try{
	 String jdbcUrl = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
     String dbId = "root";
     String dbPass = "mite";
	
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 conn = DriverManager.getConnection(jdbcUrl,dbId ,dbPass );
	 out.println("제대로 연결되었습니다.");
	 
	 	Statement stmt = conn.createStatement();
	 	stmt.executeUpdate("create table test(id varchar2(5),pwd varchar2(5))");
	 	stmt.close();
	 	conn.close();
  }catch(Exception e){ 
	 e.printStackTrace();
  }
%>