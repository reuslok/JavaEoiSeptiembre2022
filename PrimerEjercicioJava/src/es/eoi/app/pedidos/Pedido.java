package es.eoi.app.pedidos;

import java.time.LocalDate;

public class Pedido {
	private ProductoAsignado[] contenido;
	private LocalDate fecha;
	public Pedido(ProductoAsignado[] contenido) {
		this.contenido = contenido;
		this.fecha = LocalDate.now();
		
	}
	
	
	public static void calcularTotal(ProductoAsignado[] contenido) {
		double total=0;
		for(ProductoAsignado productoAsignado : contenido){
			String nombreProducto = productoAsignado.getProducto().getNombre();
			
			double precioUnitario = productoAsignado.getProducto().getPrecio();
			
			int cantidadProductos = productoAsignado.getUnidades();
			
			double totalOperacion = precioUnitario * cantidadProductos;
			
			System.out.println(nombreProducto+ " -> "+ precioUnitario +"€ x " 
								+ cantidadProductos+" Uds = " + totalOperacion+"€");
			total += totalOperacion;
		}
		
		System.out.println(total+"€");
	}


}
