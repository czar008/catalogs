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
	
	@RequestMapping(value="/metodosPago/", method=RequestMethod.GET)
	public ResponseEntity<String> getMetodosPago(){
		String metodosPago = jaxbToJsonGeneratorService.writeJson("mx.gob.sat.sitio_internet.cfd.catalogos.CMetodoPago");
		if(metodosPago.isEmpty()) {
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<String>(metodosPago, HttpStatus.OK);
	}
	
	@RequestMapping(value="/monedas/", method=RequestMethod.GET)
	public ResponseEntity<String> getMonedas(){
		String monedas = jaxbToJsonGeneratorService.writeJson("mx.gob.sat.sitio_internet.cfd.catalogos.CMoneda");
		if(monedas.isEmpty()) {
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<String>(monedas,HttpStatus.OK);
		}
		
	}

	
	@RequestMapping(value="/paises/", method=RequestMethod.GET)
	public ResponseEntity<String> getPaises(){
		String paises = jaxbToJsonGeneratorService.writeJson("mx.gob.sat.sitio_internet.cfd.catalogos.CPais");
		if(paises.isEmpty()) {
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<String>(paises,HttpStatus.OK);
		}		
	}
	
	
	@RequestMapping(value="/tiposComprobante/", method=RequestMethod.GET)
	public ResponseEntity<String> getTiposComprobante(){
		String tiposComprobante = jaxbToJsonGeneratorService.writeJson("mx.gob.sat.sitio_internet.cfd.catalogos.CTipoDeComprobante");
		if(tiposComprobante.isEmpty()) {
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<String>(tiposComprobante,HttpStatus.OK);
		}		
	}
	
	@RequestMapping(value="/tiposFactor/", method=RequestMethod.GET)
	public ResponseEntity<String> getTiposFactor(){
		String tiposFactor = jaxbToJsonGeneratorService.writeJson("mx.gob.sat.sitio_internet.cfd.catalogos.CTipoFactor");
		if(tiposFactor.isEmpty()) {
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<String>(tiposFactor,HttpStatus.OK);
		}		
	}
	
	
	@RequestMapping(value="/usosCFDI/", method=RequestMethod.GET)
	public ResponseEntity<String> getUsosCFDI(){
		String usosCFDI = jaxbToJsonGeneratorService.writeJson("mx.gob.sat.sitio_internet.cfd.catalogos.CUsoCFDI");
		if(usosCFDI.isEmpty()) {
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<String>(usosCFDI,HttpStatus.OK);
		}		
	}
	
}
