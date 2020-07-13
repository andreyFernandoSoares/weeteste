<html>
   <head>
      <title>WeeTestes</title>
   </head>

   <body>
      <h4>Buscar Área pelo nome</h4>
      <form method="POST" action="/weecode/area/id">
         <table>
            <tr>
               <td><label>Nome:</label></td>
               <td><input name = "nome" /></td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
      <h4>Buscar Área pelo Id</h4>
      <form method="POST" action="/weecode/area/nome">
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
      <h4>Gravar Área pelo Nome</h4>
      <form method="POST" action="/weecode/area/criar">
         <table>
            <tr>
               <td><label>Nome:</label></td>
               <td><input name = "nome" /></td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
	  <h4>Deletar Área pelo Id</h4>
      <form method="POST" action="/weecode/area/deletar">
         <table>
            <tr>
               <td><label>Id:</label></td>
               <td><input name = "id" /></td>
               <td> 
		      	 <select name="definitivo">
					 <option value="true">Deletar para sempre</option>
					 <option value="false">Mover para a lixeira</option>
			   	 </select>
               </td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
	  <h4>Mover Área pelo Id</h4>
      <form method="POST" action="/weecode/area/mover">
         <table>
            <tr>
               <td><label>Id:</label></td>
               <td><input name = "id" /></td>
            </tr>
            <tr>
               <td><label>Id pai:</label></td>
               <td><input name = "idPai" /></td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
	  <h4>Buscar documentos da pelo Id</h4>
      <form method="POST" action="/weecode/area/documento">
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
	  <h4>Buscar area pai da pelo Id</h4>
      <form method="POST" action="/weecode/area/pai">
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
	  <h4>Áreas com Temporalidade</h4>
      <form method="POST" action="/weecode/area/temporalidade">
         <table>
            <tr>
               <td><label>Clique para ver as áreas com temporalidade:</label></td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
   </body>
</html>