<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">처음으로</a>
<form action="insert.jsp" method="post">
사원이름: <input type="text" name="ename" /><br/>
사원직책: <input type="text" name="job" /><br/>
사원급여: <input type="text" name="sal" /><br/>
<input type="submit" value="확인">
<input type="reset">
</form>
</body>
</html>