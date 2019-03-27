<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="label.studentAdmissionForm"/></title>
    
<link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css"/>

</head>
<body>
	<p>
	<a href="/SpringWebApplication/AdmissionForm?siteTheme=green">GREEN</a>|
	<a href="/SpringWebApplication/AdmissionForm?siteTheme=red">RED</a>
		
	</p>

	<a href="/SpringWebApplication/AdmissionForm?siteLanguage=en">English</a>|
	<a href="/SpringWebApplication/AdmissionForm?siteLanguage=fr">French</a>
	<h1><spring:message code="label.headerMessage"/></h1>
	
	<h1><spring:message code="label.admissionForm"/></h1>
	
	<form:errors path="student1.*"/>
	<form action="/SpringWebApplication/AdmissionSuccess" method="POST">
	
	
	
	<table>
		<tr>
			<td><spring:message code="label.studentName"/></td>
			<td><input type="text" name="studentName"/></td>
		</tr>
		<tr>
			<td><spring:message code="label.studentHobby"/></td>
			<td><input type="text" name="studentHobby"/></td>
		</tr>
		<tr>
			<td><spring:message code="label.studentMobile"/></td>
			<td><input type="text" name="studentMobile"/></td>
		</tr>
		<tr>
			<td><spring:message code="label.studentDOB"/></td>
			<td><input type="text" name="studentDOB"/></td>
		</tr>
		<tr>
			<td><spring:message code="label.studentSkills"/></td>
			<td>
				<select name="studentSkills" multiple>
					<option value="Java Core">Java Core</option>
					<option value="Spring Core">Spring Core</option>
					<option value="Spring MVC">Spring MVC</option>
				</select>
			</td>
		</tr>
	</table>
	<table>
		<tr><td><spring:message code="label.studentAddress"/></td></tr>
		<tr>
			<td><spring:message code="label.studentCountry"/><input type="text" name="studentAddress.country"/></td>
			<td><spring:message code="label.studentCity"/><input type="text" name="studentAddress.city"/></td>
			<td><spring:message code="label.studentStreet"/><input type="text" name="studentAddress.street"/></td>
			<td><spring:message code="label.studentPincode"/><input type="text" name="studentAddress.pincode"/></td>
		</tr>
		<tr> 
			<td><input type="submit" value="<spring:message code="label.student.submitForm"/>"/></td>
		</tr>		
	</table>
		
	</form>
</body>
</html>