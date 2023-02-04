<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
      //1.JDBC Driver 로딩하기
      Class.forName("oracle.jdbc.driver.OracleDriver");
      //2.DB서버 접속하기
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      Connection conn = DriverManager.getConnection(url, "scott", "tiger");
      //3.Statement or PreparedStatmement 객체 생성하기
      Statement stmt = conn.createStatement();
      String id=request.getParameter("id");
      String pwd=request.getParameter("pwd");
      /* PreparedStatement pstmt = conn.prepareStatement("insert into test values(?,?)");
      pstmt.setString(1,id);
      pstmt.setString(2,pwd);
      pstmt.executeUpdate();
      */
      //4.SQL실행
      stmt.executeUpdate("create table test1 (id varchar2(5),pwd varchar(5))");
      stmt.executeUpdate("insert into test values('aa','11')");
      stmt.executeUpdate("insert into test values('bb','22')");
      stmt.executeUpdate("insert into test values('cc','33')");
      ResultSet rs = stmt.executeQuery("select *from test");
      while (rs.next()){
    	  out.print("<br>" + rs.getString("id")+":"+rs.getString(2));
      }
      rs.close();
      //5.자원해제
      stmt.close();
      conn.close(); //연결 해제
%>
ok