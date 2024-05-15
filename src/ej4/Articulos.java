package ej4;

public class Articulos {
	private int codigo;
	private String descripcion ="";
	private double precioCompra;
	private double precioVenta;
	private int Stock;

	public Articulos(int codigo, String descripcion, double precioCompra, double precioVenta, int stock)
			throws CodigoException, DescripcionException, PrecioCompraException, PrecioVentaException, StockException{
		super();
		if (codigo > 0) {
			this.codigo = codigo;
		}else {
			throw new CodigoException();
		}
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}else {
			throw new DescripcionException();
		}
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}else {
			throw new PrecioCompraException();
		}
		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}else {
			throw new PrecioVentaException();
		}
		if (stock >= 0) {
			Stock = stock;
		}else {
			throw new StockException();
		}
	}




	public Articulos(int codigo) {
		super();
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}




	public int getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		if (precioCompra > 0) {
			this.precioVenta = precioVenta;
		}
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		if (precioCompra >= 0) {
			Stock = stock;
		}
	}

	@Override
	public String toString() {
		String cadena = "------------------------------\n";
		cadena += "Gestisimal\n Código=" + this.codigo;
		cadena += "\n Descripción=" + this.descripcion;
		cadena += "\n Precio de la compra=" + this.precioCompra;
		cadena += "\n Precio de la venta=" + this.precioVenta;
		cadena += "\n Stock=" + this.Stock;
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		boolean igual = false;

		Articulos art = (Articulos) obj;

		if (art.codigo == this.codigo) {
			igual = true;
		}

		return igual;
	}

}
