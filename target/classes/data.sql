--DROP TABLE IF EXISTS cliente;

--create table cliente(
--	idCliente int identity (1,1),0
--	nombre varchar (50) not null,
--	apellido varchar (50) not null,
--	direccion varchar (50) not null,
--	fechaNacimiento date,
--	telefono varchar (50) not null,
--	email varchar (255) not null,
--	primary key(idCliente)
--);

--create table producto(
--	idProducto int identity (1,1),
--	nombre varchar(50) not null,
--	precio decimal (19,2) not null,
--	stock int not null,
--	primary key(idProducto)
--);

--create table factura(
--	idFactura int identity (1,1),
--	idCliente int not null,
--	fecha datetime,
--	primary key(idFactura)
--);

--create table detalle(
--	idDetalle int identity (1,1),
--	idFactura int not null,
--	idProducto int not null,
--	cantidad int not null,
--	precio decimal (19,2) not null
--	--primary key(idDetalle, idFactura)
--);

ALTER TABLE detalle ADD PRIMARY KEY (idDetalle, idFactura)

-----------Alteracion y Relaciones-------------
--Cliente 1:N Facturas
alter table factura add constraint facturaClienteFk FOREIGN KEY (idCliente) references cliente(idCliente);

--Producto 1:N Detalle:
alter table detalle add constraint detalleProductoFk FOREIGN KEY (idProducto) references producto(idProducto);

--Factura N:M Detalle
alter table detalle add constraint detalleProductoPK PRIMARY KEY (idFactura) references factura(idFactura);


insert into clientes (nombre, apellido, direccion, fechaNacimiento, telefono, email) 
	values ('juan', 'conde', 'calle 57b sur no. 64 - 40', '09-29-1987', '7109511', 'jconde48@gmail.com'),
	('Luis', 'Martinez', 'AV 25 no. 70 - 23', '12-02-2000', '56985862', 'luis@gmail.com'),
	('Alexandra', 'Nieto', 'Cr 100 no. 21 - 89', '03-14-1956', '8795623', 'alexa@gmail.com'),
	('Miguel', 'Lozano', 'trav 78 no. 36 - 89', '12-29-1999', '3125698956', 'miguel@gmail.com');

insert into producto (nombre, precio, stock) 
	values('Pantalon Pana Azul', 80299, 250),
	('Chaqueta DIESEL', 450789, 20),
	('Jeans DIESEL', 120000, 196),
	('Adidas Messi', 780963, 50);

insert into factura (idCliente, fecha) 
	values(1,'03-16-2022'),
	(2,'03-03-2022'),
	(3,'03-05-2022'),
	(4,'03-15-2022');
	
insert into detalle (idFactura, idProducto, cantidad, precio) 
	values(1,2,2,901578),
	(2,1,4,321196),
	(3,3,1,120000),
	(4,4,1,780963);


