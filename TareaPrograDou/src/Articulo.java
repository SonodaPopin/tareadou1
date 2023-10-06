public class Articulo {
    private static float peso;
    private static float precio;
    private String nombre;
    private String descripcion;
    public Articulo(String nombre, String descripcion, float peso, float precio){
        this.peso = peso;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public float getPeso() {
        return peso;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "Descripcion: " + descripcion + "Peso: " + peso + "Precio: " + precio + ".";
    }
}

