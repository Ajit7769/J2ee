<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<% String msg = (String)request.getAttribute("msg"); %>
<jsp:include page="NavBar.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<div align="center">
		<form action="./add" method="post">
			<fieldset>
				<legend></legend>
				<table>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td>Contact</td>
						<td><input type="text" name="contact"></td>
					</tr>
					<tr>
						<td>Designation</td>
						<td><input type="text" name="designation"></td>
					</tr>
					<tr>
						<td>Salary</td>
						<td><input type="text" name="salary"></td>
					</tr>
				</table>
			</fieldset>
			<input type="submit" value="Add">
			
			<% if(msg != null){ %>
			<h3><%=msg %></h3>
			<%} %>
		</form>
	</div>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script type="text/javascript">
	
	<% if(msg != null){ %>
	
	swal({
		  title: "Good job!",
		  text: "Employee Added Successfully...!",
		  icon: "success",
		  button: "OK",
		});
	<%} %>
	Swal.fire({
		  title: 'Error!',
		  text: 'Do you want to continue',
		  icon: 'error',
		  confirmButtonText: 'Cool'
		})
	
	
	
	
    </script>

</body>
</html>