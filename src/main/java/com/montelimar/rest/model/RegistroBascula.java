package com.montelimar.rest.model;

import javax.persistence.*;

@Entity
@Table(name ="IngresoBascula")
public class RegistroBascula extends Jutilidades {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdBascula;
	
	private String NumeroBascula;
	private String Placa;
	private int  NumeroFardos;
	private String TipoProceso;
	private String N_Estibas;
	private String NombreFiscal;

	public RegistroBascula() {
		
	}

	public RegistroBascula(long idBascula, String numeroBascula, String placa, int numeroFardos, String tipoProceso,
			String n_Estibas, String nombreFiscal) {
		super();
		IdBascula = idBascula;
		NumeroBascula = numeroBascula;
		Placa = placa;
		NumeroFardos = numeroFardos;
		TipoProceso = tipoProceso;
		N_Estibas = n_Estibas;
		NombreFiscal = nombreFiscal;
	}

	public long getIdBascula() {
		return IdBascula;
	}

	public void setIdBascula(long idBascula) {
		IdBascula = idBascula;
	}

	@Column(name = "NumeroBascula", nullable = false)
	public String getNumeroBascula() {
		return NumeroBascula;
	}

	public void setNumeroBascula(String numeroBascula) {
		NumeroBascula = numeroBascula;
	}

	@Column(name = "Placa", nullable = false)
	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	@Column(name = "NumeroFardos", nullable = false)
	public int getNumeroFardos() {
		return NumeroFardos;
	}

	public void setNumeroFardos(int numeroFardos) {
		NumeroFardos = numeroFardos;
	}
	@Column(name = "TipoProceso", nullable = false)
	public String getTipoProceso() {
		return TipoProceso;
	}

	public void setTipoProceso(String tipoProceso) {
		TipoProceso = tipoProceso;
	}
	@Column(name = "N_Estibas", nullable = false)
	public String getN_Estibas() {
		return N_Estibas;
	}

	public void setN_Estibas(String n_Estibas) {
		N_Estibas = n_Estibas;
	}
	@Column(name = "NombreFiscal", nullable = false)
	public String getNombreFiscal() {
		return NombreFiscal;
	}

	public void setNombreFiscal(String nombreFiscal) {
		NombreFiscal = nombreFiscal;
	}

	@Override
	public String toString() {
		return "RegistroBascula [IdBascula=" + IdBascula + ", NumeroBascula=" + NumeroBascula + ", Placa=" + Placa
				+ ", NumeroFardos=" + NumeroFardos + ", TipoProceso=" + TipoProceso + ", N_Estibas=" + N_Estibas
				+ ", NombreFiscal=" + NombreFiscal + "]";
	}
	
	
	

}
