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

			JSONArray jsonArray = new JSONArray(Body);
			JSONObject jsonObject = jsonArray.getJSONObject(0);
			ValidarJson Jsonvalidate = new ValidarJson();
			
			modelviajesemilla.setCapatazCorte(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Capataz De Corte", "value"));
			modelviajesemilla.setCapatazCargue(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Capataz De Cargue [1]", "value"));
			modelviajesemilla.setFechaRegistro(Jsonvalidate.FormartFecha("dd-MM-yyyy HH:mm", Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Fecha De Registro[2]", "value")));
			modelviajesemilla.setVariedad(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Variedades [5]", "value"));
			modelviajesemilla.setTipoSemilla(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Tipo De Semilla[6]", "value"));
			modelviajesemilla.setTipoVehiculo(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Tipo De Vehículo[7]", "value"));
			modelviajesemilla.setKmRegistro(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Km Recorrido[13]", "value"));
			modelviajesemilla.setFincaOrigen(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Finca Origen[3]", "value"));
			modelviajesemilla.setCodLote(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Cod Lote[4]", "value"));
			modelviajesemilla.setPlaca(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Placa[8]", "value"));
			modelviajesemilla.setConductor(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Conductor[9]", "value"));
			modelviajesemilla.setCantidadSemilla(Integer.parseInt(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Cantidad Semilla[10]", "value")));
			modelviajesemilla.setFincaDestino(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "setFinca Destino[11]", "value"));
			modelviajesemilla.setHoraSalida(Jsonvalidate.FormartFecha("dd-MM-yyyy HH:mm", Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Hora Salida[12]", "value")));
			
			System.out.println(modelviajesemilla.toString());
			
			RepositoryViajesemilla.save(modelviajesemilla);
			

		} catch (HttpStatusCodeException e) {
			System.out.println(e.getMessage());
		}

		return HttpStatus.OK.toString();
	}
}
