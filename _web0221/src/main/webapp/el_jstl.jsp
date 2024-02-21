<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setAttribute("name", "홍길동"); // 포워딩 된 것으로 가정
request.setAttribute("arr2", new int[]{1,2,3,4,5});
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="j" items="${arr2}" varStatus="st">
${j} : ${st.index} : ${st.count}<br/>
</c:forEach>
---------------------------------------------------<br/>
${intArray = [100,200,300,400,500]}
<c:forEach var="j" items="${intArray}" varStatus="st">
${j} : ${st.index} : ${st.count}<br/>
</c:forEach>
---------------------------------------------------<br/>
<c:forEach var="i" begin="0" end="10" step="2">
${i; ''}
${sum = sum + i; ''}
</c:forEach>
1부터 10까지의 짝수의 합 : ${sum}<br/>
---------------------------------------------------<br/>
<c:forEach var="k" begin="1" end="10">
${s = s + k; ''}
</c:forEach>
1부터 10까지의 짝수의 합 : ${s}
---------------------------------------------------<br/>
${name}<br/>
${aaa = '3.14'; ''}<br/>
${aaa + 100}<br/>
${aaa = aaa + 10}<br/>
${"10" + 1}<br/>
</body>
</html>