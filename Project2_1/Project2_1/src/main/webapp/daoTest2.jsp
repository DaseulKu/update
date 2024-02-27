<%@page import="dao.MemberDao"%>
<%@page import="connection.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Connection conn = ConnectionProvider.getConnection();
MemberDao dao = MemberDao.getInstance();
System.out.println(dao.selectAll(conn));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>