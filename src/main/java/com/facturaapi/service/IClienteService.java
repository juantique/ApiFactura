package com.facturaapi.service;

import java.util.List;

import com.facturaapi.dto.Cliente;

public interface IClienteService {
	
	//Metodo Listar Cliente
	public List<Cliente> listarCliente();
	
	//Metodo Guardar
	public Cliente guardarCliente(Cliente cliente);
	
	//Metodo Selecionar xID:
	public Cliente clienteXID(Long id);
	
	//Metodo Actualizar:
	public Cliente actualizarCliente(Cliente cliente);
	
	//Metodo Eliminar:
	public void eliminarCliente(Long id);
}
