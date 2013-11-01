package DataBase;

import BusinessEntities.Tren;
import java.sql.*;
import java.util.ArrayList;


public class TrenAdapter {
    
    public Tren getByNum(int numero){
    
        Tren tren = new Tren();
        
        try {
            
            //DataBaseSingleton.getInstancia().crearConexion();
            Connection conn = DataBaseSingleton.getInstancia().getConexion();
                        
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT cod_tren,linea,coeficiente FROM tren WHERE cod_tren = "+numero+"");
            
            while(rs.next()){
               
                tren.setNum_tren(rs.getInt("cod_tren"));
                tren.setLinea(rs.getInt("linea"));
                tren.setCoeficiente(rs.getFloat("coeficiente"));
            }
           
            rs.close();
            st.close();
        } 
        catch (Exception e) { 
        }
    
        return tren;
    }
    
    public ArrayList<Tren> getAll(){
        
        ArrayList<Tren> trenes = new ArrayList<Tren>();
        
        try {
            
            //DataBaseSingleton.getInstancia().crearConexion();
            Connection conn = DataBaseSingleton.getInstancia().getConexion();
            Statement st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery("SELECT cod_tren, linea, coeficiente FROM tren");
            
            while(rs.next())
            {
                Tren tren = new Tren();
                
                tren.setNum_tren(rs.getInt("cod_tren"));
                tren.setLinea(rs.getInt("linea"));
                tren.setCoeficiente(rs.getFloat("coeficiente"));
                
                trenes.add(tren);
            }
           
            rs.close();
            st.close();
        } 
        catch (Exception e) {
        }
        
        return trenes;
    }
    
    
    
    
}
