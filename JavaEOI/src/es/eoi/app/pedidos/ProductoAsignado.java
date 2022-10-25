 package es.eoi.app.pedidos;

public class ProductoAsignado {
	private Producto producto;
	private int unidades;
	
	public ProductoAsignado(Producto producto, int unidades) {
		this.producto = producto;
		this.unidades = unidades;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getUnidades() {
		return unidades;
	}
		
}
