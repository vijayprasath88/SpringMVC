<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>

<title>Customer Form</title>
</head>
<body>
<h2>Customer Form Page</h2>
<hr>
	<form:form action="showCustomerForm" modelAttribute="customer">
	First Name <form:input path="firstName"/>
	<br><br>
	Last Name <form:input path="lastName"/><form:errors path="lastName" cssColor="error"/>
	<br><br>
	<input type="submit" value="Submit"/>
	</form:form>

</body>

</html>