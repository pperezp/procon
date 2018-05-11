package model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bd.Conexion;

public class Data {
    private Conexion con; 
    
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
    
    public static void main(String[] args) {
        try {
            Data d = new Data();
            
            d.crearContacto("Pato Pérez", "patodeath@gmail.com", "112233", "445566");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
