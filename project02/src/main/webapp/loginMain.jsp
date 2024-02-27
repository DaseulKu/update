<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Member member = (Member)session.getAttribute("member");
	if (member != null) {
%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>LoginMain</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">
<link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="mainPage.jsp">Home</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>		
				<form class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
					<button class="btn btn-outline-secondary" type="submit">Search</button>
				</form>			
		</div>
	</nav>
	<form action="login.do" method="post">
		<div class="container text-center" style="padding-top: 50px;">
			<h1 class="h3 mb-3 fw-normal">Hello! "${member.name}"</h1>
			<div class="d-grid gap-2 justify-content: flex-start mx-auto col-6 mx-auto">
				<button type="submit" class="btn btn-outline-secondary" onclick="location.href='logout.do'">Logout</button>
				<button type="button" class="btn btn-outline-secondary" onclick="location.href='member_update_form.jsp'">Update</button>
			</div>
		</div>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
<%}%>
</body>
</html>