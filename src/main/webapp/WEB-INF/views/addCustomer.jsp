<%@include file="header.jsp" %>

  <body>
  <br>
  <br>
  <br>
  <br>
  You are logged in as:
 <security:authentication property="principal.username" />
 
 <div id="container">

    <h2>Subscribe to The Newsletter!</h2>
    <c:if test="${not empty message}"><div class="message green">${message}</div></c:if>

    <form:form modelAttribute="customer">
      <label for="nameInput">Name: </label>
      <form:input path="name" id="nameInput" />
      <br/>

      <label for="ageInput">Age: </label>
      <form:input path="age" id="ageInput" />
      <br/>

	  <label for="addressInput">Address: </label>
      <form:input path="address" id="emailInput" />
      <br/>

      <label for="emailInput">Email: </label>
      <form:input path="email" id="emailInput" />
      <br/>

      <label for="genderOptions">Gender: </label>
      <form:select path="gender" id="genderOptions">
        <form:option value="">Select Gender</form:option>
        <form:option value="MALE">Male</form:option>
        <form:option value="FEMALE">Female</form:option>
      </form:select>
      <br/>

      <label for="newsletterCheckbox">Newsletter? </label>
      <form:checkbox path="receiveNewsletter" id="newsletterCheckbox" />
      <br/>
      <label for="frequencySelect">Freq:</label>
      <form:select path="newsletterFrequency" id="frequencySelect">
        <form:option value="">Select Newsletter Frequency: </form:option>
        <c:forEach items="${frequencies}" var="frequency">
          <form:option value="${frequency}">${frequency}</form:option>
        </c:forEach>
      </form:select>
      <br/>

      <br/>
      <input type="submit" value="Submit" />
    </form:form>
  </div>
  	<h3>
			<!--  Don't show logout unless someone is logged in -->
			<security:authentication property="principal" var="principal" scope="page" />
			<c:if test="${principal != null}">
				<p>
					<a href="<c:url value="/j_spring_security_logout"/>">Logout</a>
					(${principal.username})
				</p>
			</c:if>
		</h3>
    </body>
</html>