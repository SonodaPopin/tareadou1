import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Direccion casadelabuela = new Direccion("Michimalonco 144, Concepción");
		Direccion casadelatia = new Direccion("Cochrane 578, Concepción");

		Cliente pepito = new Cliente("Pepe", "84736837-4", casadelabuela);
		Cliente juanito = new Cliente("Juan", "90637284-2", casadelatia);

		Articulo pera = new Articulo("Pera", "Sabrosa", 200, 45f);
		Articulo manzana = new Articulo("Manzana", "Jugosa", 400, 2f);
		Articulo platano = new Articulo("Platano", "Largo", 300, 4f);
		Articulo naranja = new Articulo("Naranja", "Rancia", 500, 5f);
		Articulo limon = new Articulo("Limon", "Acida", 700, 6f);

		DetalleOrden manzanas = new DetalleOrden(4,manzana);
		DetalleOrden platanos = new DetalleOrden(4,platano);		
		DetalleOrden naranjas = new DetalleOrden(4,naranja);
		DetalleOrden limones = new DetalleOrden(4,limon);	
		DetalleOrden peras = new DetalleOrden(4,pera);

		OrdenCompra compraslunes = new OrdenCompra(new Date());
		compraslunes.addOrden(peras);
		compraslunes.addOrden(manzanas);

		OrdenCompra comprasmartes = new OrdenCompra(new Date());
		compraslunes.addOrden(platanos);
		compraslunes.addOrden(limones);

		OrdenCompra comprasmiercoles = new OrdenCompra(new Date());
		compraslunes.addOrden(naranjas);
		compraslunes.addOrden(limones);

		Tarjeta junaeb = new Tarjeta(compraslunes, "Debito", "9429895323");
		Tarjeta bancochile = new Tarjeta(comprasmiercoles, "Credito", "1231313132");
		Transferencia bancoestado = new Transferencia(comprasmartes, "Debito", "9429895");
		Efectivo unpalo = new Efectivo(compraslunes, 100000);

		Boleta santaisabel = new Boleta("90237498", pepito, compraslunes);
		Boleta lider = new Boleta("353453353", pepito, comprasmiercoles);
		Factura jumbo = new Factura("98349239", juanito, comprasmartes);

		System.out.println("Clientes: ");
		System.out.println(pepito.toString());
		System.out.println(juanito.toString());

		System.out.println("Ordenes: ");
		System.out.println(comprasmartes.toString());
		System.out.println(compraslunes.toString());
		System.out.println(comprasmiercoles.toString());

		System.out.println("Tipo de pago: ");
		System.out.println(unpalo.toString());
		System.out.println(junaeb.toString());
		System.out.println(bancochile.toString());
		System.out.println(bancoestado.toString());

		System.out.println("Tipo de documento");
		System.out.println(santaisabel.toString());
		System.out.println(lider.toString());
		System.out.println(jumbo.toString());
	}
}
