package com.facturaapi.service;

import java.util.List;

import com.facturaapi.dto.Factura;

public interface IFacturaService {
	
	//Metodo Listar Factura
		public List<Factura> listarFactura();
		
		//Metodo Guardar
		public Factura guardarFactura(Factura factura);
		
		//Metodo Selecionar xID:
		public Factura facturaXID(Long id);
}
