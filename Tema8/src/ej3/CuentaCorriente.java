package ej3;

import ej2.NegativeHourException;

public class CuentaCorriente {
	String dni;
	String nombre;
	double saldo;

	public CuentaCorriente(String dni, String nombre, double saldo)throws DniException,NombreException,SaldoException {
		super();
		if (dni != null && !dni.equals("") && dni.length() == 9) {
			this.dni = dni;
		}else {
			throw new DniException();
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}else {
			throw new NombreException();
		}
		if (saldo > 0) {
			this.saldo = saldo;
		}else {
			throw new SaldoException();
		}
	}

	public CuentaCorriente(String dni, double saldo) {
		super();
		if (saldo > 0)
			this.saldo = saldo;
		if (dni != null && !dni.equals("") && dni.length() == 9)
			this.dni = dni;
	}

	public void sacarDinero(double saldo, double sacar) {

		if (sacar <= this.saldo) {

			this.saldo -= sacar;
		}
	}

	public void meteDinero(double saldo, double meter) {
		if (meter > 0)
			;
		this.saldo += meter;

	}

	public void mostrarInformacion(double saldo, String dni, String nombre) {
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Saldo: " + this.saldo);
	}
}
