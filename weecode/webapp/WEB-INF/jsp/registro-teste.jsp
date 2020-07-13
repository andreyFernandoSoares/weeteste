<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="/css/main.css" rel="stylesheet">
    <title>WeeTestes</title>
</head>
<body>
   <c:forEach var="reg" items="${registros}">
     <p></p>
   	 <h6 class="hello-title">ID: ${reg.id}</h6>   
   	 <h6 class="hello-title">Id Area: ${reg.idArea}</h6>  
   	 <h6 class="hello-title">Id Usuario: ${reg.idUsuario}</h6>  
   </c:forEach>
</body>
</html>