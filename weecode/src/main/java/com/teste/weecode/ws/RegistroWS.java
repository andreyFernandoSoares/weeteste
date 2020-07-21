package com.teste.weecode.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.teste.weecode.dao.GedDAO;
import com.teste.weecode.rows.RegistroRow;
import com.teste.weecode.utils.HttpUtils;
import com.teste.weecode.utils.JsonUtils;

public class RegistroWS {
	
	@Autowired
	GedDAO gedDAO;
	
	@Autowired
	HttpUtils httpUtils;
	
	@Autowired
	DocumentoWS docWS;
	
	@Autowired
	JsonUtils jsonUtils;
	
	@Autowired
	IndiceWS indWS;
	
	public List<RegistroRow> getById(String registroId, String docs, String bytes) {
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/registro/{registroId}?docs={docs}&bytes={bytes}";
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("registroId", registroId);
		params.put("docs", registroId);
		params.put("bytes", bytes);
		
		String json = gedDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		List<JSONObject> listaJson = jsonUtils.getListaJson(json, null);
		return listaRegistro(listaJson);
	}
	
	public List<RegistroRow> getByArea(String areaId, String registroId, String docs, String bytes) {
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/registro/pesquisa/{areaId}/{registroId}?docs={docs}&bytes={bytes}";
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("areaId", areaId);
		params.put("registroId", registroId);
		params.put("docs", docs);
		params.put("bytes", bytes);
		
		String json = gedDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		List<JSONObject> listaJson = jsonUtils.getListaJson(json, null);
		return listaRegistro(listaJson);
	}
	
	public void deletarRegistro(String registroId) {
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/registro/{registroId}";
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("registroId", registroId);
		gedDAO.delete(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
	}
	
	public List<RegistroRow> listaRegistro(List<JSONObject>  listaJson){
		
		List<RegistroRow> listaRegistro = new ArrayList<>();
		
		for (JSONObject jReg : listaJson) {
			RegistroRow reg = new RegistroRow();
			reg.setId(jReg.optString("id"));
			reg.setIdArea(jReg.optString("idArea"));
			reg.setIdUsuario(jReg.optLong("idUsuario"));
			reg.setRemovido(jReg.getBoolean("removido"));
			reg.setAssuntoNotificacao(jReg.optString("assuntoNotificacao"));
			reg.setCorpoNotificacao(jReg.optString("corpoNotificacao"));
			reg.setDestinatarioNotificacao(jReg.optString("destinatarioNotificacao"));
			reg.setDestinatarioNotificacao(jReg.optString("destinatarioNotificacao"));
			reg.setListaIndice(indWS.getListaIndice(jsonUtils.getListaJson(null, jReg.optJSONArray("listaIndice"))));
			reg.setListaDocumento(docWS.getListaDocumento(jsonUtils.getListaJson(null, jReg.optJSONArray("listaDocumento"))));
			listaRegistro.add(reg);
		}
		
		return listaRegistro;
	}
}
