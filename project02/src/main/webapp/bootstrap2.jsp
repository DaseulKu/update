<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ViewBoard</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	  rel="stylesheet"
	  integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	  crossorigin="anonymous">
</head>
<body>
<form action="view.do" method="post">
	<div class="container" style="padding-top: 50px">
		<div class="mb-3">
			<label for="titleInput" class="form-label">제목</label>
			<input type="text" class="form-control" id="titleInput">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>
			<textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
		</div>
	</div>
</form>
<input type="button" value="목록보기" onclick="location.href='blist.do'">
<input type="button" value="수정" onclick="location.href='write.jsp?num=${board.num}'">
<input type="button" value="삭제" onclick="location.href='delete.jsp?num=${board.num}'">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>