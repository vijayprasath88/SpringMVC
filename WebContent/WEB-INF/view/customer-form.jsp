<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>

<title>Customer Form</title>
<style>
.error{
color:red
}
</style>
</head>
<body>
<h2>Customer Form Page</h2>
<hr>
	<form:form action="showCustomerForm" modelAttribute="customer">
	First Name <form:input path="firstName"/>
	<br><br>
	Last Name (*) <form:input path="lastName"/><form:errors path="lastName" class="error"/>
	<br><br>
	Number of Passes <form:input path="freePasses"/> <form:errors path="freePasses" class="error"/>
	<br><br>
	Postal Code <form:input path="postalCode"/> <form:errors path="postalCode" class="error"></form:errors>
	<br><br>
	<input type="submit" value="Submit"/>
	</form:form>

</body>

</html>