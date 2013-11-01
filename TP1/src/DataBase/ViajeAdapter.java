/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import BusinessEntities.Localidad;
import BusinessEntities.Tren;
import BusinessEntities.Viaje;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;

public class ViajeAdapter {
    private Map<String, Class<?>> Viaje;
    
     public void setViaje(Viaje viaje) throws SQLException{
        
      PreparedStatement st = null;
        try {
            
            //DataBaseSingleton.getInstancia().crearConexion();
            Connection conn = DataBaseSingleton.getInstancia().getConexion();
            st = conn.prepareStatement("INSERT INTO viaje (cod_loc_origen, cod_loc_destino, cod_tren, cod_vagon, distancia, costo) VALUES (?, ?, ?, ?, ?, ?);");
            st.setInt(1, viaje.getLocalidadOrig().getNum_loc());
            st.setInt(2, viaje.getLocalidadDest().getNum_loc());
            st.setInt(3, viaje.getTren().getNum_tren());
            st.setInt(4, viaje.getVagon().getNum_vagon());
            st.setFloat(5, viaje.getDistancia());
            st.setFloat(6, viaje.getCosto());
            st.executeUpdate();
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
           
        }
        finally {
            st.close();
           
            
        }
        
        }
        
    @SuppressWarnings("empty-statement")
        public ArrayList<Viaje> getAll(){
        
        ArrayList<Viaje> viajes = new ArrayList<Viaje>();
        
        try {
            
            //DataBaseSingleton.getInstancia().crearConexion();
            Connection conn = DataBaseSingleton.getInstancia().getConexion();
            Statement st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery("SELECT CONCAT(a.cod_loc_origen,'-',b.descripcion) as loc_origen, CONCAT(a.cod_loc_destino,'-',c.descripcion) as loc_destino," +
"d.linea as linea, e.tipo_vagon, a.distancia as distancia, a.costo as costo " +
"FROM viaje a " +
"INNER JOIN localidad b ON a.cod_loc_origen = b.cod_localidad " +
"INNER JOIN localidad c on a.cod_loc_destino = c.cod_localidad " +
"INNER JOIN tren d ON a.cod_tren = d.cod_tren " +
"INNER JOIN vagon e ON a.cod_vagon = e.cod_vagon ");
            
            while(rs.next())
            {
                Viaje viaje = new Viaje();
                
                viaje.setLocalidadOrig((Localidad) rs.getObject("loc_origen"));
                viaje.setLocalidadDest((Localidad) rs.getObject("loc_destino"));
                viaje.setTren((Tren) rs.getObject("tipo_vagon"));
                viaje.setDistancia(rs.getFloat("recarga"));
                viaje.setCosto(rs.getFloat("costo"));
                
                
                viajes.add(viaje);
            }
           
            rs.close();
            st.close();
        } 
        catch (Exception e ) {
            System.err.println(e.getMessage());
            
        }
        
        return viajes;
    } 
        
            
    

   
}
