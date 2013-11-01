package BusinessEntities;

import BusinessLogic.TrenLogic;
import BusinessLogic.VagonLogic;
import BusinessEntities.Vagon;

public class Vagon {
    
    private String tipoVagon;
    private int numVagon;
    private float porcRecarga;

    public String getTipo_vagon() {
        return tipoVagon;
    }

    public void setTipo_vagon(String tipo_vagon) {
        this.tipoVagon = tipo_vagon;
    }

    public int getNum_vagon() {
        return numVagon;
    }

    public void setNum_vagon(int num_vagon) {
        this.numVagon = num_vagon;
    }

    public float getPorc_recarga() {
        return porcRecarga;
    }

    public void setPorc_recarga(float porc_recarga) {
        this.porcRecarga = porc_recarga;
    }
    
    public String toString()
    {      
        String enteroString = tipoVagon;
        return enteroString;
    }
    
       
}
