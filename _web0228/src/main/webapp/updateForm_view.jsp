<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UpdateForm</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	  rel="stylesheet"
	  integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	  crossorigin="anonymous">
</head>
<body>
	<div class="container" style="padding-top: 50px">
	<form action="memberUpdate.do" method="post">
		<div class="mb-3">
			<label for="membernoInput" class="form-label">MemberNo</label>
			<input type="text" readonly name="memberno" value="${member.memberno}" class="form-control" id="membernoInput" placeholder="memberno">
		</div>
		<div class="mb-3">
			<label for="idInput" class="form-label">Id</label>
			<input type="text" readonly name="id" value="${member.id}" class="form-control" id="idInput" placeholder="Id">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Email address</label>
			<input type="email" name="email" value="${member.email}"class="form-control" id="exampleFormControlInput1" placeholder="id@example.com">
		</div>
		<div class="mb-3">
			<label for="nameInput" class="form-label">Name</label>
			<input type="text" name="name" value="${member.name}"class="form-control" id="nameInput" placeholder="Name">
		</div>
		<button class="btn btn-outline-secondary" type="submit">Update</button>
	</form>	
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>