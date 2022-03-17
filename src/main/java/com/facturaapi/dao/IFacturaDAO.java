package com.facturaapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturaapi.dto.Factura;

public interface IFacturaDAO extends JpaRepository<Factura, Long> {

}
