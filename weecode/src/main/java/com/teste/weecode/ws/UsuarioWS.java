package com.teste.weecode.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.teste.weecode.dao.GediDAO;
import com.teste.weecode.rows.UsuarioRow;
import com.teste.weecode.utils.HttpUtils;
import com.teste.weecode.utils.JsonUtils;

public class UsuarioWS {
	
	@Autowired
	GediDAO gediDAO;
	
	@Autowired
	HttpUtils httpUtils;
	
	@Autowired
	JsonUtils jsonUtils;
	
	public String getToken(String id) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/usuario/token?usuario={id}";
		String token = gediDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		UsuarioRow userRow = new UsuarioRow(token);
		return userRow.getToken();
	}
	
	public List<UsuarioRow> usuarioLogado(){
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/usuario";
		String json = gediDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), new HashMap<String, Object>());
		List<JSONObject> listaJson = jsonUtils.getListaJson(json, null);
		List<UsuarioRow> listaUsuario = new ArrayList<>();
		
		for (JSONObject jUser : listaJson) {
			UsuarioRow user = new UsuarioRow();
			user.setIdUsuario(jUser.optLong("idUsuario"));
			user.setNome(jUser.optString("nome"));
			user.setIdAreaPadrao(jUser.optString("idAreaPadrao"));
			user.setIdPerfilAdm(jUser.optLong("idPerfilAdm"));
			user.setTituloPerfilAdm(jUser.optString("tituloPerfilAdm"));
			user.setToken(getToken(String.valueOf(jUser.optLong("idUsuario"))));
			listaUsuario.add(user);
		}
		
		return listaUsuario;
	}
}