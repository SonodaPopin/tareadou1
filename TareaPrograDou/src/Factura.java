import java.util.Date;
public class Factura extends DocTributario{
    public Factura(String numero, Cliente cliente, OrdenCompra orden) {
        super(numero, cliente, orden);
    }
    public String toString(){
        return "Factura " + super.toString() + ".";
    }
}
