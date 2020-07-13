<html>
   <head>
      <title>WeeTestes</title>
   </head>

   <body>
     <h4>Buscar Documento pelo Id</h4>
      <form method="POST" action="/weecode/documento/id">
         <table>
             <tr>
               <td><label>Id do Documento:</label></td>
               <td><input name = "documentoId" /></td>
        	 </tr>
        	 
        	 <tr>
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
      <h4>Deletar Documento pelo Id</h4>
      <form method="POST" action="/weecode/documento/deletar">
         <table>
             <tr>
               <td><label>Id do Documento:</label></td>
               <td><input name = "documentoId" /></td>

               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
      <h4>Mover Documento pelo Id</h4>
      <form method="POST" action="/weecode/documento/mover">
         <table>
             <tr>
               <td><label>Id do Documento:</label></td>
               <td><input name = "documentoId" /></td>
        	 </tr>
        	 
        	 <tr>
               <td><label>Id do Registro:</label></td>
               <td><input name = "registroId" /></td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
      <h4>Pesquisar Documento por Json</h4>
      <form method="POST" action="/weecode/documento/pesquisa">
         <table>
             <tr>
               <td>
			     <textarea name="jsonPesquisa" rows="10" cols="50">
{
 "listaIndice": [
  {
    "idTipoIndice": 15,
    "identificador": "Nome_do_documento",
    "valor": "documento.pdf"
  }]
}
			     </textarea>
			  </td>
               <td colspan = "2">
                  <input type = "submit" value = "Enviar"/>
               </td>
            </tr>
         </table>  
      </form>
-------------------------------------------------------------------------
   </body>
</html>