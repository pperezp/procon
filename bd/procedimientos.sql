USE procon;

/*Procedimiento para crear un contacto*/
DELIMITER $$
CREATE PROCEDURE crearContacto(
	nom VARCHAR(100), 
	cor VARCHAR(100), 
	num1 VARCHAR(20), 
	num2 VARCHAR(20)
)BEGIN
	DECLARE idContacto INT;
    
    INSERT INTO contacto VALUES(NULL, nom,cor);
    SET idContacto = (SELECT MAX(id) FROM contacto);
    INSERT INTO telefono VALUES(NULL, num1, idContacto);
    INSERT INTO telefono VALUES(NULL, num2, idContacto);
END $$
DELIMITER 

/*Procedimiento para buscar un contacto*/
DELIMITER $$
CREATE PROCEDURE buscarContacto(texto VARCHAR(100))
BEGIN
	SELECT
		id, nombre, correo
	FROM
		contacto
	WHERE
		nombre LIKE CONCAT('%',texto,'%') OR
		correo LIKE CONCAT('%',texto,'%');
END $$
DELIMITER ;

/*Procedimiento para buscar los telefonos según ID*/
DELIMITER $$
CREATE PROCEDURE buscarTelefonos(idContacto INT)
BEGIN
	SELECT 
		c.id,
		c.nombre as 'contacto',
		c.correo,
		t.numero as 'telefono'
	FROM 
		telefono t
		INNER JOIN contacto c ON c.id = t.fk_contacto
	WHERE 
		c.id = idContacto;
END $$
DELIMITER ;


/*Procedimiento para mostrar a todos los contactos*/
DELIMITER $$
CREATE PROCEDURE mostrarContactos()
BEGIN
	SELECT * FROM contacto;
END $$
DELIMITER ;


/*Procedimiento para editar un contacto*/
DELIMITER $$
CREATE PROCEDURE editarContacto(
	idContacto INT, 
    nom VARCHAR(100), 
    cor VARCHAR(100), 
    num1 VARCHAR(20), 
    num2 VARCHAR(20),
	idNum1 INT,
    idNum2 INT
) BEGIN
	UPDATE
		contacto
	SET 
		nombre = nom,
        correo = cor
	WHERE 
		id = idContacto;
        
	UPDATE telefono SET numero = num1 WHERE id = idNum1;
	UPDATE telefono SET numero = num2 WHERE id = idNum2;
END $$
DELIMITER ;

/*Procedimiento para eliminar un contacto*/
DELIMITER $$
CREATE PROCEDURE eliminarContacto(idContacto INT)
BEGIN
	DELETE FROM contacto WHERE id = idContacto;
END $$
DELIMITER ;

/*Test de procedimientos*/
CALL crearContacto('Lissette Escobar', 'lissette.er@gmail.com','+56911223388','+56922335577');
CALL buscarContacto('pat');
CALL buscarTelefonos(4);
CALL mostrarContactos();
CALL editarContacto(
	2,
    'Karina Rubio',
    'karina.rubio@gmail.com',
    '333',
    '666',
    3,
    4
);
CALL eliminarContacto(1);

/*Listado de procedimientos*/
SHOW PROCEDURE STATUS WHERE Db = 'procon';
/*Listado de procedimientos*/

/*Eliminar un procedimiento*/
DROP PROCEDURE crearContacto;
DROP PROCEDURE buscarContacto;
DROP PROCEDURE buscarTelefonos;
DROP PROCEDURE mostrarContactos;
DROP PROCEDURE editarContacto;
DROP PROCEDURE eliminarContacto;






