package com.facturaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturaapi.dao.IClienteDAO;
import com.facturaapi.dto.Cliente;

//Anotarlo con Servicio
@Service
public class ClienteServiceImpl implements IClienteService{
	
	//Se invoca la interface DAO que tiene el CRUD JPA y se instancia con la anotacion @Autowired
	@Autowired
	IClienteDAO iClienteDAO;

	@Override
	public List<Cliente> listarCliente() {
		
		return iClienteDAO.findAll();
	}

	@Override
	public Cliente guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente clienteXID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarCliente(Long id) {
		// TODO Auto-generated method stub
		
	}

}
