<%@page import="m_dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

<%
	Member member = (Member)session.getAttribute("member");
	if (member != null) {
%>
	<form action="logout.jsp" method="post">
		<%=member.getName()%>님 로그인
		<input type="submit" value="로그아웃">
		<input type="button" value="회원정보 수정" 
			   onclick="window.open('member_update_form.jsp', 'popup', 'width=400, height=200')">
	</form>
<%
	} else {
%>
	<form action="login.jsp" method="post">
		아이디: <input type="text" name="id">&nbsp;&nbsp; 
		이메일: <input type="text" name="pw"> 
			  <input type="submit" value="로그인">
			  <input type="button" value="회원가입" 
			   		 onclick="window.open('member_join_form.jsp', 'popup', 'width=400, height=200')">
	</form>
<%
	}
%>
</body>
</html>