<html>
   <head>
      <title>WeeTestes</title>
   </head>

   <body>
     <h4>Buscar Registro pelo Id</h4>
      <form method="POST" action="/weecode/registro/id">
         <table>
             <tr>
               <td><label>Id do Registro:</label></td>
               <td><input name = "registroId" /></td>
        	 </tr>
        	 
        	 <tr>
        	   <td> 
		      	 <select name="docs">
					 <option value="true">Trazer documentos</option>
					 <option value="false">Não trazer documentos</option>
			   	 </select>
               </td>
               <td> 
		      	 <select name="bytes">
					 <option value="true">Incluir conteudo do documento</option>
					 <option value="false">Não incluir conteudo do documento</option>
			   	 </select>
               </td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
	  <h4>Buscar Registro pela Area</h4>
      <form method="POST" action="/weecode/registro/area">
         <table>
             <tr>
               <td><label>Id do Area:</label></td>
               <td><input name = "areaId" /></td>
        	 </tr>
        	 <tr>
               <td><label>Id do Registro:</label></td>
               <td><input name = "registroId" /></td>
        	 </tr>
        	 <tr>
        	   <td> 
		      	 <select name="docs">
					 <option value="true">Trazer documentos</option>
					 <option value="false">Não trazer documentos</option>
			   	 </select>
               </td>
               <td> 
		      	 <select name="bytes">
					 <option value="true">Incluir conteudo do documento</option>
					 <option value="false">Não incluir conteudo do documento</option>
			   	 </select>
               </td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
------------------------------------------------------------------------- 
      <h4>Deletar Registro pelo Id</h4>
      <form method="POST" action="/weecode/registro/deletar">
         <table>
            <tr>
               <td><label>Id:</label></td>
               <td><input name = "registroId" /></td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
   </body>
</html>