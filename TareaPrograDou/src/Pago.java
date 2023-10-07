import java.util.Date;

public abstract class Pago {
    private float monto;
    private Date fecha;
	public Pago(OrdenCompra orden) {
		monto = orden.calcPrecio();
		fecha = orden.getFecha();
	}
}