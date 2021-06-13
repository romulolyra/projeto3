package com.paco.pop.model;

public class Rolo {
	private static int PROX_ID = 1;

	private int roloId;
	private TipoRolo tipo;
	private MaquinaTrefila produzidoPor;

	public Rolo(TipoRolo tipo, MaquinaTrefila produzidoPor) {
		this.tipo = tipo;
		this.produzidoPor = produzidoPor;
		PROX_ID += 1;
	}

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
