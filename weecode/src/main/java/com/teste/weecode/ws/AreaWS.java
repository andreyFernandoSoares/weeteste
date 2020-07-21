package com.teste.weecode.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.google.gson.Gson;
import com.teste.weecode.dao.GedDAO;
import com.teste.weecode.rows.AreaRow;
import com.teste.weecode.utils.HttpUtils;
import com.teste.weecode.utils.JsonUtils;

public class AreaWS {
	
	@Autowired
	GedDAO gedDAO;
	
	@Autowired
	HttpUtils httpUtils;
	
	@Autowired
	JsonUtils jsonUtils;
	
	@Autowired
	IndiceWS indWS;
	
	public String getId(String nome) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("nome", nome);
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/area?nome={nome}";
		String json = gedDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		
		if (!"[]".equals(json)) {
			JSONArray jsonArray = new JSONArray(json);
			Gson gson = new Gson();
			AreaRow areaRow = gson.fromJson(jsonArray.get(0).toString(), AreaRow.class);
			return "ID: "+areaRow.getId();
		} else {
			return "Nome invalido! Está area não existe.";
		}
	}
	
	public String getNome(String id) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/area/{id}/nome";
		String nome = gedDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		
		if (nome != null) {
			AreaRow areaRow = new AreaRow();
			areaRow.setNome(nome);
			return "Nome: "+areaRow.getNome();
		} else {
			return "Id invalido! Está area não existe.";
		}
	}
	
	public String criarArea(String nome) {
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/area";
		String id = gedDAO.post(url, httpUtils.entidadeHttp(nome, MediaType.APPLICATION_JSON));
		AreaRow areaRow = new AreaRow();
		areaRow.setId(id);
		return areaRow.getId();
	}
	
	public String deletarArea(String id, String definitivo) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		params.put("definitivo", definitivo);
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/area/{id}?definitivo={definitivo}";
		Integer resposta = gedDAO.delete(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		
		if (resposta == 200) 
			return "Area deletada com sucesso";
		else 
			return "Não foi possivel deletar";
	}
	
	public String moverArea(String id, String idPai) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		params.put("idPai", idPai);
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/area/{id}";
		Integer resposta = gedDAO.put(url, httpUtils.entidadeHttp((String) params.get("idPai"), MediaType.TEXT_PLAIN), params);
		
		if (resposta == 200) 
			return "Area movida com sucesso";
		else 
			return "Não foi possivel mover";
	}
	
	public String getDocumentosArea(String id) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/area/{id}/documentos";
		return gedDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
	}
	
	public String getPaiArea(String id) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/area/{id}/pai";
		String areaPai = gedDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		AreaRow arearow = new AreaRow();
		arearow.setNomePai(areaPai);
		return arearow.getNomePai();
	}
	
	public List<AreaRow> listaTemporalidade(){
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/area/temporalidade";
		String json = gedDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), new HashMap<String, Object>());
		List<JSONObject> listaJson = jsonUtils.getListaJson(json, null);
		return getListaArea(listaJson);
	}
	
	public List<AreaRow> getListaArea(List<JSONObject> listaJson) {
		
		List<AreaRow> listaArea = new ArrayList<>();
		
		for (JSONObject jArea : listaJson) {
			AreaRow area = new AreaRow();
			area.setId(jArea.optString("id"));
			area.setNome(jArea.optString("nome"));
			area.setIdAreaPai(jArea.optString("idAreaPai"));
			area.setNomePai(jArea.optString("nomePai"));
			area.setInserirTemporalidade(jArea.getBoolean("inserirTemporalidade"));
			area.setRemovido(jArea.getBoolean("removido"));
			area.setListaIndicesRegistro(indWS.getListaIndice(jsonUtils.getListaJson(null, jArea.optJSONArray("listaIndicesRegistro"))));
			area.setListaIndiceDocumento(indWS.getListaIndice(jsonUtils.getListaJson(null, jArea.optJSONArray("listaIndiceDocumento"))));
			listaArea.add(area);
		}
		
		return listaArea;
	}
}