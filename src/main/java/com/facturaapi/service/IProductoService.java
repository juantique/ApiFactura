package com.facturaapi.service;

import java.util.List;

import com.facturaapi.dto.Producto;

public interface IProductoService {
	
	//Metodo Listar Producto
		public List<Producto> listarProducto();
		
		//Metodo Guardar
		public Producto guardarProducto(Producto producto);
		
		//Metodo Selecionar xID:
		public Producto productoXID(Long id);
}
