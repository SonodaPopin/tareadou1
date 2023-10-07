import java.util.Date;
public class Factura extends DocTributario{
    public Factura(String numero, String rut, Date fecha, Direccion direccion, OrdenCompra orden) {
        super(numero, rut, fecha, direccion, orden);
    }
    public String toString(){
        return "Factura " + super.toString() + ".";
    }
}
