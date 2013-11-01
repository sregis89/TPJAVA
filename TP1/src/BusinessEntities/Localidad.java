package BusinessEntities;

public class Localidad {
    
    private String nombreLoc;
    private int numLoc;
    private float distanciaLoc;

    public String getNombre_loc() {
        return nombreLoc;
    }

    public void setNombre_loc(String nombre_loc) {
        this.nombreLoc = nombre_loc;
    }

    public int getNum_loc() {
        return numLoc;
    }
    
    public void setNum_loc(int num_loc) {
        this.numLoc = num_loc;
    }

    public float getDistancia_loc() {
        return distanciaLoc;
    }
    
    public void setDistancia_loc(float distancia_loc) {
        this.distanciaLoc = distancia_loc;
    }
    
    public String toString()
    {
        return this.getNombre_loc();
    }
    
}
