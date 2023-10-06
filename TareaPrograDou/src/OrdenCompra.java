import java.util.Date;
import java.util.ArrayList;
 
public class OrdenCompra{
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> ordenes;
    public OrdenCompra(Date fecha, String estado){
    	this.fecha = fecha;
    	this.estado = estado;
        ordenes = new ArrayList<>();
    }
    public void addOrden(DetalleOrden orden){
        ordenes.add(orden);
    }
    public float calcPrecioSinIVA() {
    	float precio = 0;
    	for (int i=0; i<ordenes.size(); i++) {
    		precio += ordenes.get(i).calcPrecioSinIVA();
    	}
        return precio;
    }

    public float calcIVA() {
    	float IVA = 0;
    	for (int i=0; i<ordenes.size(); i++) {
    		IVA += ordenes.get(i).calcIVA();
    	}
        return IVA;
    }

    public float calcPrecio() {
        return calcPrecioSinIVA() - calcIVA();
    }
    public float calcPeso(){
    	float peso = 0;
    	for (int i=0; i<ordenes.size(); i++) {
    		peso += ordenes.get(i).calcPeso();
    	}
        return peso;
    }
    public String toString(){
        return "Fecha: " + fecha + "Estado: " + estado + "Peso Total: " + calcPeso() + "Precio Total sin IVA: " + calcPrecioSinIVA() + "IVA: " + calcIVA() + "Precio Total con IVA" + calcPrecio() + ".";
    }
}