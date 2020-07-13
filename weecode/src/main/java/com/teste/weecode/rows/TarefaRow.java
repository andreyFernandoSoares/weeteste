package com.teste.weecode.rows;

import java.util.Date;
import java.util.List;

public class TarefaRow {
	
	private String nomeTarefa;
	private String nomeProcesso;
	private Long idTarefa;
	private String nomeNode;
	private Date dataCriacaoTarefa;
	private Date dataInicioProcesso;
	private List<String> listaTransicoes;
	private String idRegistro;
	private String idArea;
	private List<String> listaFluxos;
	private Date finalPrevisto;
	private List<String> listaNomeGrupo;
	private List<String> listaNomeUsuario;
	private String ator;
	private String nomeAtor;
	private String farol;
	private List<String> mensagens;
	private String mensagem;
	
	public String getNomeTarefa() {
		return nomeTarefa;
	}
	
	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}
	
	public String getNomeProcesso() {
		return nomeProcesso;
	}
	
	public void setNomeProcesso(String nomeProcesso) {
		this.nomeProcesso = nomeProcesso;
	}
	
	public Long getIdTarefa() {
		return idTarefa;
	}
	
	public void setIdTarefa(Long idTarefa) {
		this.idTarefa = idTarefa;
	}
	
	public String getNomeNode() {
		return nomeNode;
	}
	
	public void setNomeNode(String nomeNode) {
		this.nomeNode = nomeNode;
	}
	
	public Date getDataCriacaoTarefa() {
		return dataCriacaoTarefa;
	}
	
	public void setDataCriacaoTarefa(Date dataCriacaoTarefa) {
		this.dataCriacaoTarefa = dataCriacaoTarefa;
	}
	
	public Date getDataInicioProcesso() {
		return dataInicioProcesso;
	}
	
	public void setDataInicioProcesso(Date dataInicioProcesso) {
		this.dataInicioProcesso = dataInicioProcesso;
	}
	
	public List<String> getListaTransicoes() {
		return listaTransicoes;
	}
	
	public void setListaTransicoes(List<String> listaTransicoes) {
		this.listaTransicoes = listaTransicoes;
	}
	
	public String getIdRegistro() {
		return idRegistro;
	}
	
	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}
	
	public String getIdArea() {
		return idArea;
	}
	
	public void setIdArea(String idArea) {
		this.idArea = idArea;
	}
	
	public List<String> getListaFluxos() {
		return listaFluxos;
	}
	
	public void setListaFluxos(List<String> listaFluxos) {
		this.listaFluxos = listaFluxos;
	}
	
	public Date getFinalPrevisto() {
		return finalPrevisto;
	}
	
	public void setFinalPrevisto(Date finalPrevisto) {
		this.finalPrevisto = finalPrevisto;
	}
	
	public List<String> getListaNomeGrupo() {
		return listaNomeGrupo;
	}
	
	public void setListaNomeGrupo(List<String> listaNomeGrupo) {
		this.listaNomeGrupo = listaNomeGrupo;
	}
	
	public List<String> getListaNomeUsuario() {
		return listaNomeUsuario;
	}
	
	public void setListaNomeUsuario(List<String> listaNomeUsuario) {
		this.listaNomeUsuario = listaNomeUsuario;
	}
	
	public String getAtor() {
		return ator;
	}
	
	public void setAtor(String ator) {
		this.ator = ator;
	}
	
	public String getNomeAtor() {
		return nomeAtor;
	}
	
	public void setNomeAtor(String nomeAtor) {
		this.nomeAtor = nomeAtor;
	}
	
	public String getFarol() {
		return farol;
	}
	
	public void setFarol(String farol) {
		this.farol = farol;
	}
	
	public List<String> getMensagens() {
		return mensagens;
	}
	
	public void setMensagens(List<String> mensagens) {
		this.mensagens = mensagens;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
