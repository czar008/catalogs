package com.czar.catalogs.service.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.czar.catalogs.xmlToJson.JaxbToJsonGeneratorService;

@RestController
@RequestMapping("/catalogs")
public class CatalogsServiceImpl {

	@Autowired
	JaxbToJsonGeneratorService jaxbToJsonGeneratorService;
	
	@RequestMapping(value="/estados/", method=RequestMethod.GET)
	public ResponseEntity<String> getEstados(){
		String estados = jaxbToJsonGeneratorService.writeJson("mx.gob.sat.sitio_internet.cfd.catalogos.CEstado");
		
		if(estados.isEmpty()) {
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		return new ResponseEntity<String>(estados, HttpStatus.OK);
	}
	
}
