public class Efectivo extends Pago{
	private float vuelto = 0;
	public Efectivo(OrdenCompra orden, float pag) {
		super(orden);
		if (pag >= orden.calcPrecio()) {
			vuelto = pag-orden.calcPrecio();
		}
		else {
			vuelto = -1;
		}
	}
    public float calcDevolucion(){
    		return vuelto;
    }
}

