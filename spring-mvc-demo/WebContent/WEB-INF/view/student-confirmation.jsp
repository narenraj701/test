<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
<title>Student Confirmation Form</title>
</head>
<body>
	The Student confirmed is : ${student.firstName} ${student.lastName}
	<br><br>
	Student country is : ${student.country}
	<br><br>
	Student Favorite Language is : ${student.favLang}
	<br><br>
	Student Mobile Number is : ${student.mobileNumber }
	<br><br>
	Free Passes is : ${student.freePasses}
</body>
</html>