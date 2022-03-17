package com.facturaapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturaapi.dto.Detalle;

public interface IDestalleDAO extends JpaRepository<Detalle, Long> {

}
