<html>
   <head>
      <title>WeeTestes</title>
   </head>

   <body>
     <h4>Buscar Indice pela Area e Identificador</h4>
      <form method="POST" action="/weecode/indice/identificador">
         <table>
             <tr>
               <td><label>Id da Area:</label></td>
               <td><input name = "areaId" /></td>
        	 </tr>
        	 
        	 <tr>
               <td><label>Identificador:</label></td>
               <td><input name = "identificador" /></td>
               <td> 
		      	 <select name="localizacao">
					 <option value="AMBOS">Ambos</option>
					 <option value="DOCUMENTO">Documento</option>
					  <option value="REGISTRO">Registro</option>
			   	 </select>
               </td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
     <h4>Buscar Indice pelo Usuario</h4>
      <form method="POST" action="/weecode/indice/usuario">
         <table>
             <tr>
               <td><label>Identificador:</label></td>
               <td><input name = "identificador" /></td>
       	     </tr>
       	     <tr>
               <td><label>Id Usuario:</label></td>
               <td><input name = "usuarioId" /></td>
 
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
   </body>
</html>