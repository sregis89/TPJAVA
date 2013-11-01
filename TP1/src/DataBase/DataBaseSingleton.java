package DataBase;

import java.sql.*;

public class DataBaseSingleton {
    
    private static DataBaseSingleton instancia = null;
    private java.sql.Connection conexion = null;
    
    private DataBaseSingleton() {
        
    }
    
    public static DataBaseSingleton getInstancia() {
        
        if (instancia == null) {
            
            instancia = new DataBaseSingleton();
        }

        return instancia;
    
    }

    /* devuelve true si se ha creado correctamente */
    
    public boolean crearConexion() {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/"+"tpjava","root","root");
        } 
        
        catch (Exception e) {
            return false;
        }
        
        return true;
    
    }

    public java.sql.Connection getConexion() {

        if (conexion == null) {

            crearConexion();

        }

        return conexion;
    
    }

}
