public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    public Cliente(String nombre, String rut, Direccion direccion){
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }
    public String getRut() {
        return rut;
    }
    public String toString(){
        return nombre + "RUT: " + rut + ".";
    }
}
