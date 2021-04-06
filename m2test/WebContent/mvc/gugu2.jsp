<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<String> list = (ArrayList<String>)(request.getAttribute("list")); // GuguServlet에서 받아온 Object값을 ArrayList로 형 변환
	for(String s : list) {
%>
	<div><%=s %></div>
<%		
	}
%>
</body>
</html>