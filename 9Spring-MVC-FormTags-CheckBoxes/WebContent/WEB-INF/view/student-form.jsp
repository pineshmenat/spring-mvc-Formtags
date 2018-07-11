<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName" />
		<br />
		<br />
			Last Name: <form:input path="lastName" />
		<br />
		<br />
			Country: <form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br />
		<br />
		Favorite Language: 
		<form:radiobutton path="favoriteLanguage" value="Java"/>Java 
		<form:radiobutton path="favoriteLanguage" value="Swift"/>Swift 
		<form:radiobutton path="favoriteLanguage" value="Android"/>Android
		<br />
		<br />
		Favorite Website: 
		<form:radiobuttons path="favoriteWebsite" items="${student.favoriteWebsiteOptions}"/>
		<br />
		<br />
		Operating Systems: 
		<form:checkbox path="operatingSystems" value="Windows"/> Windows
		<form:checkbox path="operatingSystems" value="MAC"/> MAC
 		<form:checkbox path="operatingSystems" value="Linux"/> Linux
		<br />
		<br />
		<input type="submit" value="submit"> 
	</form:form>
</body>
</html>