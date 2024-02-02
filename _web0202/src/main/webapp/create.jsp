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
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
String sql = 
"create table score (" + 
"    num  number(4)          primary key," + 
"    name varchar(20),             " +
"    kor  number(4),                     " +    
"    eng  number(4),                     " +
"    math number(4)                      " +    
")";
try (Connection conn = DriverManager.getConnection(url,"scott","tiger");
	PreparedStatement pstmt = conn.prepareStatement(sql);
    ) {pstmt.executeQuery();
        out.println("성적 테이블 생성 성공 !");        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
</body>
</html>