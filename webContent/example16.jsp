<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>include</title>
</head>
<body>
	<%@ include file = "test.jsp" %>
	<h3>-- include 전 --</h3>
	<jsp:include page="test.jsp" />
	<h3>-- include 후 --</h3>
</body>
</html>