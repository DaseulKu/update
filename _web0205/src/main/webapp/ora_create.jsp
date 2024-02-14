<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%

Class.forName("oracle.jdbc.driver.OracleDriver");

try (
	Connection conn = DriverManager.getConnection(
	"jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
	Statement stmt = conn.createStatement();
	){
	String sql = 
			"create table score (" + 
			"    num  number(4)          primary key," + 
			"    name varchar(20),            		 " +
			"    kor  number(4),                     " +    
			"    eng  number(4),                     " +
			"    math number(4)                      " +    
			")";
	stmt.executeQuery(sql);
        out.println("성적 테이블 생성 성공 !");        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
</body>
</html>