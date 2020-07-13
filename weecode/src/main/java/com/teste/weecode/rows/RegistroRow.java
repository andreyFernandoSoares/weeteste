package com.teste.weecode.rows;

import java.util.List;

public class RegistroRow {
	
	private String id;
	private String idArea;
	private Long idUsuario;
	private boolean removido;
	private String destinatarioNotificacao;
	private String remetenteNotificacao;
	private String assuntoNotificacao;
	private String corpoNotificacao;
	private List<DocumentoRow> listaDocumento;
	private List<IndiceRow> listaIndice;
	private InfoWorkFlowRow infoWorkflow;
	
	public RegistroRow() {
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdArea() {
		return idArea;
	}
	
	public void setIdArea(String idArea) {
		this.idArea = idArea;
	}
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public boolean isRemovido() {
		return removido;
	}
	
	public void setRemovido(boolean removido) {
		this.removido = removido;
	}
	
	public String getDestinatarioNotificacao() {
		return destinatarioNotificacao;
	}
	
	public void setDestinatarioNotificacao(String destinatarioNotificacao) {
		this.destinatarioNotificacao = destinatarioNotificacao;
	}
	
	public String getRemetenteNotificacao() {
		return remetenteNotificacao;
	}
	
	public void setRemetenteNotificacao(String remetenteNotificacao) {
		this.remetenteNotificacao = remetenteNotificacao;
	}
	
	public String getAssuntoNotificacao() {
		return assuntoNotificacao;
	}
	
	public void setAssuntoNotificacao(String assuntoNotificacao) {
		this.assuntoNotificacao = assuntoNotificacao;
	}
	
	public String getCorpoNotificacao() {
		return corpoNotificacao;
	}
	
	public void setCorpoNotificacao(String corpoNotificacao) {
		this.corpoNotificacao = corpoNotificacao;
	}
	
	public List<DocumentoRow> getListaDocumento() {
		return listaDocumento;
	}
	
	public void setListaDocumento(List<DocumentoRow> listaDocumento) {
		this.listaDocumento = listaDocumento;
	}

	public List<IndiceRow> getListaIndice() {
		return listaIndice;
	}

	public void setListaIndice(List<IndiceRow> listaIndice) {
		this.listaIndice = listaIndice;
	}

	public InfoWorkFlowRow getInfoWorkflow() {
		return infoWorkflow;
	}

	public void setInfoWorkflow(InfoWorkFlowRow infoWorkflow) {
		this.infoWorkflow = infoWorkflow;
	}
}