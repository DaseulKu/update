<%@page import="m_dao.MemberDao"%>
<%@page import="m_dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	Member member = MemberDao.getInstance().select(id);
	if (member != null) {
	%>
	<script>
		alert('이미 등록된 아이디입니다.');
		history.back()
	</script>
	<%
	} else {
	Member member1 = new Member(request.getParameter("id"), request.getParameter("pw"), request.getParameter("name"));
	MemberDao.getInstance().insert(member1);
	%>
	<script>
		alert('가입이 완료되었습니다.');
		window.close();
	</script>
	<%
	}
	%>
</body>
</html>