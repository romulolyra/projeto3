package com.paco.pop.model;

public class Estoque {

	private FileiraEstoque fileiras; // FAZER LISTA 
	private int qtdAtualFileiras;
	private MaquinaDestino localizacao;
	public FileiraEstoque getFileiras() {
		return fileiras;
	}
	public void setFileiras(FileiraEstoque fileiras) {
		this.fileiras = fileiras;
	}
	public int getQtdAtualFileiras() {
		return qtdAtualFileiras;
	}
	public void setQtdAtualFileiras(int qtdAtualFileiras) {
		this.qtdAtualFileiras = qtdAtualFileiras;
	}
	public MaquinaDestino getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(MaquinaDestino localizacao) {
		this.localizacao = localizacao;
	}
	

}
