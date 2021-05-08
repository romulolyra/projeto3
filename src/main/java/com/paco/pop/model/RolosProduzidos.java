package com.paco.pop.model;

public class RolosProduzidos {

	private int roloId;
	private TipoRolo tipo;
	private MaquinaTrefila produzidoPor;
	public int getRoloId() {
		return roloId;
	}
	public void setRoloId(int roloId) {
		this.roloId = roloId;
	}
	public TipoRolo getTipo() {
		return tipo;
	}
	public void setTipo(TipoRolo tipo) {
		this.tipo = tipo;
	}
	public MaquinaTrefila getProduzidoPor() {
		return produzidoPor;
	}
	public void setProduzidoPor(MaquinaTrefila produzidoPor) {
		this.produzidoPor = produzidoPor;
	}


}
