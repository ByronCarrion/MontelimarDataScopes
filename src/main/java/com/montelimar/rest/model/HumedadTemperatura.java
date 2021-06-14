package com.montelimar.rest.model;

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
	
	private int IdIngresoBascula;
	private double Humedad;
	private double Temperatura;
	private int Orden;
	
	
	public HumedadTemperatura() {
		
	}
	public HumedadTemperatura(long id, int idIngresoBascula, double humedad, double temperatura, int orden) {
		super();
		Id = id;
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
	public int getIdIngresoBascula() {
		return IdIngresoBascula;
	}
	public void setIdIngresoBascula(int idIngresoBascula) {
		IdIngresoBascula = idIngresoBascula;
	}
	public double getHumedad() {
		return Humedad;
	}
	public void setHumedad(double humedad) {
		Humedad = humedad;
	}
	public double getTemperatura() {
		return Temperatura;
	}
	public void setTemperatura(double temperatura) {
		Temperatura = temperatura;
	}
	public int getOrden() {
		return Orden;
	}
	public void setOrden(int orden) {
		Orden = orden;
	}
	
	
	@Override
	public String toString() {
		return "HumedadTemperatura [Id=" + Id + ", IdIngresoBascula=" + IdIngresoBascula + ", Humedad=" + Humedad
				+ ", Temperatura=" + Temperatura + ", Orden=" + Orden + "]";
	}
	
	
	
	
	
}
