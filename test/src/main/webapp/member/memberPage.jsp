<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>회원페이지</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">
<link rel="stylesheet" href="../assets/dist/css/bootstrap.min.css">
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="mainPage.jsp">홈</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
					data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" 
					aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
		</div>
	</nav>
	<form action="login.do" method="post">
		<div class="container text-center" style="padding-top: 50px;">
			<h1 class="h3 mb-3 fw-normal">안녕하세요</h1>
			<div class="d-grid gap-2 justify-content: flex-start mx-auto col-6 mx-auto">
				<button type="submit" class="btn btn-outline-primary" 
						onclick="location.href='logout.do'">로그아웃</button>
				<button type="button" class="btn btn-outline-primary" 
						onclick="location.href='member_update_form.jsp'">정보수정</button>
			</div>
		</div>
	</form>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
			crossorigin="anonymous"></script>
</body>
</html>