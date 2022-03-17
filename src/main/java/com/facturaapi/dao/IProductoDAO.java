package com.facturaapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturaapi.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Long>{

}
