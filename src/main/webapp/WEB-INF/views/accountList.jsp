<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html 
     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="<c:url value="/styles/springsource.css"/>" type="text/css"/>
	<title>Security Solution: Account List</title>
</head>

<body>
<br>
<br>
<br>
<div id="main_wrapper">

<h1>Account List</h1>

<ul>
	<c:forEach items="${accounts}" var="account">
		<li><a href="accountDetails?entityId=${account.entityId}">${account.name}</a></li>
	</c:forEach>
</ul>

<!--  Don't show logout unless someone is logged in -->
<security:authentication property="principal" var="principal" scope="page" />
<c:if test="${principal != null}">
	<p><a href="<c:url value="/j_spring_security_logout"/>">Logout</a> (${principal.username})</p>
</c:if>

<p>&#160;</p>   <!--  Force blank line at end of page -->

</div>
</body>

</html>
