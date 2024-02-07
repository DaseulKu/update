<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button onClick="test()">click</button>
<h1 id="title">hello JSP</h1>
<h1 class="title2">hello JSP2</h1>
<script>
function test(){
	let str = document.getElementById("title"); // 값을 복사해오는게 아니라 요소를 가져오는 것
	let str2 = document.querySelector("#title"); // 변수를 만들어서 요소 선택하기
	let str3 = document.querySelector(".title2");
	console.log("Hello world", '작은따옴표도 가능',str,str2,str3);
	str.innerHTML = "test"; //안에 값을 넣어주기
}
</script>
</body>
</html>