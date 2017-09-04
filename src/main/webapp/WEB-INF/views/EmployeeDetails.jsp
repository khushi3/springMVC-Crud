<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>SpringMVC crud App</title>
	</head>
	<body>
  
    <form action="/addEmployee" method="POST">
     <table style="width:100%">
  <tr>
    <th>Add Country</th>
  </tr>
  <tr>
  <form:hidden path="/id" />
   <td><form:label path="Ename"> Employee Name</form:label></td>
   <td><form:input path="Ename"></form:input></td>
   </tr>
 <tr>
   <td><form:label path="Address"> Employee Address</form:label></td>
   <td><form:input path="Address"></form:input></td>
   </tr>
  <tr>
   <td><input type="submit" /></td>
  </tr>
</table>
 </form>
 <br>
 <h3>Employee List</h3>
 
 <c:if test="${!empty listOfEmployee }">
	<table align="left" border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Address</th>
			<th>Employee Salary</th>
			<th>Employee Edit</th>
			<th>Employee Delete</th>
		</tr>

		<c:forEach items="${listOfEmployee}" var="employee">
			<tr>
				<td><c:out value="${employee.id}"/></td>
				<td><c:out value="${employee.name}"/></td>
				<td><c:out value="${employee.address}"/></td>
				<td><c:out value="${employee.salary}"/></td>
				<td><a href= "<c:url value ='/updateEmployee/${employee.id}' />">Edit</a></td>
                <td><a href="<c:url value ='/deleteEmployee/${employee.id}' />" >Delete</a></td>				
			</tr>
		</c:forEach>
		</table>
		</c:if>
		</body>
</html>
