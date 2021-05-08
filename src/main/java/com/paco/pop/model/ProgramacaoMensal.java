package com.paco.pop.model;

import java.sql.Date;

public class ProgramacaoMensal {

	private int programacaoMensalId;
	private int qtdPlanejadaPregos;
	private int qtdPlanejadaRecozimento;
	private int qtdPlanejadaGalva;
	private Date dataEntrega;
	private Date dataInicio;
	public int getProgramacaoMensalId() {
		return programacaoMensalId;
	}
	public void setProgramacaoMensalId(int programacaoMensalId) {
		this.programacaoMensalId = programacaoMensalId;
	}
	public int getQtdPlanejadaPregos() {
		return qtdPlanejadaPregos;
	}
	public void setQtdPlanejadaPregos(int qtdPlanejadaPregos) {
		this.qtdPlanejadaPregos = qtdPlanejadaPregos;
	}
	public int getQtdPlanejadaRecozimento() {
		return qtdPlanejadaRecozimento;
	}
	public void setQtdPlanejadaRecozimento(int qtdPlanejadaRecozimento) {
		this.qtdPlanejadaRecozimento = qtdPlanejadaRecozimento;
	}
	public int getQtdPlanejadaGalva() {
		return qtdPlanejadaGalva;
	}
	public void setQtdPlanejadaGalva(int qtdPlanejadaGalva) {
		this.qtdPlanejadaGalva = qtdPlanejadaGalva;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
}
