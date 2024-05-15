package ej4;

public class Gestisimal {

	public static Articulos[] array = new Articulos[20];

	public static void listado() {
		int i = 0;

		while (i < array.length && array[i] != null) {
			System.out.println(array[i]);
			i++;
		}
	}

	public static boolean alta(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) throws CodigoException, DescripcionException, PrecioCompraException, PrecioVentaException, StockException {
		boolean anyadido = false;

		// 1º Comprobar si el artículo ya existe
		int pos = 0;
		pos = buscaArticulo(codigo);
		int i = 0;

		if (pos == -1) {
			while (i < array.length && array[i] != null) {
				// Si no he encontrado el artículo lo tengo que añadir

				i++;	
			}
			anyadido = true;
			array[i] = new Articulos(codigo, descripcion, precioCompra, precioVenta, stock);
		}
		return anyadido;
	}

	public static boolean baja(int codigo) {
		int pos;
		boolean borrado = false;
		pos = buscaArticulo(codigo);
		if (pos != -1) {
			array[pos] = null;
			borrado = true;
		}
		return borrado;
	}

	public static boolean Modificacion(int codigo, String descripcion, double precioCompra, double precioVenta,
			int stock, int opc) {
		int pos;
		boolean encontrado = false;
		pos = buscaArticulo(codigo);

		if (pos != -1) {
			switch (opc) {
			case 1:
				array[pos].setDescripcion(descripcion);
				break;
			case 2:
				array[pos].setPrecioCompra(precioCompra);
				break;
			case 3:
				array[pos].setPrecioVenta(precioVenta);
				break;
			case 4:
				array[pos].setStock(stock);
				break;

			}

			encontrado = true;
		}

		return encontrado;
	}

	public static int buscaArticulo(int codigo) {
		int i = 0;
		int pos = -1;
		boolean enc = false;

		while (i < array.length && !enc) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (array[i] != null && array[i].getCodigo() == codigo) {
				enc = true;
				pos = i;
			}

			i++;
		}

		return pos;
	}

}
