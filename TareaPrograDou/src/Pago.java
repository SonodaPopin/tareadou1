import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
}
class Efectivo extends Pago{
    public float calcDevolucion(){
        return 0;
    }
}
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
}
class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
}


