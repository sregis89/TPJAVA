package BusinessLogic;

import BusinessEntities.Localidad;
import DataBase.LocalidadAdapter;
import java.util.ArrayList;

public class LocalidadLogic  {
   
   
    public float obtenerDistancia(float d1, float d2){
        float dist;
        dist = d2 - d1;
        if (dist < 0)
        {
            dist = dist * -1;
            return dist;
        }
        else
        {
        return dist;
        }
    }
    
    public ArrayList<Localidad> getAll(){
        
        LocalidadAdapter la = new LocalidadAdapter();
        ArrayList<Localidad> localidades = new ArrayList<Localidad>();
        
        try 
            {
                localidades = la.getAll();
            } 
        catch (Exception e) 
            {
              
            }
        return localidades;
    }        
    
    /*
    public BusinessEntities.Localidad[] listarLocalidad (BusinessEntities.Localidad[] locs)
    {
        locs[0] = new BusinessEntities.Localidad();
        locs[0].setNombre_loc("Capital Federal (Buenos Aires)");
        locs[0].setDistancia_loc(0);
        locs[1] = new BusinessEntities.Localidad();
        locs[1].setNombre_loc("Campana (Buenos Aires)");
        locs[1].setDistancia_loc(79);
        locs[2] = new BusinessEntities.Localidad();
        locs[2].setNombre_loc("San Nicolás de los Arroyos (Buenos Aires)");
        locs[2].setDistancia_loc(297);
        locs[3] = new BusinessEntities.Localidad();
        locs[3].setNombre_loc("Rosario (Santa Fe)");
        locs[3].setDistancia_loc(306);
        locs[4] = new BusinessEntities.Localidad();
        locs[4].setNombre_loc("Cañada de Gomez (Santa Fe)");
        locs[4].setDistancia_loc(368);
        locs[5] = new BusinessEntities.Localidad();
        locs[5].setNombre_loc("Marcos Juarez (Córdoba)");
        locs[5].setDistancia_loc(440);
        locs[6] = new BusinessEntities.Localidad();
        locs[6].setNombre_loc("Villa María (Córdoba)");
        locs[6].setDistancia_loc(552);
        locs[7] = new BusinessEntities.Localidad();
        locs[7].setNombre_loc("Córdoba (Córdoba)");
        locs[7].setDistancia_loc(700);
        return locs;
    }*/
    
    
}
