<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
	<title>luv2code Company Home Page</title>
</head>

<body>
	<h2>luv2code Company Home Page</h2>
<hr>
	<p>
	User: <security:authentication property="principal.username"/>
	<br><br>
	Role(s):<security:authentication property="principal.authorities"/>
	</p>
<hr>
    <security:authorize access="hasRole('MANAGER')">
    <P>
    <a href="${pageContext.request.contextPath}/leaders">Leadership Meetings</a>
    (only for manager)
    </p>
    </security:authorize>
    <security:authorize access="hasRole('ADMIN')">
    <p>
    <a href="${pageContext.request.contextPath}/admins">Admins Meetings</a>
    (only for admin)
     </p>
     </security:authorize>

	
	Welcome to the luv2code company home page!
    <form:form action="${pageContext.request.contextPath}/logout" method="POST">
    <input type="submit"value="logout">
    </form:form>
</body>

</html>