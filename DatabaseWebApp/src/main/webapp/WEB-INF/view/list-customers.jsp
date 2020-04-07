<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> Customers List</title>
<link type="text/css"
        rel="stylesheet"
        href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<h1>Welcome To Jsp File</h1>
<div id="wrapper">
    <div id="header">
        <h2>CRM- Customer Relationship Management</h2>
    </div>
</div>
<div id="container">
    <div id="content">
    <input type="button" value="Add Customer"
            onclick="window.location.href='showFormForAdd' ;return false;"
            class="add-button"
     />
    <table>
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Action</th>
        </tr>
        <c:forEach var="temp" items="${customers}">
        <!--construct an update link with id-->
        <c:url var="updateLink" value="/customer/showFormForUpdate">
        <c:param name="customerId" value="${temp.id}"/>
        </c:url>
         <c:url var="deleteLink" value="/customer/delete">
         <c:param name="customerId" value="${temp.id}"/>
         </c:url>
            <tr>
                <td>${temp.id}</td>
                <td>${temp.firstName}</td>
                <td>${temp.lastName}</td>
                <td>${temp.email}</td>
                <td>
                <a href="${updateLink}">Update</a>
                |
                <a href="${deleteLink}"
                onclick="if(!(confirm('Are you sure to delete?'))) return false">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    </div>
</div>
</body>
</html>