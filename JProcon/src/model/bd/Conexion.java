package model.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private Connection con;
    private Statement sen;
    private ResultSet rs;
    
    private void conectar() throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://localhost/procon?user=root&password=123456";
        System.out.println(url);
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url);
    }
    
    public void desconectar() throws SQLException{
        sen.close();
        con.close();
    }
    
    // insert, delete, update
    public void ejecutar(String query) throws ClassNotFoundException, SQLException{
        conectar();
        sen = con.createStatement();
        sen.executeUpdate(query);
        desconectar();
    }
    
    public ResultSet ejecutarSelect(String query) throws ClassNotFoundException, SQLException{
        conectar();
        sen = con.createStatement();
        rs = sen.executeQuery(query);
        return rs;
    }
    
//    public static void main(String[] args) {
//        Conexion con = new Conexion();
//        try {
//            con.ejecutar("CALL eliminarContacto(1)");
//            con.ejecutar("CALL eliminarContacto(2)");
//            con.ejecutar("CALL eliminarContacto(3)");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
}
