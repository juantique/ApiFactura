package com.facturaapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturaapi.dto.Cliente;

//Instanciando esta interface se puede utilizar el JPA y sus metodos: 
public interface IClienteDAO extends JpaRepository<Cliente, Long>{
	
}
