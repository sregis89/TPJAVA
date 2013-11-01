package BusinessLogic;

import BusinessEntities.Localidad;
import BusinessEntities.Viaje;
import BusinessEntities.Tren;
import BusinessEntities.Vagon;
import DataBase.ViajeAdapter;
import java.util.ArrayList;


public class ViajeLogic {
    
    public Viaje nuevoViaje = new Viaje();
    
    public void nuevoViaje(Localidad origen, Localidad destino, Tren tren, Vagon vagon)
    {
        
        nuevoViaje.setLocalidadOrig(origen);
        nuevoViaje.setLocalidadDest(destino);
        nuevoViaje.setTren(tren);
        nuevoViaje.setVagon(vagon);
        
        float distancia;
        LocalidadLogic localidadLogic = new LocalidadLogic();
        distancia = localidadLogic.obtenerDistancia(origen.getDistancia_loc(), destino.getDistancia_loc());
        nuevoViaje.setDistancia(distancia);
        
        float costo;
        costo = this.calcularCosto(distancia, tren.getCoeficiente(), vagon.getPorc_recarga());
        nuevoViaje.setCosto(costo);
        
    }
    
    public String devolverOrigen()
    {  
       Localidad locOrigen = new Localidad();
       String origen;
       locOrigen = nuevoViaje.getLocalidadOrig();
       origen = locOrigen.getNombre_loc();
       return origen;
    }
    
    public String devolverDestino()
    {
       Localidad locDestino = new Localidad();
       String destino;
       locDestino = nuevoViaje.getLocalidadDest();
       destino = locDestino.getNombre_loc();
       return destino;
    }
    
    public int devolverLineaTren()
    {
       Tren tren = new Tren();
       int lineaTren;
       tren = nuevoViaje.getTren();
       lineaTren = tren.getLinea();
       return lineaTren;
    }
    
    public String devolverTipoVagon()
    {
       Vagon vagon = new Vagon();
       String tipoVagon;
       vagon = nuevoViaje.getVagon();
       tipoVagon = vagon.getTipo_vagon();
       return tipoVagon;
    }
    
    public float devolverDistancia()
    {
        float distancia;
        distancia = nuevoViaje.getDistancia();
        return distancia;
    }
    
    public float devolverCosto()
    {
        float costo;
        costo = nuevoViaje.getCosto();
        return costo;
    }
    
    //cargar viaje en BD
    public void setViaje()
    {
        ViajeAdapter va = new ViajeAdapter();
        
        try 
            {
                va.setViaje(nuevoViaje);
                
            } 
        catch (Exception e) 
            {
              System.err.println(e.getMessage());
            }
            
    }
    
    //calculo del costo
    public float calcularCosto(float distancia, float coeficiente, float porcentaje)
    {
        float costo;
        float recarga;        

        costo = (distancia * coeficiente);
        recarga = (costo * porcentaje);
        recarga = recarga / 100;
        costo = recarga + costo;
        
        return costo;

    }
    
    public ArrayList<Viaje> getAll(){
    
       ViajeAdapter va = new ViajeAdapter();
        
        ArrayList<Viaje> viajes = new ArrayList<Viaje>();
       
        try {
            
            viajes = va.getAll();
            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    
    
     return viajes;
    }
    
    
   }
