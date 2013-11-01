package BusinessLogic;

import BusinessEntities.Vagon;
import DataBase.VagonAdapter;
import java.util.ArrayList;


public class VagonLogic {
 
     public ArrayList<Vagon> getAll(){
        
        VagonAdapter va = new VagonAdapter();
        ArrayList<Vagon> vagones = new ArrayList<Vagon>();
        
        try 
            {
                vagones = va.getAll();
            } 
        catch (Exception e) 
            {
              
            }
        return vagones;
    }        
    
}
