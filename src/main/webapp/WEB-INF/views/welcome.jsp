<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST" action="/Sg4SAV/sav/addCustomer" commandName="customer">
             <table>
                <tr>
<%--                     <td><form:label path="name">Name</form:label></td> --%>
                    <td><form:input path="name"/></td>
                </tr>
 <tr>
                    <td><form:label path="age">Name</form:label></td>
                    <td><form:input path="age"/></td>
                </tr>
 <tr>
                    <td><form:label path="address">Name</form:label></td>
                    <td><form:input path="address"/></td>
                </tr>
 <tr>
                    <td><form:label path="email">Name</form:label></td>
                    <td><form:input path="email"/></td>
                </tr>

<!--                 <tr> -->
<%--                     <td><form:label path="age">age</form:label></td> --%>
<%--                     <td><form:input path="age"/></td> --%>
<!--                 </tr> -->
<!--                 <tr> -->
<%--                     <td><form:label path="address">Contact Number</form:label></td> --%>
<%--                     <td><form:input path="address"/></td> --%>
<!--                 </tr> -->
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>