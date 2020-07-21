package com.teste.weecode.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.teste.weecode.dao.GedDAO;
import com.teste.weecode.rows.AreaRow;
import com.teste.weecode.rows.IndiceRow;
import com.teste.weecode.utils.HttpUtils;
import com.teste.weecode.utils.JsonUtils;

public class IndiceWS {
	
	@Autowired
	GedDAO gedDAO;
	
	@Autowired
	JsonUtils jsonUtils;
	
	@Autowired
	AuxiliarWS auxWS;
	
	@Autowired
	AreaWS areaWS;
	
	@Autowired
	HttpUtils httpUtils;
	
	public List<AreaRow> getByIdentificador(String areaId, String identificador, String localizacao){
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/indice/{areaId}/{identificador}?localizacao={localizacao}";
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("areaId", areaId);
		params.put("identificador", identificador);
		params.put("localizacao", localizacao);
		String json = gedDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		List<JSONObject> listaJson = jsonUtils.getListaJson(json, null);
		return areaWS.getListaArea(listaJson);
	}
	
	public List<AreaRow> getByUsuario(String identificador, String usuarioId){
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/indice/porusuario/{identificador}?idUsuario={usuarioId}";
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("identificador", identificador);
		params.put("usuarioId", usuarioId);
		String json = gedDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		List<JSONObject> listaJson = jsonUtils.getListaJson(json, null);
		return areaWS.getListaArea(listaJson);
	}
	
	public List<IndiceRow> getListaIndice(List<JSONObject> listaJson){
		
		List<IndiceRow> listaIndice = new ArrayList<>();
		
		for (JSONObject jIndice : listaJson) {
			IndiceRow indice = new IndiceRow();
			indice.setIdArea(jIndice.optString("idArea"));
			indice.setIdAreaReferenciada(jIndice.optString("idAreaReferenciada"));
			indice.setDescricao(jIndice.optString("descricao"));
			indice.setIdTipoIndice(jIndice.getInt("idTipoIndice"));
			indice.setIdentificador(jIndice.optString("identificador"));
			indice.setValor(jIndice.optString("valor"));
			indice.setTamanho(jIndice.optInt("tamanho"));
			indice.setOrdem(jIndice.optInt("ordem"));
			indice.setUnico(jIndice.getBoolean("unico"));
			indice.setExibidoNoEmail(jIndice.getBoolean("exibidoNoEmail"));
			indice.setAlteravel(jIndice.getBoolean("alteravel"));
			indice.setProtegidoPeloSistema(jIndice.getBoolean("protegidoPeloSistema"));
			indice.setPreenchimentoHabilitado(jIndice.getBoolean("preenchimentoHabilitado"));
			indice.setPreenchimentoObrigatorio(jIndice.getBoolean("preenchimentoObrigatorio"));
			indice.setUtilizadoParaBusca(jIndice.getBoolean("utilizadoParaBusca"));
			indice.setExportavel(jIndice.getBoolean("exportavel"));
			indice.setSomenteCadastro(jIndice.getBoolean("somenteCadastro"));
			indice.setUtilizadoParaAssociacao(jIndice.getBoolean("utilizadoParaAssociacao"));
			indice.setExibidoNaPesquisa(jIndice.getBoolean("exibidoNaPesquisa"));
			indice.setOrdenavel(jIndice.getBoolean("ordenavel"));
			indice.setIdMascara(jIndice.optInt("idMascara"));
			indice.setMoeda(jIndice.optString("moeda"));
			indice.setDate(false);
			
			if (jIndice.optString("valores") != null)
				indice.setValores(jsonUtils.getListaString(jIndice.optString("valores")));
			
			if (jIndice.get("listaMultivalorado") != null)
				indice.setListaMultivalorado(auxWS.getListaMultiValorado(jsonUtils.getListaJson(null, jIndice.optJSONArray("listaMultivalorado"))));
		
			listaIndice.add(indice);
		}
		
		return listaIndice;
	}
}
