package com.montelimar.rest.controller;

 
import com.montelimar.rest.Repository.*;
import com.montelimar.rest.model.modelviajesemilla;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;

@RestController
@RequestMapping("/api")
public class ControllerDataScopeViajeSemilla {

	@Autowired
	private RepositoryViajesemilla RepositoryViajesemilla;

	@GetMapping(value = "/viajesemilla")
	public List<modelviajesemilla> getAllSemillas(){

		return RepositoryViajesemilla.findAll();
	} 


	
	@PostMapping("/viajesemilla")
	@ResponseStatus(HttpStatus.OK)
	public String SaveDataviajesemilla(@RequestBody String Body) {

		try {
			
			System.out.println(Body);
			modelviajesemilla modelviajesemilla = new modelviajesemilla();
			ValidarJson Jsonvalidate = new ValidarJson();
			
			 modelviajesemilla.jsonArray = new JSONArray(Body);
			 modelviajesemilla.jsonObject = modelviajesemilla.jsonArray.getJSONObject(0);
						
			modelviajesemilla.setCapatazCorte(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Capataz De Corte", "value"));
			modelviajesemilla.setCapatazCargue(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Capataz De Cargue [1]", "value"));
			modelviajesemilla.setFechaRegistro(Jsonvalidate.FormartFecha("dd-MM-yyyy HH:mm", Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Fecha De Registro[2]", "value")));
			modelviajesemilla.setZona(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Zona[3]", "value")); 
			modelviajesemilla.setVariedad(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Variedades [6]", "value"));
			modelviajesemilla.setTipoSemilla(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Tipo De Semilla[7]", "value"));
			modelviajesemilla.setTipoVehiculo(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Tipo De Vehículo[8]", "value"));
			modelviajesemilla.setKmRegistro(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Km Recorrido[14]", "value"));
			modelviajesemilla.setFincaOrigen(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Finca Origen[4]", "value"));
			modelviajesemilla.setCodLote(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Cod Lote[5]", "value"));
			modelviajesemilla.setPlaca(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Placa[9]", "value"));
			modelviajesemilla.setConductor(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Conductor[10]", "value"));
			modelviajesemilla.setPropietario(Jsonvalidate.ValidarnodeJsonObject(modelviajesemilla.jsonObject, "Propietario[11]", "value"));
			modelviajesemilla.setCantidadSemilla(Integer.parseInt(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Cantidad Semilla[12]", "value")));
			modelviajesemilla.setFincaDestino(Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Finca Destino[13]", "value"));
			modelviajesemilla.setHoraSalida(Jsonvalidate.FormartFecha("dd-MM-yyyy HH:mm", Jsonvalidate.ValidarnodeJsonObject( modelviajesemilla.jsonObject, "Hora Salida[14]", "value")));
			modelviajesemilla.setIdRegistroForms( modelviajesemilla.jsonObject.getString("code"));
			
			RepositoryViajesemilla.save(modelviajesemilla);
			

		} catch (HttpStatusCodeException e) {
			System.out.println(e.getMessage());
		}

		return HttpStatus.OK.toString();
	}
}
