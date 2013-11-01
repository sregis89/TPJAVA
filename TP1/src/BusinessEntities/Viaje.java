package BusinessEntities;


public class Viaje {
 
    private Localidad localidadOrig;
    private Localidad localidadDest;
    private Tren tren;
    private Vagon vagon;
    private float distancia;
    private float costo;

   

    public float getDistancia() {
        return distancia;
    }
    
    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    
    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Localidad getLocalidadOrig() {
        return localidadOrig;
    }

    public void setLocalidadOrig(Localidad localidadOrig) {
        this.localidadOrig = localidadOrig;
    }

    public Localidad getLocalidadDest() {
        return localidadDest;
    }

    public void setLocalidadDest(Localidad localidadDest) {
        this.localidadDest = localidadDest;
    }

    public Tren getTren() {
        return tren;
    }

   public void setTren(Tren tren) {
        this.tren = tren;
    }

    public Vagon getVagon() {
        return vagon;
    }

    public void setVagon(Vagon vagon) {
        this.vagon = vagon;
    }
    
    
}
