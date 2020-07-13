<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="/css/main.css" rel="stylesheet">
    <title>WeeTestes</title>
</head>
<body>
   <c:forEach var="u" items="${usuario}">
     <p></p>
   	 <h6 class="hello-title">ID: ${u.idUsuario}</h6>   
   	 <h6 class="hello-title">Nome: ${u.nome}</h6>  
   	 <h6 class="hello-title">Titulo: ${u.tituloPerfilAdm}</h6>  
   	 <h6 class="hello-title">Token: ${u.token}</h6>  
   </c:forEach>
</body>
</html>