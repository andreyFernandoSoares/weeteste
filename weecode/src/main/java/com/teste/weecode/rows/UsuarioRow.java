package com.teste.weecode.rows;

public class UsuarioRow {
	
	private Long idUsuario;
	private String nome;
	private Long idPerfilAdm;
	private String tituloPerfilAdm;
	private String idAreaPadrao;
	private String token;
	
	public UsuarioRow() {
		
	}
	
	public UsuarioRow(String token) {
		this.token = token;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdPerfilAdm() {
		return idPerfilAdm;
	}

	public void setIdPerfilAdm(Long idPerfilAdm) {
		this.idPerfilAdm = idPerfilAdm;
	}

	public String getTituloPerfilAdm() {
		return tituloPerfilAdm;
	}

	public void setTituloPerfilAdm(String tituloPerfilAdm) {
		this.tituloPerfilAdm = tituloPerfilAdm;
	}

	public String getIdAreaPadrao() {
		return idAreaPadrao;
	}

	public void setIdAreaPadrao(String idAreaPadrao) {
		this.idAreaPadrao = idAreaPadrao;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}