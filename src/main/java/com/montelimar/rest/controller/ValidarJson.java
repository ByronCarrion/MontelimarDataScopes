package com.montelimar.rest.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.json.JSONObject;
 
public class ValidarJson {
	
	String Resultado;
	boolean result;
	public String ValidarnodeJsonObject(JSONObject JsonObject, String Parametro, String name ) {
 
		try {
			if (JsonObject.has(Parametro)) {
				Resultado = JsonObject.getJSONObject(Parametro).get(name).toString();				
			} else {
				Resultado = "";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Resultado;
	}
	
	public String FormartFecha(String Format, String Fecha) {
		try {
			
			DateTimeFormatter formatISO = DateTimeFormatter.ofPattern(Format);
			DateTimeFormatter formatoEstandar = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:s"); 
			 
			LocalDateTime date =LocalDateTime.parse(Fecha,formatISO);
			Fecha = formatoEstandar.format(date);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Fecha;
		}

}
