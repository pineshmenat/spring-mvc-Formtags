<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			<br/><br/>
			Last Name: <form:input path="lastName"/>
			<br/><br/>
			Country: <form:select path="country">
				<form:option value="Brazil" label="Brazil"/>
				<form:option value="India" label="India"/>
				<form:option value="Canada" label="Canada"/>
				<form:option value="Israel" label="Israel"/>
			</form:select>
			
			CountryList from Student Class: <form:select path="newCountry">
			<form:options items="${student.countryOptions}"/>
			</form:select>
			<br/><br/>
			<input type="submit" value="submit"/>
		</form:form>
	</body>
</html>