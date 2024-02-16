<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>  
    
<%
int num = Integer.parseInt(request.getParameter("num"));
BoardDao dao = BoardDao.getInstance();
dao.delete(num);
response.sendRedirect("list.jsp");
%>