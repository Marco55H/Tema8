package ej4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc;
		int codigo;
		String descripcion = "";
		double precioCompra = 0;
		double precioVenta = 0;
		int stock = 0;

		do {
			menu();
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1:
				System.out.println("Este es el listado de elementos:");
				Gestisimal.listado();
				System.out.println("--------------------------------");
				break;

			case 2:
				System.out.println("Añada un artículo");
				System.out.println("-----------------");
				System.out.println("Añade el código del producto");
				codigo = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Añande la descripción del producto");
				descripcion = sc.nextLine();

				System.out.println("Añade el Precio de compra del producto");
				precioCompra = sc.nextDouble();
				sc.nextLine();

				System.out.println("Añade el precio de venta del producto");
				precioVenta = sc.nextDouble();
				sc.nextLine();

				System.out.println("Añade el stock del producto");
				stock = sc.nextInt();
				sc.nextLine();

				System.out.println(Gestisimal.buscaArticulo(codigo)); 
				
				try {
					if (Gestisimal.alta(codigo, descripcion, precioCompra, precioVenta, stock)) {
						System.out.println("El artículo se ha dado de alta correctamente");
					} else {
						System.out.println("El artículo no se ha podido dar de alta");
					}
				} catch (CodigoException | DescripcionException | PrecioCompraException | PrecioVentaException
						| StockException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 3:
				System.out.println("Vamos a borrar un artículo");
				System.out.println("Introduzca el código del artículo que quiere borrar");
				codigo = sc.nextInt();
				sc.nextLine();

				if (Gestisimal.baja(codigo)) {
					System.out.println("Artículo dado de baja");
				} else {
					System.out.println("Artículo elegido no valido");
				}
				break;
			case 4:
				System.out.println("Vamos a modificar un artículo");
				System.out.println("Introduzca el código del artículo que quiere modificar");
				codigo=sc.nextInt();
				sc.nextLine();
				
				System.out.println("¿Que atributo quieres modificar?");
				System.out.println("1- Descripición");
				System.out.println("2- Precio de la compra");
				System.out.println("3- Precio de la venta");
				System.out.println("4- Stock");
				System.out.println("Elige que quieres modificar");

				opc = sc.nextInt();
				sc.nextLine();
				
				switch (opc) {
				case 1:
					System.out.println("Elige la nueva descripción");
					descripcion = sc.nextLine();
					break;
				case 2:
					System.out.println("Elige el nuevo precio de compra");
					precioCompra = sc.nextDouble();
					sc.nextLine();
					break;
				case 3:
					System.out.println("Elige el nuevo precio de venta");
					precioVenta = sc.nextDouble();
					sc.nextLine();
					break;

				case 4:
					System.out.println("Elige el nuevo stock");
					stock = sc.nextInt();
					sc.nextLine();
					break;
				}

				if (Gestisimal.Modificacion(codigo, descripcion, precioCompra, precioVenta, stock, opc)) {
					System.out.println("Artículo modificado");
				} else {
					System.out.println("Modificación no valida");
				}
				break;

			}
		} while (opc < 5);

		sc.close();
	}

	private static void menu() {
		System.out.println("-------MENU-------");
		System.out.println("1º Listado");
		System.out.println("2º Alta");
		System.out.println("3º Baja");
		System.out.println("4º Modificación");
		System.out.println("5º Salir");
		System.out.println("Elige tu opción");
	}
}
