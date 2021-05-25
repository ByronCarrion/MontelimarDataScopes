package com.montelimar.rest.model;

import javax.persistence.*;

@Entity
@Table(name = "viajeSemilla")
public class modelviajesemilla extends Jutilidades {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id; 
	
	private String CapatazCorte; 
	private String CapatazCargue;
	private String FechaRegistro; 
	private String FincaOrigen; 
	private String CodLote; 
	private String Variedad; 
	private String TipoSemilla; 
	private String TipoVehiculo; 
	private String Placa; 
	private String Conductor; 
	private String Propietario; 
	private int CantidadSemilla; 
	private String FincaDestino; 
	private String HoraSalida; 
	private String KmRegistro; 
	private String IdRegistroForms;
	
	
	public modelviajesemilla() {
		
	}

	public modelviajesemilla(int id, String capatazCorte, String capatazCargue, String fechaRegistro,
			String fincaOrigen, String codLote, String variedad, String tipoSemilla, String tipoVehiculo, String placa,
			String conductor, String propietario, int cantidadSemilla, String fincaDestino, String horaSalida,
			String kmRegistro, String idRegistroForms) {
		super();
		Id = id;
		CapatazCorte = capatazCorte;
		CapatazCargue = capatazCargue;
		FechaRegistro = fechaRegistro;
		FincaOrigen = fincaOrigen;
		CodLote = codLote;
		Variedad = variedad;
		TipoSemilla = tipoSemilla;
		TipoVehiculo = tipoVehiculo;
		Placa = placa;
		Conductor = conductor;
		Propietario = propietario;
		CantidadSemilla = cantidadSemilla;
		FincaDestino = fincaDestino;
		HoraSalida = horaSalida;
		KmRegistro = kmRegistro;
		IdRegistroForms = idRegistroForms;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}

	@Column(name = "CapatazCorte", nullable = false)
	public String getCapatazCorte() {
		return CapatazCorte;
	}


	public void setCapatazCorte(String capatazCorte) {
		CapatazCorte = capatazCorte;
	}

	@Column(name = "CapatazCargue", nullable = false)
	public String getCapatazCargue() {
		return CapatazCargue;
	}


	public void setCapatazCargue(String capatazCargue) {
		CapatazCargue = capatazCargue;
	}

	@Column(name = "FechaRegistro", nullable = false)
	public String getFechaRegistro() {
		return FechaRegistro;
	}


	public void setFechaRegistro(String fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

	@Column(name = "FincaOrigen", nullable = false)
	public String getFincaOrigen() {
		return FincaOrigen;
	}


	public void setFincaOrigen(String fincaOrigen) {
		FincaOrigen = fincaOrigen;
	}

	@Column(name = "CodLote", nullable = false)
	public String getCodLote() {
		return CodLote;
	}


	public void setCodLote(String codLote) {
		CodLote = codLote;
	}

	@Column(name = "Variedad", nullable = false)
	public String getVariedad() {
		return Variedad;
	}


	public void setVariedad(String variedad) {
		Variedad = variedad;
	}

	@Column(name = "TipoSemilla", nullable = false)
	public String getTipoSemilla() {
		return TipoSemilla;
	}


	public void setTipoSemilla(String tipoSemilla) {
		TipoSemilla = tipoSemilla;
	}

	@Column(name = "TipoVehiculo", nullable = false)
	public String getTipoVehiculo() {
		return TipoVehiculo;
	}


	public void setTipoVehiculo(String tipoVehiculo) {
		TipoVehiculo = tipoVehiculo;
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

	@Column(name = "CantidadSemilla", nullable = false)
	public int getCantidadSemilla() {
		return CantidadSemilla;
	}


	public void setCantidadSemilla(int cantidadSemilla) {
		CantidadSemilla = cantidadSemilla;
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

	@Column(name = "KmRegistro", nullable = false)
	public String getKmRegistro() {
		return KmRegistro;
	}


	public void setKmRegistro(String kmRegistro) {
		KmRegistro = kmRegistro;
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
		return "modelviajesemilla [Id=" + Id + ", CapatazCorte=" + CapatazCorte + ", CapatazCargue=" + CapatazCargue
				+ ", FechaRegistro=" + FechaRegistro + ", FincaOrigen=" + FincaOrigen + ", CodLote=" + CodLote
				+ ", Variedad=" + Variedad + ", TipoSemilla=" + TipoSemilla + ", TipoVehiculo=" + TipoVehiculo
				+ ", Placa=" + Placa + ", Conductor=" + Conductor + ", Propietario=" + Propietario
				+ ", CantidadSemilla=" + CantidadSemilla + ", FincaDestino=" + FincaDestino + ", HoraSalida="
				+ HoraSalida + ", KmRegistro=" + KmRegistro + ", IdRegistroForms=" + IdRegistroForms + "]";
	}








}
