<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.115.4">
<title>로그인</title>
<link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/sign-in/">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">
<link rel="stylesheet" href="../assets/dist/css/bootstrap.min.css">
<style>
body {
  height: 100%;
  background-color: white;
  display: flex;
  justify-content: center;
}

.form-signin {
  max-width: 330px;
  padding: 1rem;
}

.form-signin .form-floating:focus-within {
  z-index: 2;
}

.form-signin input[type="email"] {
  margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}

.form-signin input[type="text"] {
  margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}

.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.b-example-divider {
	width: 100%;
	height: 3rem;
	background-color: rgba(0, 0, 0, .1);
	border: solid rgba(0, 0, 0, .15);
	border-width: 1px 0;
	box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em
		rgba(0, 0, 0, .15);
}

.b-example-vr {
	flex-shrink: 0;
	width: 1.5rem;
	height: 100vh;
}

.bi {
	vertical-align: -.125em;
	fill: currentColor;
}

.btn-bd-primary {
	--bd-violet-bg: #712cf9;
	--bd-violet-rgb: 112.520718, 44.062154, 249.437846;
	--bs-btn-font-weight: 600;
	--bs-btn-color: var(--bs-white);
	--bs-btn-bg: var(--bd-violet-bg);
	--bs-btn-border-color: var(--bd-violet-bg);
	--bs-btn-hover-color: var(--bs-white);
	--bs-btn-hover-bg: #6528e0;
	--bs-btn-hover-border-color: #6528e0;
	--bs-btn-focus-shadow-rgb: var(--bd-violet-rgb);
	--bs-btn-active-color: var(--bs-btn-hover-color);
	--bs-btn-active-bg: #5a23c8;
	--bs-btn-active-border-color: #5a23c8;
}
</style>
</head>
<body class="d-flex align-items-center py-4">
	<main class="form-signin w-100 m-auto">
	<c:if test="${not empty sessionScope.successMessage}">
            <div style="color: green;">
                ${sessionScope.successMessage}
            </div>
            <c:set var="sessionScope.successMessage" value="" scope="session"/>
        </c:if>
		<form action="login.do" method="post">
			<img class="mb-4" src="../assets/brand/door-open.svg" alt="" width="72" height="57">
			<h1 class="h3 mb-3 fw-normal">로그인</h1>

			<div class="form-floating">
				<input type="text" name="id" class="form-control" id="floatingInput" placeholder="Id" required>
				<label for="floatingInput">아이디</label>
			</div>
			<div class="form-floating">
				<input type="email" name="email" class="form-control" id="floatingEmailInput" placeholder="id@example.com" required>
				<label for="floatingEmailInput">이메일</label>
			</div>
			<div class="form-check text-start my-3">
				<input class="form-check-input" type="checkbox" checked name="remember-me" value="remember-me" id="flexCheckDefault">
				<label class="form-check-label" for="flexCheckDefault">아이디 기억하기</label>
			</div>
			<button class="btn btn-primary w-100 py-2" type="submit">로그인</button>
			<p class="mt-5 mb-3 text-body-secondary">&copy; 2024–2030</p>
		</form>
	</main>
	<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>	
</body>
</html>