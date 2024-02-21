<%@page import="m_dto.Member"%>
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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						href="main_page.jsp" aria-current="page">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Dropdown </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Something else here</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link disabled" aria-disabled="true">Disabled</a></li>
				</ul>
				<form class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
					<button class="btn btn-outline-primary" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>
	<form action="login.do" method="post">
		<div class="container text-center" style="padding-top: 50px;">
			<h1 class="h3 mb-3 fw-normal">${member.name} 님이 로그인 되었습니다</h1>
			<div class="d-grid gap-2 justify-content: flex-start mx-auto col-6 mx-auto">
				<button type="submit" class="btn btn-outline-primary" onclick="location.href='logout.do'">Logout</button>
				<button type="button" class="btn btn-outline-primary" onclick="location.href='member_update_form.jsp'">Update</button>
				<button type="button" class="btn btn-outline-primary" onclick="location.href='list.do'">List</button>
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