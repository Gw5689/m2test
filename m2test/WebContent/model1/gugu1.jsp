<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="m1.model.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 1. 요청 분석
		int dan = Integer.parseInt(request.getParameter("dan"));
	%>
	
	<%
		// 2. 요청 처리 (모델에 필요한 자원들 = Model Layer)
			// 생성자 , m1.model 패키지에 있는 GuguService (list를 리턴 받는다.)
		GuguService service = new GuguService();
		ArrayList<String> list = service.getGuguDan(dan); // 처리결과 -> 모델
	%>
	
	<%
		// 3. 출력
		for(String s : list) {// for each문
	%>
		<div><%=s %></div>
	<%		
		}
	%>
</body>
</html>