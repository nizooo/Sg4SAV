<%@include file="header.jsp" %>


  <body>
 <br>
 <br>
 <div id="container">

    <h2>list cust</h2>
    <c:if test="${not empty message}"><div class="message green">${message}</div></c:if>
	<table border="1">
	<tr><th></th><th>Name</th><th>Age</th><th>Email</th><th>News Frequency</th><th>Gender</th><th>Receive News</th>
        <c:forEach items="${listCustomers}" var="customer">
	     <tr>
	     <td><input type="checkbox" name="customerChk" /></td>
	     <td>${customer.name}</td>
	     <td>${customer.age}</td>
	     <td>${customer.email}</td>
	     <td>${customer.newsletterFrequency}</td>
	     <td>${customer.gender}</td>
	     <td>${customer.receiveNewsletter}</td>
        </tr>
        </c:forEach>
	</table>
	<br>

<security:authorize access="hasRole('ROLE_EDITOR')" >

	<input type="button" name="deleteCustomer" value="delete Customer" />
</security:authorize>
   
  </div>
  
    </body>
</html>