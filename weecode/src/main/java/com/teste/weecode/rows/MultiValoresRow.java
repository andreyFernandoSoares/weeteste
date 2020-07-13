package com.teste.weecode.rows;

public class MultiValoresRow {
	
	private Integer valor;
	private String descricao;
	private Integer ordem;
	private boolean removido;
	
	public MultiValoresRow() {
	}
	
	public Integer getValor() {
		return valor;
	}
	
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getOrdem() {
		return ordem;
	}
	
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	
	public boolean isRemovido() {
		return removido;
	}
	
	public void setRemovido(boolean removido) {
		this.removido = removido;
	}
}
