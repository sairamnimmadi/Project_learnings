<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

<title>Student Management system adding and updating data</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" />
<style type="text/css"><%@include file="css/stylesheet.css" %></style>


</head>
<body class="add-student-background">
	<div class="container">
		<form:form action="save-student" modelAttribute="student"
			method="POST" class="myForm" style="margin-left:33%">
			<h1 style="font-weight: bolder !important; text-align: center;">Add
				Student</h1>

			<form:hidden path="id" class="form-control" />
			<span id="name_error"></span>
			<div class="form-group row">
				<label for="name">Name : </label>
				<div class="input-group col">
					<i class="fa fa-user fa-lg icon"></i>
					<form:input path="name" class="form-control" id="name"
						placeholder="name" />
				</div>
			</div>
			<span id="num_error"></span>
			<div class="form-group row">
				<label for="phone">Telephone : </label>
				<div class="input-group col">
					<i class="fa fa-phone fa-lg icon"></i>
					<form:input path="mobile" class="form-control" id="telephone"
						placeholder="mobile" />
				</div>
			</div>
			<span id="country_error"></span>
			<div class="form-group row">
				<label for="country">Country : </label>
				<div class="input-group col">
					<i class="fa fa-flag fa-lg icon"></i>
					<form:input path="country" class="form-control" id="country"
						placeholder="country" />
				</div>
			</div>
			<button type="submit" class="myButton"
				style="margin-top: 10px; margin-bottom: 10px">Submit</button>
		</form:form>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript" ><%@include file="js/validation.js" %></script>
	</body>
</html>