package com.czar.catalogs.service.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;

import mx.gob.sat.sitio_internet.cfd.catalogos.CEstado;

public interface CatalogService {

	/**
	 * Servicio que regresa el cat�logo de estados oficiales publicado por SAT
	 * @return 
	 */
	public ResponseEntity<List<CEstado>> getEstados();
}
					