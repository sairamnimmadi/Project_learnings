<%@ page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">

<%! int globalVariable = 9; %>

<%

int number1 = Integer.parseInt(request.getParameter("number1"));
int number2 = Integer.parseInt(request.getParameter("number2"));

int result = number1+number2;	

out.println("The the sum of two numbers is "+ result);

%>

<br/>

The global variable is : <%= globalVariable  %>

</body>
</html>