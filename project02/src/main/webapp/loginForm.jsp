<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String email = "";
Cookie[] cookies = request.getCookies();
if(cookies != null) {
	for(Cookie cookie : cookies) {
		if(cookie.getName().equals("email")) {
			email = cookie.getValue();
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="loginCkSave.jsp">
		ID			<input type="text" name="id">
		EMAIL		<input type="email" name="email" value="<%=email %>">
		remember me <input type="checkbox" checked name="remember">
					<input type="submit" value="login"> 
	</form>
</body>
</html>