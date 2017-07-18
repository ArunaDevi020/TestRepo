<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students Details Entry</title>
</head>
<body>
<form:errors path="student.*"/>
<form action="/SpringWEB/updatesuccess.html" method=post>
<h3>Please Enter your Details</h3>
<table>
<tr>
<td>Student ID :</td>
<td><input type="text" name="studentId"/></td>
</tr>
<tr>
<td>Student Name :</td>
<td><input type="text" name="studentName"/></td>
</tr>
<tr>
<td>Student DOB :</td>
<td><input type="text" name="dob"/></td>
</tr>
<tr>
<td>Student ContactDetail :</td>
<td><input type="text" name="contactNumber"/></td>
</tr>
<tr>
<td>Student Skillsets :</td>
<td><select name="skillSet" multiple="multiple">
<option value="Core Jave">Core Jave</option>
<option value="Struts2">Struts2</option>
<option value="Spring MVC">Spring MVC</option>
<option value="Spring Core">Spring Core</option>
</select></td>
</tr>
<tr>
<td>Student InstitutionType :</td>
<td><input type="radio" name="institution" value="Full-Time"/>Full-Time</td>
<td><input type="radio" name="institution" value="Part-Time"/>Part-Time</td>
</tr>
<tr>
<tr>
<td>Student SchlorShip :</td>
<td><input type="checkbox" name="scholarShip" value="Yes"/>YES</td>
<td><input type="checkbox" name="scholarShip" value="NO"/>NO</td>
</tr>
<tr>
<tr>
<td><input type="submit" value="Update Details"/></td>
</tr>
</table>
</form>
</body>
</html>