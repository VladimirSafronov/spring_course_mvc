<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please enter your details</h2>

<br><br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>

    Department <form:select path="department">
<%--    <form:option value="Information technology" label="IT"/>--%>
<%--    <form:option value="Human resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="sales"/>--%>
    <form:options items="${employee.departments}"/>

</form:select>


    <input type="submit" value="OK">

</form:form>

</body>

</html>