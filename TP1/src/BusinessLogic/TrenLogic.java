package BusinessLogic;

import BusinessEntities.Tren;
import DataBase.TrenAdapter;
import java.util.ArrayList;

public class TrenLogic {
    
   public Tren getByNum(int numero){    
        
        TrenAdapter ta = new TrenAdapter();
        Tren tren = new Tren();
        
        try 
            {
                tren = ta.getByNum(numero);
            } 
        catch (Exception e) 
            {
              
            }
        return tren;
    }
    
   public ArrayList<Tren> getAll(){
        
        TrenAdapter ta = new TrenAdapter();
        ArrayList<Tren> trenes = new ArrayList<Tren>();
        
        try 
            {
                trenes = ta.getAll();
            } 
        catch (Exception e) 
            {
              
            }
        return trenes;
    }        
        
   
    
}
