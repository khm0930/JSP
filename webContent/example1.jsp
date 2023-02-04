<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String user = request.getParameter("name");
		if(user==null)
			user= "Guest";
	%>
	 <%-- <%이안의 내용이 코드가 그대로 삽입 %> --%>
	<h1>
		Hello
		<%=user %>! <!-- out 프린트로 변환되어 자바코드에 삽입 -->
	</h1>
</body>
</html>