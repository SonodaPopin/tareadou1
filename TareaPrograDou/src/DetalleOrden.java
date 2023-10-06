public class DetalleOrden {
    private int cantidad;
    public float calcPrecioSinIVA() {
        return Articulo.getPrecio()*cantidad;
    }

    public float calcIVA() {
        return (calcPrecioSinIVA() * 19 ) / 100; //Suponiendo que el IVA es del 19%
    }

    public float calcPrecio() {
        return calcPrecioSinIVA() - calcIVA();
    }
    public float calcPeso(){
        return Articulo.getPeso()*cantidad;
    }
    public String toString(){
        return "Cantidad: " + cantidad + "Peso Total: " + calcPeso() + "Precio Total sin IVA: " + calcPrecioSinIVA() + "IVA: " + calcIVA() + "Precio Total con IVA" + calcPrecio() + ".";
    }
}
