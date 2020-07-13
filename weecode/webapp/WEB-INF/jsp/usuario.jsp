<html>
   <head>
      <title>WeeTestes</title>
   </head>

   <body>
      <h4>Buscar Token pelo Id</h4>
      <form method="POST" action="/weecode/usuario/token">
         <table>
            <tr>
               <td><label>Id:</label></td>
               <td><input name = "id" /></td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
	  <h4>Buscar Usuario Logado</h4>
      <form method="POST" action="/weecode/usuario/logado">
         <table>
            <tr>
               <td><label>Clique em enviar para verificar o usuario logado:</label></td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
   </body>
</html>