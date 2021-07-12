package com.montelimar.rest.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.annotations.BatchSize;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;

import com.montelimar.rest.Repository.DataHumedadFardosRepository;
import com.montelimar.rest.Repository.DataScopeRepository;
import com.montelimar.rest.Repository.RepositoryColumnaBascula;
import com.montelimar.rest.Repository.RepositoryHumedadTemperatura;
import com.montelimar.rest.Repository.RepositoryIngresoBascula;
import com.montelimar.rest.model.ColumnaBascula;
import com.montelimar.rest.model.HumedadTemperatura;
import com.montelimar.rest.model.RegistroBascula;

@RestController
@RequestMapping("/api")
public class ControllerDataScopeIngresoVascula {
	
	
	@Value("${spring.jpa.properties.hibernate.jdbc.batch_size}")	   
	private int batchSize;
	
	@Autowired
	private RepositoryIngresoBascula RepositoryIngresoBascula;
	
	@Autowired
	private RepositoryHumedadTemperatura RepositoryHumedadTemperatura;
	
	@Autowired
	private RepositoryColumnaBascula RepositoryColumnaBascula;
	
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
			
			//InsertIngresoBasculaHumedad(RegistroBascula, Jsonvalidate);
			//InsertIngresoBasculaColumna(RegistroBascula, Jsonvalidate);
			
		
			
		} catch (HttpStatusCodeException e) {
			System.out.println(e.getMessage());
		}
		
		return HttpStatus.OK.toString();
	}
	
	/*
	public void InsertIngresoBasculaHumedad(RegistroBascula registroBascula, ValidarJson Jsonvalidate) {
		try {

			RepositoryIngresoBascula.save(registroBascula);
			List<HumedadTemperatura> HumedadTemperatura = new ArrayList<>();
			for (int i = 1; i < 6; i++) {

				HumedadTemperatura.add(new HumedadTemperatura(registroBascula.getIdBascula(),
						Double.parseDouble(Jsonvalidate.ValidarnodeJsonObject(registroBascula.jsonObject,"Humedad "+i+"[3]","value")),
						Double.parseDouble(Jsonvalidate.ValidarnodeJsonObject(registroBascula.jsonObject,"Temperatura "+i+"[3]","value")),
						i));
				if (i % batchSize ==0 && i >0 ) {
					RepositoryHumedadTemperatura.saveAll(HumedadTemperatura);
					HumedadTemperatura.clear();
				}
				if (HumedadTemperatura.size() > 0) {
					RepositoryHumedadTemperatura.saveAll(HumedadTemperatura);
					HumedadTemperatura.clear();
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public void InsertIngresoBasculaColumna(RegistroBascula registroBascula, ValidarJson Jsonvalidate) {
		try {

			RepositoryIngresoBascula.save(registroBascula);
			List<ColumnaBascula> ColumnaBascula = new ArrayList<>();

			for (int i = 1; i < 4; i++) {

				ColumnaBascula.add(new ColumnaBascula(registroBascula.getIdBascula(),
						Integer.parseInt(Jsonvalidate.ValidarnodeJsonObject(registroBascula.jsonObject,"Columna "+i+"[18]","value"))
						,i));

				if (i % batchSize ==0 && i >0 ) {
					RepositoryColumnaBascula.saveAll(ColumnaBascula);
					ColumnaBascula.clear();
				}
				if (ColumnaBascula.size() > 0) {
					RepositoryColumnaBascula.saveAll(ColumnaBascula);
					ColumnaBascula.clear();
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}*/
	
	
	

}
