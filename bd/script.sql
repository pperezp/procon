CREATE DATABASE procon;

USE procon;

CREATE TABLE contacto(
	id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    correo VARCHAR(100),
	PRIMARY KEY(id)
);

CREATE TABLE telefono(
	id INT AUTO_INCREMENT,
    numero VARCHAR(20),
    fk_contacto INT,
	PRIMARY KEY(id),
    FOREIGN KEY(fk_contacto) REFERENCES contacto(id)
);

SELECT * FROM contacto;
SELECT * FROM telefono;

