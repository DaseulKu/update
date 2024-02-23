<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
String sql = "select * from member";
PreparedStatement pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>List</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Home</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
		</div>
	</nav>
	<div class="container" style="padding-top: 50px">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th scope="col">MemberNo</th>
					<th scope="col">ID</th>
					<th scope="col">Email</th>
					<th scope="col">Name</th>
					<th scope="col">Update</th>
				</tr>
			</thead>
			<tbody>
<%
while (rs.next()) {
%>
				<tr>
					<th scope="row"><%=rs.getInt("memberno")%></th>
					<td><%=rs.getString("id")%></td>
					<td><%=rs.getString("email")%></td>
					<td><%=rs.getString("name")%></td>
					<td><a href="updateForm.jsp?memberno=<%=rs.getInt("memberno")%>">Update</a></td>
					<td><button class="btn btn-outline-secondary" 
								onClick='location.href="memberDelete.jsp?memberno=<%=rs.getInt("memberno")%>"'>Delete</button></td>
				</tr>
<%
}
%>								
			</tbody>
		</table>
		<button class="btn btn-outline-secondary" onClick="move()">CreateNew</button>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
	<script>
		function move() {
			//alert("경고창");
			location.href="memberForm.jsp";
			
		}
	</script>

</body>
</html>