public class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(OrdenCompra orden, String banco, String numCuenta) {
    	super(orden);
    	this.banco = banco;
    	this.numCuenta = numCuenta;   	
    }

    @Override
    public String toString() {
        return "Transferencia " + "Banco: " + banco + "n° de cuenta: " + numCuenta + super.toString() + ".";
    }
}
