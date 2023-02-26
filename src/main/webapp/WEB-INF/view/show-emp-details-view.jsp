<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h1>Dear Employee, you are WELCOME!!!</h1>
<br>
<br>
<br>
<%--<h1>Your name: ${param.employeeName}</h1>--%>
<%--<h1>Your name: ${nameAttribute}  ${description}</h1>--%>
<h2>Your name: ${employee.name}</h2>
<h2>Your surname: ${employee.surname}</h2>
<h2>Your salary: ${employee.salary}</h2>
<h2>Your department: ${employee.department}</h2>
<h2>Your car: ${employee.carBrand}</h2>
<h2>Language(s):
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li> ${lang}</li>
        </c:forEach>
    </ul>
</h2>
<h2>Phone number: ${employee.phoneNumber}</h2>
<br>
<h2>Email: ${employee.email}</h2>
</body>

</html>