public class DetalleOrden {
    private int cantidad;
    private Articulo cosa;
    public DetalleOrden(int cantidad, Articulo cosa) {
    	this.cantidad = cantidad;
    	this.cosa = cosa;
    }
    public float calcPrecioSinIVA() {
        return cosa.getPrecio()*cantidad;
    }

    public float calcIVA() {
        return (calcPrecioSinIVA() * 19 ) / 100; //Suponiendo que el IVA es del 19%
    }

    public float calcPrecio() {
        return calcPrecioSinIVA() - calcIVA();
    }
    public float calcPeso(){
        return cosa.getPeso()*cantidad;
    }
    public String toString(){
        return "Cantidad: " + cantidad + "Peso Total: " + calcPeso() + "Precio Total sin IVA: " + calcPrecioSinIVA() + "IVA: " + calcIVA() + "Precio Total con IVA" + calcPrecio() + ".";
    }
}
