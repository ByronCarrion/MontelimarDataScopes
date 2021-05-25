package com.montelimar.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ViajesPersonal")
public class modelviajespersonales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id; 

	private String Capataz; 
	private String Digitador;
	private String FechaRegistro; 
	private String LugarOrigen; 
	private String LugarDestino1; 
	private String LugarDestino2; 
	private String LugarDestino3; 
	private String LaborRealizar1; 
	private String LaborRealizar2; 
	private String LaborRealizar3; 
	private String Placa;
	private String Conductor; 
	private String Propietario; 
	private int  cantidadPersona; 
	private String FincaDestino; 
	private String HoraSalida; 
	private String IdRegistroForms;
	
	public modelviajespersonales() {
		
	}

	public modelviajespersonales(int id, String capataz, String digitador, String fechaRegistro, String lugarOrigen,
			String lugarDestino1, String lugarDestino2, String lugarDestino3, String laborRealizar1,
			String laborRealizar2, String laborRealizar3, String placa, String conductor, String propietario,
			int cantidadPersona, String fincaDestino, String horaSalida, String idRegistroForms) {
		super();
		Id = id;
		Capataz = capataz;
		Digitador = digitador;
		FechaRegistro = fechaRegistro;
		LugarOrigen = lugarOrigen;
		LugarDestino1 = lugarDestino1;
		LugarDestino2 = lugarDestino2;
		LugarDestino3 = lugarDestino3;
		LaborRealizar1 = laborRealizar1;
		LaborRealizar2 = laborRealizar2;
		LaborRealizar3 = laborRealizar3;
		Placa = placa;
		Conductor = conductor;
		Propietario = propietario;
		this.cantidadPersona = cantidadPersona;
		FincaDestino = fincaDestino;
		HoraSalida = horaSalida;
		IdRegistroForms = idRegistroForms;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	@Column(name = "Capataz", nullable = false)
	public String getCapataz() {
		return Capataz;
	}

	public void setCapataz(String capataz) {
		Capataz = capataz;
	}

	@Column(name = "Digitador", nullable = false)
	public String getDigitador() {
		return Digitador;
	}

	public void setDigitador(String digitador) {
		Digitador = digitador;
	}
	@Column(name = "FechaRegistro", nullable = false)
	public String getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}
	@Column(name = "LugarOrigen", nullable = false)
	public String getLugarOrigen() {
		return LugarOrigen;
	}

	public void setLugarOrigen(String lugarOrigen) {
		LugarOrigen = lugarOrigen;
	}
	@Column(name = "LugarDestino1", nullable = false)
	public String getLugarDestino1() {
		return LugarDestino1;
	}

	public void setLugarDestino1(String lugarDestino1) {
		LugarDestino1 = lugarDestino1;
	}
	@Column(name = "LugarDestino2", nullable = false)
	public String getLugarDestino2() {
		return LugarDestino2;
	}

	public void setLugarDestino2(String lugarDestino2) {
		LugarDestino2 = lugarDestino2;
	}
	@Column(name = "LugarDestino3", nullable = false)
	public String getLugarDestino3() {
		return LugarDestino3;
	}

	public void setLugarDestino3(String lugarDestino3) {
		LugarDestino3 = lugarDestino3;
	}
	@Column(name = "LaborRealizar1", nullable = false)
	public String getLaborRealizar1() {
		return LaborRealizar1;
	}

	public void setLaborRealizar1(String laborRealizar1) {
		LaborRealizar1 = laborRealizar1;
	}
	@Column(name = "LaborRealizar2", nullable = false)
	public String getLaborRealizar2() {
		return LaborRealizar2;
	}

	public void setLaborRealizar2(String laborRealizar2) {
		LaborRealizar2 = laborRealizar2;
	}
	@Column(name = "LaborRealizar3", nullable = false)
	public String getLaborRealizar3() {
		return LaborRealizar3;
	}

	public void setLaborRealizar3(String laborRealizar3) {
		LaborRealizar3 = laborRealizar3;
	}
	@Column(name = "Placa", nullable = false)
	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}
	@Column(name = "Conductor", nullable = false)
	public String getConductor() {
		return Conductor;
	}

	public void setConductor(String conductor) {
		Conductor = conductor;
	}
	@Column(name = "Propietario", nullable = false)
	public String getPropietario() {
		return Propietario;
	}

	public void setPropietario(String propietario) {
		Propietario = propietario;
	}
	@Column(name = "cantidadPersona", nullable = false)
	public int getCantidadPersona() {
		return cantidadPersona;
	}

	public void setCantidadPersona(int cantidadPersona) {
		this.cantidadPersona = cantidadPersona;
	}
	@Column(name = "FincaDestino", nullable = false)
	public String getFincaDestino() {
		return FincaDestino;
	}

	public void setFincaDestino(String fincaDestino) {
		FincaDestino = fincaDestino;
	}
	@Column(name = "HoraSalida", nullable = false)
	public String getHoraSalida() {
		return HoraSalida;
	}

	public void setHoraSalida(String horaSalida) {
		HoraSalida = horaSalida;
	}
	@Column(name = "IdRegistroForms", nullable = false)
	public String getIdRegistroForms() {
		return IdRegistroForms;
	}

	public void setIdRegistroForms(String idRegistroForms) {
		IdRegistroForms = idRegistroForms;
	}

	@Override
	public String toString() {
		return "modelviajespersonales [Id=" + Id + ", Capataz=" + Capataz + ", Digitador=" + Digitador
				+ ", FechaRegistro=" + FechaRegistro + ", LugarOrigen=" + LugarOrigen + ", LugarDestino1="
				+ LugarDestino1 + ", LugarDestino2=" + LugarDestino2 + ", LugarDestino3=" + LugarDestino3
				+ ", LaborRealizar1=" + LaborRealizar1 + ", LaborRealizar2=" + LaborRealizar2 + ", LaborRealizar3="
				+ LaborRealizar3 + ", Placa=" + Placa + ", Conductor=" + Conductor + ", Propietario=" + Propietario
				+ ", cantidadPersona=" + cantidadPersona + ", FincaDestino=" + FincaDestino + ", HoraSalida="
				+ HoraSalida + ", IdRegistroForms=" + IdRegistroForms + "]";
	}









}
