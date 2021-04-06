<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp방식 구구단</h1>
	<%
		// getParameter로 문자열을 받아와서 받아온 문자열을 (static 메소드)Integer.parseInt(static은 클래스 이름으로 호출)로 int로 형 변환한다.
		int dan = Integer.parseInt(request.getParameter("dan"));
		// 디버깅 (출력 되는지 확인)
		System.out.print(dan+"<--dan");
		// 반복문
		for(int i=1; i<10; i++) { // i가 10보다 작을때 까지 반복
	%>
			<div><%=dan%>*<%=i%>=<%=dan*1 %></div>
	<%
			
		}
	%>
</body>
</html>