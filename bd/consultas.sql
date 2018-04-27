USE procon;

/*1.- Crear contacto*/
/*	Alvaro Bunster, al.bunstr@gmail.com, 
	+56931238998,+56948730843  */
INSERT INTO contacto 
VALUES(NULL, 'Alvaro Bunster','al.bunstr@gmail.com');

/*Obtengo el último contacto creado (ID)*/
SELECT MAX(id) FROM contacto;

INSERT INTO telefono VALUES(NULL, '+56931238998','1');
INSERT INTO telefono VALUES(NULL, '+56948730843','1');


/*2.- Buscar un contacto por nombre o correo*/
/*TEST --> alv*/
SELECT
	nombre
FROM
	contacto
WHERE
	nombre LIKE '%alv%' OR
    correo LIKE '%alv%';
    
    
/*Ver los telefonos del alvaro --> id = 1*/
SELECT 
	c.id,
	c.nombre as 'contacto',
    c.correo,
	t.numero as 'telefono'
FROM 
	telefono t
    INNER JOIN contacto c ON c.id = t.fk_contacto
WHERE 
	c.id = 1;
    
SELECT CONCAT('%','alv','%');

SELECT * FROM telefono;

UPDATE telefono SET numero = '111' WHERE id = 3;
UPDATE telefono SET numero = '222' WHERE id = 4;
