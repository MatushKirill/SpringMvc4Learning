<%--
  Created by IntelliJ IDEA.
  User: kirill
  Date: 03/10/16
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Attendee page</title>
    <style type="text/css">
        .error{
            color: #ff0000;
        }
        .errorBlock{
            color: #000;
            background-color: #ffeeee;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>


<form:form commandName="attendee">
    <form:errors  path="*" cssClass="errorBlock" element="div"/>
    <label for="textinput1"><spring:message code="Attendee.name"/></label>
    <form:input path="name" cssErrorClass="error"/>
    <form:errors path="name" cssClass="error"/>
    <br>
    <label for="textinput2"><spring:message code="Attendee.emailAddress"/></label>
    <form:input path="emailAddress" cssErrorClass="error"/>
    <form:errors path="emailAddress" cssClass="error"/>
    <br>
    <label for="textinput3"><spring:message code="Attendee.phone"/></label>
    <form:input path="phone" cssErrorClass="error"/>
    <form:errors path="phone" cssClass="error"/>
    <br>
    <input type="submit" class="btn" value="Enter Event ">


</form:form>

<spring:message code="lang"/> :   <a href="?language=en"> English</a> | <a href="?language=sp">Spanish</a>

</body>
</html>
