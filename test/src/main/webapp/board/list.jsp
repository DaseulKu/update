<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.List"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//String memberId = (String)session.getAttribute("MEMBERID");
//if(memberId == null){
//	response.sendRedirect("/login/sessionLoginForm.jsp");
//}
BoardDao dao = BoardDao.getInstance();
List<Board> list = dao.selectList();
%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BoardList</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
	<div class="container" style="padding-top: 50px;">
		<table class="table table-bordered table-hover">
   			<tr>
				<th scope="col">글번호</th>
				<th scope="col">글제목</th>
				<th scope="col">글내용</th>
				<th scope="col">작성일</th>
				<th scope="col">조회수</th>
				<th scope="col">회원번호</th>
				<th scope="col">수정</th>
				<th scope="col">삭제</th>
			</tr>
   
<%
for (Board board : list) {
%>         
			<tr>
				<td><%=board.getNum()%></td>
				<td style="text-align:left;">
				<a href="view.jsp?memberno=<%=board.getMemberno()%>"><%=board.getTitle()%></a></td>
				<td><%=board.getContent()%></td>
				<td><%=board.getRegtime()%></td>
				<td><%=board.getHits()%></td>
				<td><%=board.getMemberno()%></td>
				<td>수정</td>
				<td>삭제</td>
   	 		</tr>
<%
}
%>
		</table>
<input type="button" value="Write" class="btn btn-outline-secondary" onclick="location.href='write.jsp'">
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>
