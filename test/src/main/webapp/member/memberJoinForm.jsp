<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>회원가입</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"	  
	  integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	  crossorigin="anonymous">
</head>
<body>
	<div class="container" style="padding-top: 50px">
	<c:if test="${not empty failMessage}">
   		<div style="color: red;">
        	${failMessage}
    	</div>
	</c:if>
	
		<form action="join.do" method="post">
			<div class="mb-3">
				<label for="idInput" class="form-label">아이디</label> 
				<input type="text" name="id" class="form-control" id="idInput" placeholder="Id" required>
			</div>
			<div class="mb-3">
				<label for="emailInput" class="form-label">이메일</label>
				<input type="email" name="email" class="form-control" id="emailInput" placeholder="id@example.com" required>
			</div>
			<div class="mb-3">
				<label for="nameInput" class="form-label">이름</label>
				<input type="text" name="name" class="form-control" id="nameInput" placeholder="Name" required>
			</div>
			<button class="btn btn-outline-primary" type="submit">등록</button>
		</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
			crossorigin="anonymous"></script>
</body>
</html>