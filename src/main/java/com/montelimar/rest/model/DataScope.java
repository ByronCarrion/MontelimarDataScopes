package com.montelimar.rest.model;

import javax.persistence.*;

@Entity
@Table(name = "Datascopeformulario")
public class DataScope {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	private String FechaDespacho;
	private String REC;
	private String FINCA;
	private String CODLOTENOMBRE;
	private String CONT_COMPRA;
	private String CONT_MAQUILA;
	private String CONT_TRANSPORTE;
	private String NombreConductor;
	private String PlacaCabezal;
	private String TipoFardo;
	private int NumeroFardo;
	private String NombreFiscalREc;


	
	public DataScope() {
	}

	public DataScope(long id, String FechaDespacho, String rEC, String fINCA, String CODLOTENOMBRE, String cONT_COMPRA,
			String cONT_MAQUILA, String cONT_TRANSPORTE, String nombreConductor, String placaCabezal, String tipoFardo,
			int Número_de_Fardos, String nombreFiscalREc) {
		
		super();
		this.Id = id;
		this.FechaDespacho = FechaDespacho;
		this.REC = rEC;
		this.FINCA = fINCA;
		this.CODLOTENOMBRE = CODLOTENOMBRE;
		this.CONT_COMPRA = cONT_COMPRA;
		this.CONT_MAQUILA = cONT_MAQUILA;
		this.CONT_TRANSPORTE = cONT_TRANSPORTE;
		this.NombreConductor = nombreConductor;
		this.PlacaCabezal = placaCabezal;
		this.TipoFardo = tipoFardo;
		this.NumeroFardo = Número_de_Fardos;
		this.NombreFiscalREc = nombreFiscalREc;
	}


	
	public long getId() {
		return Id;
	}
	
	public void setId(long id) {
		this.Id = id;
	}

	@Column(name = "FechaDespacho", nullable = false)
	public String getFechaDespacho() {
		return FechaDespacho;
	}

	public void setFechaDespacho(String FechaDespacho) {
		this.FechaDespacho = FechaDespacho;
	}

	@Column(name = "REC", nullable = false)
	public String getREC() {
		return REC;
	}
	
	public void setREC(String rEC) {
		this.REC = rEC;
	}

	@Column(name = "FINCA", nullable = false)
	public String getFINCA() {
		return FINCA;
	}

	public void setFINCA(String fINCA) {
		this.FINCA = fINCA;
	}

	@Column(name = "CODLOTENOMBRE", nullable = false)
	public String getCODLOTENOMBRE() {
		return CODLOTENOMBRE;
	}

	public void setCODLOTENOMBRE(String cODLOTENOMBRE) {
		this.CODLOTENOMBRE = cODLOTENOMBRE;
	}

	@Column(name = "CONT_COMPRA", nullable = false)
	public String getCONT_COMPRA() {
		return CONT_COMPRA;
	}

	public void setCONT_COMPRA(String cONT_COMPRA) {
		this.CONT_COMPRA = cONT_COMPRA;
	}



	@Column(name = "CONT_MAQUILA", nullable = false)
	public String getCONT_MAQUILA() {
		return CONT_MAQUILA;
	}




	public void setCONT_MAQUILA(String cONT_MAQUILA) {
		this.CONT_MAQUILA = cONT_MAQUILA;
	}



	@Column(name = "CONT_TRANSPORTE", nullable = false)
	public String getCONT_TRANSPORTE() {
		return CONT_TRANSPORTE;
	}




	public void setCONT_TRANSPORTE(String cONT_TRANSPORTE) {
		this.CONT_TRANSPORTE = cONT_TRANSPORTE;
	}



	@Column(name = "NombreConductor", nullable = false)
	public String getNombreConductor() {
		return NombreConductor;
	}




	public void setNombreConductor(String nombreConductor) {
		this.NombreConductor = nombreConductor;
	}



	@Column(name = "PlacaCabezal", nullable = false)
	public String getPlacaCabezal() {
		return PlacaCabezal;
	}




	public void setPlacaCabezal(String placaCabezal) {
		this.PlacaCabezal = placaCabezal;
	}



	@Column(name = "TipoFardo", nullable = false)
	public String getTipoFardo() {
		return TipoFardo;
	}




	public void setTipoFardo(String tipoFardo) {
		this.TipoFardo = tipoFardo;
	}



	@Column(name = "NumeroFardo", nullable = false)
	public int getNumeroFardo() {
		return NumeroFardo;
	}




	public void setNumeroFardo(int numeroFardo) {
		this.NumeroFardo = numeroFardo;
	}



	@Column(name = "NombreFiscalREc", nullable = false)
	public String getNombreFiscalREc() {
		return NombreFiscalREc;
	}




	public void setNombreFiscalREc(String nombreFiscalREc) {
		this.NombreFiscalREc = nombreFiscalREc;
	}



	@Override
	public String toString() {
		return "DataScope [id=" + Id + ", FechaDespacho=" + FechaDespacho + ", REC=" + REC + ", FINCA=" + FINCA
				+ ", CODLOTENOMBRE=" + CODLOTENOMBRE + ", CONT_COMPRA=" + CONT_COMPRA + ", CONT_MAQUILA=" + CONT_MAQUILA
				+ ", CONT_TRANSPORTE=" + CONT_TRANSPORTE + ", NombreConductor=" + NombreConductor + ", PlacaCabezal="
				+ PlacaCabezal + ", TipoFardo=" + TipoFardo + ", NumeroFardo=" + NumeroFardo + ", NombreFiscalREc="
				+ NombreFiscalREc + "]";
	}
	
	
	


}
