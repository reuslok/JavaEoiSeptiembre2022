package es.eoi.app.pedidos;

public class Amazon {

	public static void main(String[] args) {
		
		// Pedido > ProductoAsignado > Producto
		
		Producto[] catalogo = {
				new Producto("Patatas", 2.2),
				new Producto("Tomates",1.23),
				new Producto("Champiñones", 2.43),
				new Producto("Queso", 3.76),
				new Producto("Hamburguesa EURA", 5.43)
		};
				
		ProductoAsignado[] carrito = {
				new ProductoAsignado(catalogo[0], 15),
				new ProductoAsignado(catalogo[3], 98)
		};
		
		Pedido pedido = new Pedido(carrito);
		pedido.calcularTotal(carrito);
	}
}
