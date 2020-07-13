<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="/css/main.css" rel="stylesheet">
    <title>WeeTestes</title>
</head>
<body>
   <c:forEach var="a" items="${areas}">
     <h6 class="hello-title">---------------------------</h6>  
   	 <h6 class="hello-title">ID: ${a.id}</h6>   
   	 <h6 class="hello-title">Nome: ${a.nome}</h6>  
   	 <h6 class="hello-title">Area Pai: ${a.nomePai}</h6>  
   </c:forEach>
</body>
</html>