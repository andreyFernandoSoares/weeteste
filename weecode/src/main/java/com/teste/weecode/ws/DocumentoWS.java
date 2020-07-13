package com.teste.weecode.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.teste.weecode.dao.GediDAO;
import com.teste.weecode.rows.DocumentoRow;
import com.teste.weecode.utils.DateUtils;
import com.teste.weecode.utils.HttpUtils;
import com.teste.weecode.utils.JsonUtils;

public class DocumentoWS {
	
	@Autowired
	GediDAO gediDAO;
	
	@Autowired
	JsonUtils jsonUtils;
	
	@Autowired
	IndiceWS indWS;
	
	@Autowired
	AuxiliarWS auxWS;
	
	@Autowired
	DateUtils dateUtils;
	
	@Autowired
	HttpUtils httpUtils;
	
	public List<DocumentoRow> getById(String documentoId, String bytes) {
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/documento/{documentoId}?bytes={bytes}";
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("documentoId", documentoId);
		params.put("bytes", bytes);
		
		String json = gediDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		List<JSONObject> listaJson = jsonUtils.getListaJson(json, null);
		return getListaDocumento(listaJson);
	}
	
	public String deletarDocumento(String documentoId) {
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/documento/{documentoId}";
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("documentoId", documentoId);
		Integer resposta = gediDAO.delete(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		
		if (resposta == 200) 
			return "Documento deletada com sucesso";
		else 
			return "Não foi possivel deletar";
	}
	
	public String moverDocumento(String documentoId, String registroId) {
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/documento/{documentoId}";
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("documentoId", documentoId);
		params.put("putObject", registroId);
		Integer resposta = gediDAO.put(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		
		if (resposta == 200) 
			return "Documento movido com sucesso";
		else 
			return "Não foi possivel mover";
	}
	
	public List<DocumentoRow> pesquisaJson(String json) {
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/documento/pesquisa";
		String resposta = gediDAO.post(url, httpUtils.entidadeHttp(json, MediaType.APPLICATION_JSON));
		List<JSONObject> listaJson = jsonUtils.getListaJson(resposta, null);
		return getListaDocumento(listaJson);
	}
	
	public List<DocumentoRow> getListaDocumento(List<JSONObject> listaJson) {
		
		List<DocumentoRow> listaDocumento = new ArrayList<>();
		
		for (JSONObject jDoc : listaJson) {
			DocumentoRow doc = new DocumentoRow();
			doc.setId(jDoc.optString("id"));
			doc.setIdArea(jDoc.optString("idArea"));
			doc.setIdRegistro(jDoc.optString("idRegistro"));
			doc.setEndereco(jDoc.optString("endereco"));
			doc.setIdTemplate(jDoc.optLong("idTemplate"));
			doc.setBytes(jDoc.optString("bytes"));
			doc.setNomeResponsavelRemocao(jDoc.optString("nomeResponsavelRemocao"));
			doc.setVersao(jDoc.optString("versao"));
			doc.setIdUsuario(jDoc.optLong("idUsuario"));
			doc.setResponsavelRemocao(jDoc.optLong("responsavelRemocao"));
			doc.setEnviado(jDoc.getBoolean("enviado"));
			doc.setRemovido(jDoc.getBoolean("removido"));
			doc.setDataAlteracao(dateUtils.converterData(jDoc.optString("dataAlteracao")));
			doc.setDataCriacao(dateUtils.converterData(jDoc.optString("dataCriacao")));
			doc.setDataRemocao(dateUtils.converterData(jDoc.optString("dataRemocao")));
			doc.setImagem(auxWS.getListaImagens(jsonUtils.getListaJson(null, jDoc.optJSONArray("imagem"))));
			doc.setListaIndice(indWS.getListaIndice(jsonUtils.getListaJson(null, jDoc.optJSONArray("listaIndice"))));
			doc.setListaHistorico(auxWS.getListaHistoricoDocumento(jsonUtils.getListaJson(null, jDoc.optJSONArray("listaHistorico"))));
			listaDocumento.add(doc);
		}
		
		return listaDocumento;
	}
}
