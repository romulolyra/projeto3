package com.paco.pop.model;

import java.sql.Date;

public class FileiraEstoque {

		private RolosProduzidos listaRolos; //Eu sei que nao eh uma lista 
		private int qtdFinal;
		private Date dataEntrega;
		public RolosProduzidos getListaRolos() {
			return listaRolos;
		}
		public void setListaRolos(RolosProduzidos listaRolos) {
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
