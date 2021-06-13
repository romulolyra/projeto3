package com.paco.pop.model;

import java.sql.Date;

public class FileiraEstoque {

		private Rolo listaRolos;
		private int qtdFinal;
		private Date dataEntrega;

		public Rolo getListaRolos() {
			return listaRolos;
		}

		public void setListaRolos(Rolo listaRolos) {
			this.listaRolos = listaRolos;
		}

		public int getQtdFinal() {
			return qtdFinal;
		}

		public void setQtdFinal(int qtdFinal) {
			this.qtdFinal = qtdFinal;
		}

		public Date getDataEntrega() {
			return dataEntrega;
		}
		
		public void setDataEntrega(Date dataEntrega) {
			this.dataEntrega = dataEntrega;
		}

}
