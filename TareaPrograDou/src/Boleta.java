import java.util.Date;
public class Boleta extends DocTributario{
    public Boleta(String numero, String rut, Date fecha, Direccion direccion, OrdenCompra orden) {
        super(numero, rut, fecha, direccion, orden);
    }
    public String toString(){
        return "Boleta " + super.toString() + ".";
    }
}
