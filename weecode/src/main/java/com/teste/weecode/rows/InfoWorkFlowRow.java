package com.teste.weecode.rows;

public class InfoWorkFlowRow {
	
	private String nomeProcesso;
	private Integer prazoDias;
	private Integer prazoHoras;
	private Integer avisoDias;
	private Integer avisoHoras;
	private boolean diasUteis;
	
	public InfoWorkFlowRow() {
	}

	public String getNomeProcesso() {
		return nomeProcesso;
	}

	public void setNomeProcesso(String nomeProcesso) {
		this.nomeProcesso = nomeProcesso;
	}

	public Integer getPrazoDias() {
		return prazoDias;
	}

	public void setPrazoDias(Integer prazoDias) {
		this.prazoDias = prazoDias;
	}

	public Integer getPrazoHoras() {
		return prazoHoras;
	}

	public void setPrazoHoras(Integer prazoHoras) {
		this.prazoHoras = prazoHoras;
	}

	public Integer getAvisoDias() {
		return avisoDias;
	}

	public void setAvisoDias(Integer avisoDias) {
		this.avisoDias = avisoDias;
	}

	public Integer getAvisoHoras() {
		return avisoHoras;
	}

	public void setAvisoHoras(Integer avisoHoras) {
		this.avisoHoras = avisoHoras;
	}

	public boolean isDiasUteis() {
		return diasUteis;
	}

	public void setDiasUteis(boolean diasUteis) {
		this.diasUteis = diasUteis;
	}
}
