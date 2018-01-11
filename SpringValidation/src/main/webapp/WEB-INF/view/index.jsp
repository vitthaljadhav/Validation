<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="u" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <body>
    <u:url value="/login" var="url"> </u:url>
   
<spring:form action="${url}"  modelAttribute="userForm" method="POST" >
<table>
<tr>
<td><spring:input path="userName"/></td>
<td><spring:errors path="userName"/></td>
</tr>

<tr>
<td><spring:input path="password"/> </td>
<td><spring:errors path="password"/></td>
</tr>
<tr>
<td> <input type="submit" value="Login"></td>
</tr>
</table>
</spring:form>
</body>

</html>
