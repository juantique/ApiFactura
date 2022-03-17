package com.facturaapi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle")
public class Detalle {
	
	//Atributos:
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idDetalle;
			
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumns({
			@JoinColumn(name="idFactura", referencedColumnName="idFactura")		
		})
		Factura factura;
		
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumns({
			@JoinColumn(name="idProducto", referencedColumnName="idProducto")		
		})
		Producto producto;
		
		@Column(name = "cantidad")
		private int cantidad;
		
		@Column(name = "precio")
		private Float precio;
	
	// Constructor Vacio:
		public Detalle() {

		}
	// Constructor Parametros
		public Detalle(Long idDetalle, Factura factura, Producto producto, int cantidad, Float precio) {
	
			this.idDetalle = idDetalle;
			this.factura = factura;
			this.producto = producto;
			this.cantidad = cantidad;
			this.precio = precio;
		}
		
	// GET AND SET
		public Long getIdDetalle() {
			return idDetalle;
		}
		public void setIdDetalle(Long idDetalle) {
			this.idDetalle = idDetalle;
		}
		public Factura getFactura() {
			return factura;
		}
		public void setFactura(Factura factura) {
			this.factura = factura;
		}
		public Producto getProducto() {
			return producto;
		}
		public void setProducto(Producto producto) {
			this.producto = producto;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public Float getPrecio() {
			return precio;
		}
		public void setPrecio(Float precio) {
			this.precio = precio;
		}
		
	// Validar los datos en consola:
		@Override
		public String toString() {
			return "Detalle [idDetalle=" + idDetalle + ", factura=" + factura + ", producto=" + producto + ", cantidad="
					+ cantidad + ", precio=" + precio + "]";
		}	
}
