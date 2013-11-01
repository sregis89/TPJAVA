package BusinessEntities;

import BusinessLogic.TrenLogic;

public class Tren {
    
    private int numTren;
    private int linea;
    private float coeficiente;

    
    public int getNum_tren() {
        return numTren;
    }

    public void setNum_tren(int num_tren) {
        this.numTren = num_tren;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public float getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(float coeficiente) {
        this.coeficiente = coeficiente;
    }
    
      
    public String toString()
    { 
        String enteroString = Integer.toString(linea);
        return enteroString;
    }  
   
    
}
