package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bd.Conexion;

public class Data {
    private final Conexion con; // Constante --> no cambia
    
    public Data(){
        con = new Conexion();
    }
    
    public void crearContacto(String nombre, String correo, String tel1, String tel2) throws ClassNotFoundException, SQLException{
        con.ejecutar("CALL crearContacto('"+nombre+"','"+correo+"','"+tel1+"','"+tel2+"')");
    }
    
    public void editarContacto(int idContacto, String nombre, String correo, String tel1, String tel2, int idTel1, int idTel2) throws ClassNotFoundException, SQLException{
        con.ejecutar("CALL editarContacto('"+idContacto+"','"+nombre+"','"+correo+"','"+tel1+"','"+tel2+"','"+idTel1+"','"+idTel2+"');");
    }
    
    public void eliminarContacto(int idContacto) throws ClassNotFoundException, SQLException{
        con.ejecutar("CALL eliminarContacto('"+idContacto+"')");
    }
    
    /*Recuerda que este método llama al procedimiento
    buscarContactos()*/
    public List<Contacto> getContactos(String texto) throws ClassNotFoundException, SQLException{
        // creo una lista de contactos vacía
        List<Contacto> lista = new ArrayList<>(); 
        String query = "CALL buscarContacto('"+texto+"')";
        ResultSet rs = con.ejecutarSelect(query);
        
        while(/*existan frutas*/rs.next()){ // --> registros
            //sacar una bolsa --bolsa --> Contacto 
            Contacto c = new Contacto();
            
            //tomar y poner una manzana en la bolsa --> id
            c.id = rs.getInt(1);
            
            //tomar y poner una pera en la bolsa    --> nombre
            c.nombre = rs.getString(2);
            
            //tomar y poner un platano en la bolsa  --> correo
            c.correo = rs.getString(3);
            
            // pones la bolsa en el canasto        --> canasto --> lista
            lista.add(c);
        }
        
        con.desconectar();
        return lista;
    }
    
    public List<ContactoTelefono> getTelefonos(int idContacto) throws ClassNotFoundException, SQLException{
        List<ContactoTelefono> lista = new ArrayList<>();
        String query = "CALL buscarTelefonos('"+idContacto+"');";
        ResultSet rs = con.ejecutarSelect(query);
        
        while(rs.next()){ 
            ContactoTelefono c = new ContactoTelefono();
            
            c.id = rs.getInt(1);
            c.nombre = rs.getString(2);
            c.correo = rs.getString(3);
            c.telefono = rs.getString(4);
           
            lista.add(c);
        }
        
        con.desconectar();
        return lista;
    }
    
    public List<Contacto> getContactos() throws ClassNotFoundException, SQLException{
        // OJO -->OJOOO!!!!!!!! List y ArrayList --> java.util NOOOO en java.awt!!!!!!!!!!!! porfa! chao
        List<Contacto> lista = new ArrayList<>();
        String query = "CALL mostrarContactos()";
        ResultSet rs = con.ejecutarSelect(query);
        
        while(rs.next()){ 
            Contacto c = new Contacto();
            
            c.id = rs.getInt(1);
            c.nombre = rs.getString(2);
            c.correo = rs.getString(3);
           
            lista.add(c);
        }
        
        con.desconectar();
        
        return lista;
    }
    
}
