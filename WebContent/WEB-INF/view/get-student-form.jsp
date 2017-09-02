<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Enter Student Details</title>
</head>
<body>
<form:form action="showStudentForm" modelAttribute="student">
First Name : <form:input path="firstName"/>
<br><br>
Last Name : <form:input path="lastName"/>
<br><br>

<br><br>
Country: 
<form:select path="country">
<form:options items="${theCountryOptions}"/>
</form:select>

<br><br>
<form:radiobuttons path="favoriteLanguage" items="${thefavoriteLanguages}"/>
<br><br>
Operating Systems:
Linux <form:checkbox path="operatingSystems" value="Linux"/>
Mac <form:checkbox path="operatingSystems" value="Mac"/>
Microsoft Windows <form:checkbox path="operatingSystems" value="Windows"/>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>