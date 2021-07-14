<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student data</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/stylesheet.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
<script type="text/javascript"
	src="/student-management/URLToReachResourceFolder/js/javascript.js"></script>
<script>
	var userid;

	function setId(data) {
		userid = parseInt(data.getAttribute("data-id"));
	}

	function confirmDelete() {

		location.replace("/deleteStudent?userId=" + userid);
	}
	function confirmUpdate() {

		location.replace("/updateStudent?userId=" + userid);
	}
</script>

</head>
<body>


	<div class="container" style="margin-top: 3%">
		<div
			style="display: flex; flex-direction: row; margin-left: 305px; margin-bottom: 20px">

			<h1 style="font-weight: bolder !important;">STUDENT MANAGEMENT</h1>
			<button class="btn btn-danger myButton1">
				<a href="/logout" style="text-decoration: none; color: white">logout</a>
			</button>

		</div>
		<form action="showAddStudentPage" style="align-self: center;">

			<button type="submit" class="myButton">ADD STUDENT</button>

		</form>
		<br>

		<table class="table table-striped myTable"
			style="border: 2px solid gray;">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Mobile</th>
					<th>Country</th>
					<th colspan="2" scope="colgroup">Alter student Information</th>
				</tr>
			</thead>

			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>

					<td><a type="button" class="btn btn-secondary"
						data-toggle="modal" data-target="#updateModal"
						data-id="${student.id}" onclick="setId(this)"
						style="text-decoration: none">Update</a></td>
					<td><a type="button" class="btn btn-danger"
						data-toggle="modal" data-target="#deleteModal"
						data-id="${student.id}" onclick="setId(this)"
						style="text-decoration: none">Delete</a></td>
				</tr>
			</c:forEach>

		</table>
		<img alt="cartoonimage" src="images/college-students.jpg"
			style="width: 70%; margin-left: 15%">
	</div>
	<div class="modal fade" id="deleteModal" tabindex="-1"
		style="margin-top: 150px" aria-labelledby="exampleModalLabel"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" style="margin-left: 150px"
						id="exampleModalLabel">Delete student</h5>
					<button type="button" class="btn-close" data-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">Are you sure want to delete student info?</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-success" data-dismiss="modal">Cancel</button>
					<a onclick="confirmDelete()" type="button" class="btn btn-danger">Delete</a>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="updateModal" tabindex="-1"
		style="margin-top: 150px" aria-labelledby="exampleModalLabel"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" style="margin-left: 150px"
						id="exampleModalLabel">Update student</h5>
					<button type="button" class="btn-close" data-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">Are you sure want to update student info ?</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
					<a onclick="confirmUpdate()" type="button" class="btn btn-success">Update</a>
				</div>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js">
		
	</script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js">
		
	</script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js">
		
	</script>

</body>
</html>