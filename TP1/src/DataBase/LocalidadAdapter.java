/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import BusinessEntities.Localidad;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class LocalidadAdapter {
    
    public ArrayList<Localidad> getAll(){
        
        ArrayList<Localidad> localidades = new ArrayList<Localidad>();
        
        try {
            
            //DataBaseSingleton.getInstancia().crearConexion();
            Connection conn = DataBaseSingleton.getInstancia().getConexion();
            Statement st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery("SELECT cod_localidad, descripcion, distancia FROM localidad");
            
            while(rs.next())
            {
                Localidad localidad = new Localidad();
                
                localidad.setNum_loc(rs.getInt("cod_localidad"));
                localidad.setNombre_loc(rs.getString("descripcion"));
                localidad.setDistancia_loc(rs.getFloat("distancia"));
                
                localidades.add(localidad);
            }
           
            rs.close();
            st.close();
        } 
        catch (Exception e) {
        }
        
        return localidades;
    }
    
}
