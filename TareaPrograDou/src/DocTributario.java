import java.util.Date;
public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    private OrdenCompra orden;
    public DocTributario(String numero, Cliente cliente, OrdenCompra orden){
        this.numero = numero;
        rut = cliente.getRut();
        fecha = orden.getFecha();
        direccion = cliente.getDireccion();
        this.orden = orden;
    }
    public String toString() {
        return "n°" + numero + " Rut: " + rut + " Fecha: " + fecha + "Direccion: " + direccion + "Orden: " + orden + ".";
    }
}

