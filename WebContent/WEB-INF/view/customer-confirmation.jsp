<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Customer Confirmation Page</title>
</head>
<body>
<h4>Customer First Name : ${customer.firstName}</h4>
<br>
<h4>Customer Last Name : ${customer.lastName}</h4>
<br><br>
<h4>Number of Free Passes : ${customer.freePasses}</h4>
<br><br>
<h4>Postal Code : ${customer.postalCode}</h4>
</body>

</html>