<%@page import="java.sql.ResultSet"%>
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
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "select * from score where num = ?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1,request.getParameter("num"));
ResultSet rs = pstmt.executeQuery();
String num = "";
String name = "";
String kor = "";
String eng = "";
String math = "";
if(rs.next()){ // num 이 프라이머리키라서 무조건 1행(혹은레코드)이라서 if 
	num = rs.getString("num");
	name = rs.getString("name");
	kor = rs.getString("kor");
	eng = rs.getString("eng");
	math = rs.getString("math");
}
%>
<a href="index.jsp">시작페이지</a>
<form action="update.jsp" method="post">
번호 <input type="text" name="num" value="<%=num%>"/><br/>
이름 <input type="text" name="name" value="<%=name%>"/><br/>
국어 <input type="text" name="kor" value="<%=kor%>"/><br/>
영어 <input type="text" name="eng" value="<%=eng%>"/><br/>
수학 <input type="text" name="math" value="<%=math%>"/><br/>
<button>수정</button>
</form>
<button onclick="location.href='delete.jsp?num=<%=num%>'">삭제</button>
</body>
</html>