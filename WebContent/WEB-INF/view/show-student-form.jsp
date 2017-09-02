<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Details</title>
</head>
<body>
<h3>Student First Name is ${student.firstName} and Last name is ${student.lastName}</h3> 
<br><br>
Country : ${student.country}
<br><br>
Favorite Language: ${student.favoriteLanguage}
<br><br>
Operating systems :
<ul>
  <c:forEach var="temp" items="${student.operatingSystems}">
    <li>${temp}</li>
  </c:forEach>
</ul>



 
</body>
</html>