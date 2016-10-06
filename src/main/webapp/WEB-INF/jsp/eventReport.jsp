<%--
  Created by IntelliJ IDEA.
  User: kirill
  Date: 06/10/16
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello events Angular</title>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js" />
    <script src="events.js"/>
</head>
<body>
<div ng-controller="Events">
    I have {{events.length}} events!
    <ul class="events-container">
        <li ng-repeat="event in events">
            {{event.name}}
        </li>
    </ul>
</div>
</body>
</html>
