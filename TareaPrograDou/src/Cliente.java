public class Cliente {
    private String nombre;
    private String rut;
    public Cliente(String nombre, String rut){
        this.nombre = nombre;
        this.rut = rut;
    }
    public String toString(){
        return nombre + "RUT: " + rut + ".";
    }
}
