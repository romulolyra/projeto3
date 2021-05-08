package com.paco.pop.model;

public class ProducaoPlanejadaRolos {

	private int producaoId;
	private int qtdPLanejadaRolos;
	private MaquinaDestino destino;
	public int getProducaoId() {
		return producaoId;
	}
	public void setProducaoId(int producaoId) {
		this.producaoId = producaoId;
	}
	public int getQtdPLanejadaRolos() {
		return qtdPLanejadaRolos;
	}
	public void setQtdPLanejadaRolos(int qtdPLanejadaRolos) {
		this.qtdPLanejadaRolos = qtdPLanejadaRolos;
	}
	public MaquinaDestino getDestino() {
		return destino;
	}
	public void setDestino(MaquinaDestino destino) {
		this.destino = destino;
	}

}
