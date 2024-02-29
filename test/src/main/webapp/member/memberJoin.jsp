<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
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
	if (member != null && member.getId().equals(id)) {
	%>
	<script>
		alert('이미 등록된 아이디입니다.');
		history.back()
	</script>
	<%
	}else if (member == null) {
	Member member1 = new Member(request.getParameter("id"), request.getParameter("email"), request.getParameter("name"));
	MemberDao.getInstance().insert(member1);
	%>
	<script>
		alert('가입이 완료되었습니다.');
		window.close();
		window.location.href = 'loginForm.jsp';
	</script>
	<%
	}
	%>

</body>
</html>