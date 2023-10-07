public class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(OrdenCompra orden, String banco, String numCuenta) {
    	super(orden);
    	this.banco = banco;
    	this.numCuenta = numCuenta;   	
    }
}
