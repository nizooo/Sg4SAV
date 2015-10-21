<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>result page</title>
</head>
<body>

<h2>Submitted Customer Information</h2>
   <table>
    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
     <tr>
        <td>Age</td>
        <td>${age}</td>
    </tr>
     <tr>
        <td>Address</td>
        <td>${address}</td>
    </tr>
     <tr>
        <td>Email</td>
        <td>${email}</td>
    </tr>
    
 
</table>  
</body>
</html>