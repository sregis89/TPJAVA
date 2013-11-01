/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;


import BusinessEntities.Vagon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class VagonAdapter {
    
    public ArrayList<Vagon> getAll(){
        
        ArrayList<Vagon> vagones = new ArrayList<Vagon>();
        
        try {
            
            //DataBaseSingleton.getInstancia().crearConexion();
            Connection conn = DataBaseSingleton.getInstancia().getConexion();
            Statement st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery("SELECT cod_vagon, tipo_vagon, recarga FROM vagon");
            
            while(rs.next())
            {
                Vagon vagon = new Vagon();
                
                vagon.setNum_vagon(rs.getInt("cod_vagon"));
                vagon.setTipo_vagon(rs.getString("tipo_vagon"));
                vagon.setPorc_recarga(rs.getFloat("recarga"));
                
                vagones.add(vagon);
            }
           
            rs.close();
            st.close();
        } 
        catch (Exception e) {
        }
        
        return vagones;
    }
}
