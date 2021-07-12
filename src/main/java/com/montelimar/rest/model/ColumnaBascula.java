package com.montelimar.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ColumnaBascula")
public class ColumnaBascula {
	

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long IdColumnabascula;

	private Long IdIngresoBascula;
	private int Columna;
	private int ordenColumna;
	
	public ColumnaBascula(){
		
	}

	public ColumnaBascula( Long idIngresoBascula, int columna, int ordenColumna) {
		super();
		
		IdColumnabascula = idIngresoBascula;
		Columna = columna;
		this.ordenColumna = ordenColumna;
	}

	public long getIdColumnaBascula() {
		return IdColumnabascula;
	}
	
	public void setIdColumnaBascula(long idColumnaBascula) {
		IdColumnabascula = idColumnaBascula;
	}
	@Column(name = "IdIngresoBascula", nullable = false)
	public Long getIdIngresoBascula() {
		return IdIngresoBascula;
	}

	public void setIdIngresoBascula(Long idIngresoBascula) {
		IdIngresoBascula = idIngresoBascula;
	}
	@Column(name = "Columna", nullable = false)
	public int getColumna() {
		return Columna;
	}

	public void setColumna(int columna) {
		Columna = columna;
	}
	@Column(name = "ordencolumna", nullable = false)
	public int getOrdenColumna() {
		return ordenColumna;
	}

	public void setOrdenColumna(int ordenColumna) {
		this.ordenColumna = ordenColumna;
	}
	
	

	@Override
	public String toString() {
		return "ColumnaBascula [IdColumnaBascula=" + IdColumnabascula + ", IdIngresoBascula=" + IdIngresoBascula
				+ ", Columna=" + Columna + ", ordenColumna=" + ordenColumna + "]";
	}
	
	
	
}
