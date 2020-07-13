package com.teste.weecode.rows;

import java.util.List;

public class AreaRow {
	
	private String id;
	private String idAreaPai;
	private String nome;
	private String nomePai;
	private boolean removido;
	private boolean inserirTemporalidade;
	private List<IndiceRow> listaIndicesRegistro;
	private List<IndiceRow> listaIndiceDocumento;
	
	public AreaRow() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdAreaPai() {
		return idAreaPai;
	}

	public void setIdAreaPai(String idAreaPai) {
		this.idAreaPai = idAreaPai;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public boolean isRemovido() {
		return removido;
	}

	public void setRemovido(boolean removido) {
		this.removido = removido;
	}

	public boolean isInserirTemporalidade() {
		return inserirTemporalidade;
	}

	public void setInserirTemporalidade(boolean inserirTemporalidade) {
		this.inserirTemporalidade = inserirTemporalidade;
	}

	public List<IndiceRow> getListaIndicesRegistro() {
		return listaIndicesRegistro;
	}

	public void setListaIndicesRegistro(List<IndiceRow> listaIndicesRegistro) {
		this.listaIndicesRegistro = listaIndicesRegistro;
	}

	public List<IndiceRow> getListaIndiceDocumento() {
		return listaIndiceDocumento;
	}

	public void setListaIndiceDocumento(List<IndiceRow> listaIndiceDocumento) {
		this.listaIndiceDocumento = listaIndiceDocumento;
	}
}
