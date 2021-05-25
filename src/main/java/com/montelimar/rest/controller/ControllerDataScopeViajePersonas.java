package com.montelimar.rest.controller;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.montelimar.rest.Repository.RepositoryViajepersona;
import com.montelimar.rest.model.modelviajespersonales;

@RestController
@RequestMapping("/api")
public class ControllerDataScopeViajePersonas {
 

	@Autowired
	private RepositoryViajepersona RepositoryViajepersona;


	@GetMapping(value = "/viajepersona")
	public List<modelviajespersonales>getAllPersonas(){

		return RepositoryViajepersona.findAll();
	}

	@PostMapping("/viajepersonas")
	@ResponseStatus(HttpStatus.OK)
	public String SaveDatapersona(@RequestBody String Body) {

		try {
			

			System.out.println(Body);
			modelviajespersonales modelViajepersonas = new modelviajespersonales();
			
			 JSONArray jsonArray = new JSONArray(Body);
			 JSONObject jsonObject = jsonArray.getJSONObject(0);
			 ValidarJson Jsonvalidate = new ValidarJson();
			 
			 modelViajepersonas.setFechaRegistro(Jsonvalidate.FormartFecha("dd-MM-yyyy HH:mm", Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Fecha de Registro [2]", "value")));
			 modelViajepersonas.setLugarOrigen(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Lugar De Origen[3]", "value"));
			 modelViajepersonas.setCapataz(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Capataz", "value"));
			 modelViajepersonas.setDigitador(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Digitador [1]", "value"));
			 modelViajepersonas.setLugarDestino1(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Lugar Destino 1[4]", "value"));
			 modelViajepersonas.setLugarDestino2(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Lugar Destino 2[5]", "value"));
			 modelViajepersonas.setLugarDestino3(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Lugar Destino 3[6]", "value"));
			 modelViajepersonas.setLaborRealizar1(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Labor a Realizar 1[7]", "value"));
			 modelViajepersonas.setLaborRealizar2(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Labor a Realizar 2[8]", "value"));
			 modelViajepersonas.setLaborRealizar3(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Labor a Realizar 3[9]", "value"));
			 modelViajepersonas.setPropietario(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Propietario[12]", "value"));
			 modelViajepersonas.setHoraSalida(Jsonvalidate.FormartFecha("dd-MM-yyyy HH:mm",Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Hora De Salida[15]", "value")));
			 modelViajepersonas.setPlaca(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Placa[10]", "value"));
			 modelViajepersonas.setConductor(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Conductor[11]", "value"));
			 modelViajepersonas.setCantidadPersona(Integer.parseInt(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Cantidad Personal[13]", "value")));
			 modelViajepersonas.setFincaDestino(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Finca Destino[14]", "value"));
			// modelViajepersonas.setIdRegistroForms(Jsonvalidate.ValidarnodeJsonObject(jsonObject, 0,  "value"));
			 System.out.println(modelViajepersonas.toString());
			 
			 RepositoryViajepersona.save(modelViajepersonas);


		} catch (HttpStatusCodeException e) {
			System.out.println(e.getMessage());
		}

		return HttpStatus.OK.toString();
	}




}
