package com.montelimar.rest.controller;

import java.util.List;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;

import com.montelimar.rest.Repository.RepositoryIngresoBascula;
import com.montelimar.rest.model.RegistroBascula;

@RestController
@RequestMapping("/api")
public class ControllerDataScopeIngresoVascula {
	
	@Autowired
	private RepositoryIngresoBascula RepositoryIngresoBascula;
	
	
	@GetMapping(value = "/ingresobascula")
	public List<RegistroBascula>getAllPersonas(){

		return RepositoryIngresoBascula.findAll();
	}
	
	@PostMapping(value = "/ingresobascula")
	@ResponseStatus(HttpStatus.OK)
	public String SaveDatapersona(@RequestBody String Body) {
		
		try {
			System.out.println(Body);
			
			ValidarJson Jsonvalidate = new ValidarJson();
			RegistroBascula RegistroBascula = new RegistroBascula();
			RegistroBascula.jsonArray = new JSONArray(Body);
			RegistroBascula.jsonObject = RegistroBascula.jsonArray.getJSONObject(0);
			
			RegistroBascula.setNumeroBascula(Jsonvalidate.ValidarnodeJsonObject(RegistroBascula.jsonObject, "N° Boleto Báscula", "value"));
			RegistroBascula.setNumeroFardos(Integer.parseInt(Jsonvalidate.ValidarnodeJsonObject(RegistroBascula.jsonObject, "Número de Fardos[2]", "value")));
			RegistroBascula.setPlaca(Jsonvalidate.ValidarnodeJsonObject(RegistroBascula.jsonObject, "Placa[1]", "value"));
			RegistroBascula.setN_Estibas(Jsonvalidate.ValidarnodeJsonObject(RegistroBascula.jsonObject, "N° Estiba[17]", "value"));
			RegistroBascula.setTipoProceso(Jsonvalidate.ValidarnodeJsonObject(RegistroBascula.jsonObject, "Tipo de Proceso[16]", "value"));
			RegistroBascula.setNombreFiscal(Jsonvalidate.ValidarnodeJsonObject(RegistroBascula.jsonObject, "Nombre Fiscal Receptor Biomasa [24]", "value"));
			
			
			
		} catch (HttpStatusCodeException e) {
			System.out.println(e.getMessage());
		}
		
		return HttpStatus.OK.toString();
	}
	
	
	

}
