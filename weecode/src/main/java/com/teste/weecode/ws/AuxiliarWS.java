package com.teste.weecode.ws;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.teste.weecode.rows.HistoricoDocumentoRow;
import com.teste.weecode.rows.ImagemRow;
import com.teste.weecode.rows.MultiValoresRow;
import com.teste.weecode.utils.DateUtils;
import com.teste.weecode.utils.JsonUtils;

public class AuxiliarWS {
	
	@Autowired
	DateUtils dateUtils;
	
	@Autowired
	JsonUtils jsonUtils;
	
	@Autowired
	IndiceWS indWS;
	
	public List<MultiValoresRow> getListaMultiValorado(List<JSONObject> listaJson){
		
		List<MultiValoresRow> listaMultivalorado = new ArrayList<>();
		
		for (JSONObject jMulti : listaJson) {
			MultiValoresRow multivalor = new MultiValoresRow();
			multivalor.setValor(jMulti.optInt("valor"));
			multivalor.setDescricao(jMulti.optString("descricao"));
			multivalor.setOrdem(jMulti.optInt("ordem"));
			multivalor.setRemovido(jMulti.getBoolean("removido"));
			listaMultivalorado.add(multivalor);
		}
		
		return listaMultivalorado;
	}
	
	public List<ImagemRow> getListaImagens(List<JSONObject> listaJson){
		
		List<ImagemRow> listaImagens = new ArrayList<>();
		
		for (JSONObject jImg : listaJson) {
			ImagemRow img = new ImagemRow();
			img.setImagem(jImg.optString("imagem"));
			listaImagens.add(img);
		}
		
		return listaImagens;
	}
	
	public List<HistoricoDocumentoRow> getListaHistoricoDocumento(List<JSONObject> listaJson) {
		
		List<HistoricoDocumentoRow> listaHistDoc = new ArrayList<>();
		
		for (JSONObject jHistDoc : listaJson) {
			HistoricoDocumentoRow histDoc = new HistoricoDocumentoRow();
			histDoc.setId(jHistDoc.optString("id"));
			histDoc.setIdArea(jHistDoc.optString("idArea"));
			histDoc.setIdRegistro(jHistDoc.optString("idRegistro"));
			histDoc.setEndereco(jHistDoc.optString("endereco"));
			histDoc.setIdTemplate(jHistDoc.optLong("idTemplate"));
			histDoc.setBytes(jHistDoc.optString("bytes"));
			histDoc.setNomeResponsavelRemocao(jHistDoc.optString("nomeResponsavelRemocao"));
			histDoc.setVersao(jHistDoc.optString("versao"));
			histDoc.setIdUsuario(jHistDoc.optLong("idUsuario"));
			histDoc.setResponsavelRemocao(jHistDoc.optLong("responsavelRemocao"));
			histDoc.setEnviado(jHistDoc.getBoolean("enviado"));
			histDoc.setRemovido(jHistDoc.getBoolean("removido"));
			histDoc.setDataAlteracao(dateUtils.converterData(jHistDoc.optString("dataAlteracao")));
			histDoc.setDataCriacao(dateUtils.converterData(jHistDoc.optString("dataCriacao")));
			histDoc.setDataRemocao(dateUtils.converterData(jHistDoc.optString("dataRemocao")));
			histDoc.setImagem(getListaImagens(jsonUtils.getListaJson(null, jHistDoc.optJSONArray("imagem"))));
			histDoc.setListaIndice(indWS.getListaIndice(jsonUtils.getListaJson(null, jHistDoc.optJSONArray("listaIndice"))));
			listaHistDoc.add(histDoc);
		}
		
		return listaHistDoc;
	}
}
