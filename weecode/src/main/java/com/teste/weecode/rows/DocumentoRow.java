package com.teste.weecode.rows;

import java.util.Date;
import java.util.List;

public class DocumentoRow {
	
	private String id;
	private String endereco;
	private String idArea;
	private String idRegistro;
	private Long idTemplate;
	private Long idUsuario;
	private boolean removido;
	private String bytes;
	private String nomeResponsavelRemocao;
	private Long responsavelRemocao;
	private Date dataRemocao;
	private Date dataAlteracao;
	private Date dataCriacao;
	private String versao;
	private boolean enviado;
	private List<ImagemRow> imagem;
	private List<HistoricoDocumentoRow> listaHistorico;
	private List<IndiceRow> listaIndice;
	
	public DocumentoRow() {
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getIdArea() {
		return idArea;
	}

	public void setIdArea(String idArea) {
		this.idArea = idArea;
	}

	public String getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Long getIdTemplate() {
		return idTemplate;
	}

	public void setIdTemplate(Long idTemplate) {
		this.idTemplate = idTemplate;
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

	public String getNomeResponsavelRemocao() {
		return nomeResponsavelRemocao;
	}

	public void setNomeResponsavelRemocao(String nomeResponsavelRemocao) {
		this.nomeResponsavelRemocao = nomeResponsavelRemocao;
	}

	public Long getResponsavelRemocao() {
		return responsavelRemocao;
	}

	public void setResponsavelRemocao(Long responsavelRemocao) {
		this.responsavelRemocao = responsavelRemocao;
	}

	public Date getDataRemocao() {
		return dataRemocao;
	}

	public void setDataRemocao(Date dataRemocao) {
		this.dataRemocao = dataRemocao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public boolean isEnviado() {
		return enviado;
	}

	public void setEnviado(boolean enviado) {
		this.enviado = enviado;
	}
	
	public List<ImagemRow> getImagem() {
		return imagem;
	}

	public void setImagem(List<ImagemRow> imagem) {
		this.imagem = imagem;
	}

	public List<HistoricoDocumentoRow> getListaHistorico() {
		return listaHistorico;
	}

	public void setListaHistorico(List<HistoricoDocumentoRow> listaHistorico) {
		this.listaHistorico = listaHistorico;
	}

	public List<IndiceRow> getListaIndice() {
		return listaIndice;
	}

	public void setListaIndice(List<IndiceRow> listaIndice) {
		this.listaIndice = listaIndice;
	}

	public String getBytes() {
		return bytes;
	}

	public void setBytes(String bytes) {
		this.bytes = bytes;
	}
}