import java.util.Date;
public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    private OrdenCompra orden;
    public DocTributario(String numero, String rut, Date fecha, Direccion direccion, OrdenCompra orden){
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
        this.direccion = direccion;
        this.orden = orden;
    }
    public String toString() {
        return "n°" + numero + " Rut: " + rut + " Fecha: " + fecha + "Direccion: " + direccion + "Orden: " + orden + ".";
    }

}

