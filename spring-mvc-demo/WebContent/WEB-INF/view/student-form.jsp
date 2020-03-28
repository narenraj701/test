<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
<title>Student Form</title>
	<style>
		.error{color:red}
	</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name : <form:input path="firstName"/>
	<br><br>
	Last Name (*) :  <form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"/>
	<br><br>
	Mobile Number (*) :  <form:input path="mobileNumber"/>
	<form:errors path="mobileNumber" cssClass="error"/>
	<br><br>
	Free Passes (*) :  <form:input path="freePasses"/>
	<form:errors path="freePasses" cssClass="error"/>
	<br><br>
	Country:
	<form:select path="country">
	<form:option value="India" label="Ind"/>
	<form:option value="Pakistan" label="Pak"/>
	</form:select>
	<br><br>
	Favorite Language:
	Java <form:radiobutton path="favLang" value="Java"/>
	Python <form:radiobutton path="favLang" value="Python"/>
	<br><br>
	<input type="submit"	value="submit">
	</form:form>

</body>
</html>