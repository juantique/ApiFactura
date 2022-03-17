package com.facturaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facturaapi.dto.Cliente;
import com.facturaapi.service.ClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {
	@Autowired
	ClienteServiceImpl clienteServiceImpl; 
	
	@GetMapping("/clientes")
	public List<Cliente> listarCliente(){
		return clienteServiceImpl.listarCliente();
	}
	
}
