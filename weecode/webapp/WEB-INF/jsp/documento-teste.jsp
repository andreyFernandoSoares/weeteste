<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="/css/main.css" rel="stylesheet">
    <title>WeeTestes</title>
</head>
<body>
   <c:forEach var="doc" items="${documentos}">
     <h6 class="hello-title">---------------------------</h6>  
   	 <h6 class="hello-title">Id Doc: ${doc.id}</h6>   
   	 <h6 class="hello-title">Id da Area: ${doc.idArea}</h6>  
   </c:forEach>
</body>
</html>