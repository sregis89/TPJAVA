
package BusinessLogic;

import java.awt.TextField;


public class Validaciones {
    
    public boolean DNI(String dni)
    {
       //hacer validacion dni
       boolean valida;
       
       if (dni.matches("[0-9]*") && dni.length() >= 8 && dni.length() <= 9)
       {
        valida = true;
        return valida;
       }
       else
       {
        valida = false;
        return valida;
       }
              
    }
    
   public boolean TC(String tc)
    {
       //hacer validacion tc
        boolean valida;
        
        if (tc.matches("[0-9]*") && tc.length() == 12)
        {
         valida = true;
         return valida;
        }
        else
        {
         valida = false;
         return valida;
        }
       
    }
}
