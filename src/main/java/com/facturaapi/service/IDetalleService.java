package com.facturaapi.service;

import java.util.List;

import com.facturaapi.dto.Detalle;

public interface IDetalleService {
	
		//Metodo Listar
		public List<Detalle> listarDetalle();
		
		//Metodo Guardar
		public Detalle guardarDetalle(Detalle Detalle);
		
		//Metodo Selecionar xID:
		public Detalle detalleXID(Long id);

}
