package com.facturaapi.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


//import com.colegioapi.dto.Colegio;

@Entity
@Table(name="factura")
public class Factura {
	
	//Atributos:
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idFactura;
		
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumns({
			@JoinColumn(name="idCliente", referencedColumnName="idCliente")		
		})
		Cliente cliente;
		
		@Temporal(TemporalType.TIMESTAMP)
		private Date fecha;
		
		// Constructor Vacio
		public Factura() {
			
		}

		// Constructor Parametros
		public Factura(Long idFactura, Cliente cliente, Date fecha) {
			this.idFactura = idFactura;
			this.cliente = cliente;
			this.fecha = fecha;
		}
		
		// Genero los GET - SET
		public Long getIdFactura() {
			return idFactura;
		}

		public void setIdFactura(Long idFactura) {
			this.idFactura = idFactura;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}
		
		//Validar informacion en consola
		@Override
		public String toString() {
			return "Factura [idFactura=" + idFactura + ", cliente=" + cliente + ", fecha=" + fecha + "]";
		}
		
		
		
	
}
