package com.montelimar.rest.model;

import javax.persistence.*;

@Entity
@Table(name = "HumedadFardos")
public class HumedadFardos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idhumedadfardos;
	
	private long Idformulario;
	private long Orden;
	private String Descripcion;


	public HumedadFardos() {
	}


	public HumedadFardos( long idformulario, String descripcion, long orden) {
		super();
		Idformulario = idformulario;
		Descripcion = descripcion;
		Orden = orden;
	}


	public long getIdhumedadfardos() {
		return idhumedadfardos;
	}


	public void setIdhumedadfardos(long idhumedadfardos) {
		this.idhumedadfardos = idhumedadfardos;
	}

	@Column(name = "Idformulario", nullable = false)
	public long getIdformulario() {
		return Idformulario;
	}


	public void setIdformulario(long idformulario) {
		Idformulario = idformulario;
	}

	@Column(name = "Descripcion", nullable = false)
	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
		
	}


	public long getOrden() {
		return Orden;
	}

	@Column(name = "Orden", nullable = false)
	public void setOrden(long orden) {
		this.Orden = orden;
	}


	@Override
	public String toString() {
		return "HumedadFardos [idhumedadfardos=" + idhumedadfardos + ", Idformulario=" + Idformulario + ", Orden="
				+ Orden + ", Descripcion=" + Descripcion + "]";
	}


	
	
	
	

	
}
