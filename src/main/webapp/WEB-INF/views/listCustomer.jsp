<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
  <head>
    <title>List Cust</title>
<!--     <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> -->
    <style>
      body { background-color: #eee; font: helvetica; }
      #container { width: 800px; background-color: #fff; margin: 30px auto; padding: 30px; border-radius: 5px; box-shadow: 5px; }
      .green { font-weight: bold; color: green; }
      .message { margin-bottom: 10px; }
      label {width:70px; display:inline-block;}
      form {line-height: 160%; }
      .hide { display: none; }
    </style>
  </head>
  <body>
 
 <div id="container">

    <h2>list cust</h2>
    <c:if test="${not empty message}"><div class="message green">${message}</div></c:if>
	<table border="1">
	<tr><th>Name</th><th>Age</th><th>Email</th><th>News Frequency</th><th>Gender</th><th>Receive News</th>
        <c:forEach items="${listCustomers}" var="customer">
	     <tr> 
	     <td>${customer.name}</td>
	     <td>${customer.age}</td>
	     <td>${customer.email}</td>
	     <td>${customer.newsletterFrequency}</td>
	     <td>${customer.gender}</td>
	     <td>${customer.receiveNewsletter}</td>
        </tr>
        </c:forEach>
	</table>

   
  </div>
  
    </body>
</html>