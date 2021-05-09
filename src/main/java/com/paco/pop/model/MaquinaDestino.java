package com.paco.pop.model;

public class MaquinaDestino {

	private String produtoFinal;
	private String cliente;
	private int maquinaDestinoId;

	public int getMaquinaDestinoId() {
		return maquinaDestinoId;
	}

	public void setMaquinaDestinoId(int maquinaDestinoId) {
		this.maquinaDestinoId = maquinaDestinoId;
	}

	public String getProdutoFinal() {
		return produtoFinal;
	}

	public void setProdutoFinal(String produtoFinal) {
		this.produtoFinal = produtoFinal;
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
}
