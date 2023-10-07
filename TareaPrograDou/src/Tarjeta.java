public class Tarjeta extends Pago{	
    private String tipo;
    private String numTransaccion;
    public Tarjeta(OrdenCompra orden, String tipo, String numTransaccion) {
    	super(orden);
    	this.tipo = tipo;
    	this.numTransaccion = numTransaccion;  
    	orden.setEstado();
    }

    @Override
    public String toString() {
        return "Tarjeta " + " Tipo: " + tipo + " n° de Transaccion: " + numTransaccion + super.toString() + ".";
    }
}