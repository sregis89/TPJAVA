package DataBase;
import java.sql.*;

import BusinessEntities.Usuario;

public class UsuarioAdapter {
    
    public Usuario getByDNI(int dni)
    {
        Usuario user = new Usuario();
        
        
        try
        {
            Connection conn=DataBaseSingleton.getInstancia().getConexion();
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT dni,num_tc where dni = "+ dni +"");
            
            while(rs.next()){
                user.setDni(rs.getInt("dni"));
                user.setNum_tc(rs.getInt("num_tc"));
            }
           
        rs.close();
        st.close();
        
        }
        catch(Exception Ex)
        {
           
        }
        
        finally{
         
        }
        return user;
        
    }
}
