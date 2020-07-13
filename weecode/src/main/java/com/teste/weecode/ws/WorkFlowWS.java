package com.teste.weecode.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.teste.weecode.dao.GediDAO;
import com.teste.weecode.rows.TarefaRow;
import com.teste.weecode.utils.DateUtils;
import com.teste.weecode.utils.HttpUtils;
import com.teste.weecode.utils.JsonUtils;

public class WorkFlowWS {
	
	@Autowired
	GediDAO gediDAO;
	
	@Autowired
	JsonUtils jsonUtils;
	
	@Autowired
	HttpUtils httpUtils;
	
	@Autowired
	DateUtils dateUtils;
	
	public List<TarefaRow> getTarefaUsuario(String id){
		String url = "http://cobaia.speedsoftware.com.br:8080/speed/rest/workflow?idUsuario={id}";
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		
		String json = gediDAO.get(url, httpUtils.entidadeHttp("body", MediaType.APPLICATION_JSON), params);
		List<JSONObject> listaJson = jsonUtils.getListaJson(json, null);
		return getListaTarefa(listaJson);
	}
	
	public List<TarefaRow> getListaTarefa(List<JSONObject> listaJson){
		
		List<TarefaRow> listaTarefa = new ArrayList<>();
		
		for (JSONObject jTarefa : listaJson) {
			TarefaRow tarefa = new TarefaRow();
			tarefa.setIdTarefa(jTarefa.optLong("idTarefa"));
			tarefa.setNomeTarefa(jTarefa.optString("nomeTrefa"));
			tarefa.setNomeProcesso(jTarefa.optString("nomeProcesso"));
			tarefa.setNomeNode(jTarefa.optString("nomeNode"));
			tarefa.setDataCriacaoTarefa(dateUtils.converterData(jTarefa.optString("dataCriacaoTarefa")));
			tarefa.setDataInicioProcesso(dateUtils.converterData(jTarefa.optString("dataInicioProcesso")));
			tarefa.setListaTransicoes(jsonUtils.getListaString(jTarefa.optString("listaTransicoes")));
			tarefa.setIdRegistro(jTarefa.optString("idRegistro"));
			tarefa.setFinalPrevisto(dateUtils.converterData(jTarefa.optString("finalPrevisto")));
			tarefa.setListaNomeGrupo(jsonUtils.getListaString(jTarefa.optString("listaNomeGrupo")));
			tarefa.setListaNomeUsuario(jsonUtils.getListaString(jTarefa.optString("listaNomeUsuario")));
			tarefa.setAtor(jTarefa.optString("ator"));
			tarefa.setNomeAtor(jTarefa.optString("nomeAtor"));
			tarefa.setFarol(jTarefa.optString("farol"));
			tarefa.setMensagem(jsonUtils.getListaString(jTarefa.optString("mensagem")));
			tarefa.setMensagens(jsonUtils.getListaString(jTarefa.optString("mensagens")));
			listaTarefa.add(tarefa);
		}
		
		return listaTarefa;
	}
}
