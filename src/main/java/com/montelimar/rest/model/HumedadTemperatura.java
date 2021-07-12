package com.montelimar.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HumedadTemperatura")
public class HumedadTemperatura {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long Id;
	
	private Long IdIngresoBascula;
	private double Humedad;
	private double Temperatura;
	private int Orden;
	
	
	public HumedadTemperatura() {
		
	}
	public HumedadTemperatura(Long idIngresoBascula, double humedad, double temperatura, int orden) {
		super();
		IdIngresoBascula = idIngresoBascula;
		Humedad = humedad;
		Temperatura = temperatura;
		Orden = orden;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	} 
	
	@Column(name = "IdIngresoBascula", nullable = false)
	public Long getIdIngresoBascula() {
		return IdIngresoBascula;
	}
	public void setIdIngresoBascula(Long idIngresoBascula) {
		IdIngresoBascula = idIngresoBascula;
	}
	@Column(name = "Humedad", nullable = false)
	public double getHumedad() {
		return Humedad;
	}
	public void setHumedad(double humedad) {
		Humedad = humedad;
	}
	@Column(name = "Temperatura", nullable = false)
	public double getTemperatura() {
		return Temperatura;
	}
	public void setTemperatura(double temperatura) {
		Temperatura = temperatura;
	}
	public int getOrden() {
		return Orden;
	}
	@Column(name = "Orden", nullable = false)
	public void setOrden(int orden) {
		Orden = orden;
	}
	
	
	@Override
	public String toString() {
		return "HumedadTemperatura [Id=" + Id + ", IdIngresoBascula=" + IdIngresoBascula + ", Humedad=" + Humedad
				+ ", Temperatura=" + Temperatura + ", Orden=" + Orden + "]";
	}
	
	
	
	
	
}
