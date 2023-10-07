import java.util.Date;
public class Boleta extends DocTributario{
    public Boleta(String numero, Cliente cliente, OrdenCompra orden) {
        super(numero, cliente, orden);
    }
    public String toString(){
        return "Boleta " + super.toString() + ".";
    }
}
