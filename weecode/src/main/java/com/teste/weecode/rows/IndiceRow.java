package com.teste.weecode.rows;

import java.util.List;

public class IndiceRow {
	
	private String idArea;
	private String idAreaReferenciada;
	private String descricao;
	private Integer idTipoIndice;
	private String identificador;
	private String valor;
	private List<String> valores;
	private List<MultiValoresRow> listaMultivalorado;
	private Integer tamanho;
	private Integer ordem;
	private boolean unico;
	private boolean alteravel;
	private boolean protegidoPeloSistema;
	private boolean preenchimentoHabilitado;
	private boolean preenchimentoObrigatorio;
	private boolean utilizadoParaBusca;
	private boolean exportavel;
	private boolean somenteCadastro;
	private boolean utilizadoParaAssociacao;
	private boolean exibidoNaPesquisa;
	private boolean ordenavel;
	private boolean exibidoNoEmail;
	private Integer idMascara;
	private String moeda;
	private boolean date;
	
	public IndiceRow() {
	}

	public String getIdArea() {
		return idArea;
	}

	public void setIdArea(String idArea) {
		this.idArea = idArea;
	}

	public String getIdAreaReferenciada() {
		return idAreaReferenciada;
	}

	public void setIdAreaReferenciada(String idAreaReferenciada) {
		this.idAreaReferenciada = idAreaReferenciada;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getIdTipoIndice() {
		return idTipoIndice;
	}

	public void setIdTipoIndice(Integer idTipoIndice) {
		this.idTipoIndice = idTipoIndice;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public List<String> getValores() {
		return valores;
	}

	public void setValores(List<String> valores) {
		this.valores = valores;
	}

	public List<MultiValoresRow> getListaMultivalorado() {
		return listaMultivalorado;
	}

	public void setListaMultivalorado(List<MultiValoresRow> listaMultivalorado) {
		this.listaMultivalorado = listaMultivalorado;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public boolean isUnico() {
		return unico;
	}

	public void setUnico(boolean unico) {
		this.unico = unico;
	}

	public boolean isAlteravel() {
		return alteravel;
	}

	public void setAlteravel(boolean alteravel) {
		this.alteravel = alteravel;
	}

	public boolean isProtegidoPeloSistema() {
		return protegidoPeloSistema;
	}

	public void setProtegidoPeloSistema(boolean protegidoPeloSistema) {
		this.protegidoPeloSistema = protegidoPeloSistema;
	}

	public boolean isPreenchimentoHabilitado() {
		return preenchimentoHabilitado;
	}

	public void setPreenchimentoHabilitado(boolean preenchimentoHabilitado) {
		this.preenchimentoHabilitado = preenchimentoHabilitado;
	}

	public boolean isPreenchimentoObrigatorio() {
		return preenchimentoObrigatorio;
	}

	public void setPreenchimentoObrigatorio(boolean preenchimentoObrigatorio) {
		this.preenchimentoObrigatorio = preenchimentoObrigatorio;
	}

	public boolean isUtilizadoParaBusca() {
		return utilizadoParaBusca;
	}

	public void setUtilizadoParaBusca(boolean utilizadoParaBusca) {
		this.utilizadoParaBusca = utilizadoParaBusca;
	}

	public boolean isExportavel() {
		return exportavel;
	}

	public void setExportavel(boolean exportavel) {
		this.exportavel = exportavel;
	}

	public boolean isSomenteCadastro() {
		return somenteCadastro;
	}

	public void setSomenteCadastro(boolean somenteCadastro) {
		this.somenteCadastro = somenteCadastro;
	}

	public boolean isUtilizadoParaAssociacao() {
		return utilizadoParaAssociacao;
	}

	public void setUtilizadoParaAssociacao(boolean utilizadoParaAssociacao) {
		this.utilizadoParaAssociacao = utilizadoParaAssociacao;
	}

	public boolean isExibidoNaPesquisa() {
		return exibidoNaPesquisa;
	}

	public void setExibidoNaPesquisa(boolean exibidoNaPesquisa) {
		this.exibidoNaPesquisa = exibidoNaPesquisa;
	}

	public boolean isOrdenavel() {
		return ordenavel;
	}

	public void setOrdenavel(boolean ordenavel) {
		this.ordenavel = ordenavel;
	}

	public boolean isExibidoNoEmail() {
		return exibidoNoEmail;
	}

	public void setExibidoNoEmail(boolean exibidoNoEmail) {
		this.exibidoNoEmail = exibidoNoEmail;
	}

	public Integer getIdMascara() {
		return idMascara;
	}

	public void setIdMascara(Integer idMascara) {
		this.idMascara = idMascara;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public boolean isDate() {
		return date;
	}

	public void setDate(boolean date) {
		this.date = date;
	}
}