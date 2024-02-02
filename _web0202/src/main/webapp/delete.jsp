<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
String sql = "delete from score where num = ?";
try (Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	PreparedStatement pstmt = conn.prepareStatement(sql);) {
	pstmt.setInt(1,Integer.parseInt(request.getParameter("num")));
	pstmt.executeUpdate();
}catch (Exception e) {
	e.printStackTrace();
}
response.sendRedirect("list.jsp");
%>
</body>
</html>