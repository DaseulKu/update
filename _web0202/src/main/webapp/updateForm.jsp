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
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
String sql = "select name,kor,eng,math from score where num = ?";
	try (Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();) {
		pstmt.setInt(1,Integer.parseInt(request.getParameter("num")));
		int num = 0;
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		if(rs.next()){
			num = rs.getInt("num");
			name = rs.getString("name");
			kor = rs.getInt("kor");
			eng = rs.getInt("eng");
			math = rs.getInt("math");
		}%>
<a href="list.jsp">사원목록</a>
<form action="update.jsp">
번호 <input type="text" name="num" value=<%=num%> /><br/>
이름 <input type="text" name="name" value="<%=name%>"/><br/>
국어 <input type="text" name="kor" value=<%=kor%>/><br/>
영어 <input type="text" name="eng" value=<%=eng%>/><br/>
수학 <input type="text" name="math" value=<%=math%>/><br/>
<input type="submit" value="확인"/>
<input type="reset"/>
</form>
<%}catch (Exception e) {
	e.printStackTrace();
}
%>
</body>
</html>