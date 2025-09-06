CREATE DATABASE sistema_tienda;
use sistema_tienda;

CREATE TABLE categorias(
codigo_categoria INT auto_increment PRIMARY KEY,
nombre_categoria VARCHAR (50) UNIQUE
);

CREATE TABLE productos(
codigo_producto INT auto_increment PRIMARY KEY,
nombre_producto VARCHAR(50) UNIQUE,
codigo_categoria INT NOT NULL,

FOREIGN KEY(codigo_categoria) REFERENCES categorias(codigo_categoria) ON DELETE CASCADE
ON UPDATE CASCADE
);

CREATE TABLE ventas(
codigo_venta INT AUTO_INCREMENT PRIMARY KEY,
fecha_venta DATE,
codigo_producto INT NOT NULL,

FOREIGN KEY (codigo_producto) REFERENCES productos(codigo_producto) 
);


INSERT INTO categorias (nombre_categoria) VALUES 
('Electrónica'),
('Ropa'),
('Hogar'),
('Juguetes');

INSERT INTO productos (nombre_producto, codigo_categoria) VALUES
('Televisor', 1),
('Laptop', 1),
('Camisa', 2),
('Pantalón', 2),
('Sofá', 3),
('Mesa', 3),
('Muñeca', 4),
('Carro de juguete', 4);

INSERT INTO ventas (fecha_venta, codigo_producto) VALUES
('2015-03-15', 1),
('2015-07-21', 2),
('2016-01-05', 3),
('2016-09-12', 4),
('2017-02-18', 5),
('2017-11-30', 6),
('2018-04-25', 7),
('2018-12-10', 8),
('2019-06-14', 1),
('2019-08-22', 2),
('2020-03-03', 3),
('2020-10-19', 4);


/*
Realizar una consulta que obtenga el nombre de la categoría del producto 
de la última venta realizada según la fecha.
*/
CREATE INDEX indx_fecha_venta ON ventas(fecha_venta);
EXPLAIN SELECT fecha_venta FROM ventas WHERE fecha_venta= '2018-12-10';

SELECT c.nombre_categoria AS nombre_categoria, v.codigo_venta FROM categorias AS c
JOIN productos AS p ON c.codigo_categoria = p.codigo_categoria
JOIN ventas AS v ON v.codigo_producto = p.codigo_producto
ORDER BY v.fecha_venta DESC
LIMIT 1
