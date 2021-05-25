package com.montelimar.rest.controller;

import java.util.*;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.json.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.HtmlEscapeTag;

import com.montelimar.rest.*;
import com.montelimar.rest.Repository.DataHumedadFardosRepository;
import com.montelimar.rest.Repository.DataScopeRepository;
import com.montelimar.rest.exception.ResourceNotFoundException;
import com.montelimar.rest.model.*;
 

@RestController
@RequestMapping("/api")
public class DataScopeController {
	
	@Value("${spring.jpa.properties.hibernate.jdbc.batch_size}")
    private int batchSize;
	@Autowired
    private DataScopeRepository DataScopeRepository;
	@Autowired
	private DataHumedadFardosRepository DataHumedadFardosRepository;
	
	
	 @RequestMapping( value = "/datascope", method= RequestMethod.GET )
	    public List<DataScope> getAllEmployees() {
		
	        return DataScopeRepository.findAll() ;
	    }
	 
	 @GetMapping("/datascopehumedad")
	    public List<HumedadFardos> getHumedas() {
		
	        return DataHumedadFardosRepository.findAll() ;
	    }
	 	 
	 @GetMapping("/datascope/{id}")
	 public ResponseEntity<DataScope>GetDataScopeByID(@PathVariable(value = "id") Long DataScopeId )
	throws ResourceNotFoundException {
		 
		 DataScope Data = DataScopeRepository.findById(DataScopeId).orElseThrow(() -> new ResourceNotFoundException("Registro No Encontrado por este Id ::" + DataScopeId));
		// HumedadFardos Fardos = DataHumedadFardosRepository.findById(DataScopeId).orElseThrow(() -> new ResourceNotFoundException("Registro No Encontrado por este Id ::" + DataScopeId));
		 
		 return ResponseEntity.ok().body(Data);
	 }
	 

	 @PostMapping("/datascope")
	 @ResponseStatus(HttpStatus.OK)
	 public String CreateDataScope( @RequestBody String datascope)
	 {
		try {
			System.out.println(datascope);
		
		 DataScope EntityDataScope = new DataScope();
		 HumedadFardos fardos = new HumedadFardos();
		 ValidarJson Jsonvalidate = new ValidarJson();

		 JSONArray jsonArray = new JSONArray(datascope);
		 JSONObject jsonObject = jsonArray.getJSONObject(0);

		 EntityDataScope.setCONT_MAQUILA(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Contrato de Maquila[7]", "value"));
		 EntityDataScope.setCONT_TRANSPORTE(Jsonvalidate.ValidarnodeJsonObject(jsonObject,"Contrato de Transporte[8]","value"));
		 EntityDataScope.setNombreConductor(Jsonvalidate.ValidarnodeJsonObject(jsonObject,"Nombre Conductor[9]","value"));
		 EntityDataScope.setPlacaCabezal(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Placa Cabezal[10]","value"));
		 EntityDataScope.setTipoFardo(Jsonvalidate.ValidarnodeJsonObject(jsonObject,"Tipo de Fardo[11]","value"));
		 EntityDataScope.setNumeroFardo(Integer.parseInt(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Número de Fardos[12]","value")));
		 EntityDataScope.setNombreFiscalREc(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Nombre Fiscal REC[26]","value"));
		 EntityDataScope.setREC(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Tipo Rec[1]","value"));
		 EntityDataScope.setFINCA(Jsonvalidate.ValidarnodeJsonObject(jsonObject, "Finca[3]","value"));
		 EntityDataScope.setFechaDespacho(Jsonvalidate.FormartFecha("dd-MM-yyyy HH:mm", Jsonvalidate.ValidarnodeJsonObject(jsonObject,"Fecha y Hora de despacho","value")));
		 EntityDataScope.setCODLOTENOMBRE(Jsonvalidate.ValidarnodeJsonObject( jsonObject,"Código lote + Nombre[4]","value" ));
		 EntityDataScope.setCONT_COMPRA(Jsonvalidate.ValidarnodeJsonObject(jsonObject,"Contrato de Compra[6]","value"));
		 

		
		
		 try {
	
		 DataScopeRepository.save(EntityDataScope);
		 List<HumedadFardos> f = new ArrayList<>();
		 for (int i = 1; i <= 12; i++) {
		
			 System.out.println("Humedad "+i+"[13]");
			 //fardos.setDescripcion(json.getString("Humedad en Fardos - Humedad "+i+"[0]"));
			 f.add(new HumedadFardos (EntityDataScope.getId(), Jsonvalidate.ValidarnodeJsonObject(jsonObject,"Humedad "+i+"[13]","value"), i ));
			 
			 if (i % batchSize == 0 && i > 0) {
				DataHumedadFardosRepository.saveAll(f);
				f.clear();
			}
		   
		}
		 
		 if (f.size() > 0) {
	            DataHumedadFardosRepository.saveAll(f);
	            f.clear();
	        }
		 
		 } catch (JSONException e) {
				System.out.println(e.getMessage());
			}
		 
		 } catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		 		
		 return HttpStatus.OK.toString() ;
	 
}
	 
	
	
}

		 
	
			
			 
	
	 

