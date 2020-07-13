package com.teste.weecode.rows;

public class FluxoRegistroRow {
	
	private TramiteRow tramite;
	private AvisarRow avisar;
	private String processo;
	private boolean diasUteis;
	private Long idUsuario;
	private String idRegistro;
	private String idArea;
	
	public TramiteRow getTramite() {
		return tramite;
	}
	
	public void setTramite(TramiteRow tramite) {
		this.tramite = tramite;
	}
	
	public AvisarRow getAvisar() {
		return avisar;
	}
	
	public void setAvisar(AvisarRow avisar) {
		this.avisar = avisar;
	}
	
	public String getProcesso() {
		return processo;
	}
	
	public void setProcesso(String processo) {
		this.processo = processo;
	}
	
	public boolean isDiasUteis() {
		return diasUteis;
	}
	
	public void setDiasUteis(boolean diasUteis) {
		this.diasUteis = diasUteis;
	}
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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
}
