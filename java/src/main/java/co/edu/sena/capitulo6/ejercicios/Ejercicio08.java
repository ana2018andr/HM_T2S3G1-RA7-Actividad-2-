package co.edu.sena.capitulo6.ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i, cant;
		cant = 1;
		System.out.println("numero de objeto ");
		n = teclado.nextInt();
		for (i = 1; i <= n; i++) {
			cant = cant * 1;
		}
		System.out.println("el numero de veces aceptables que se dejan ordenar es :" + cant);
	}

}
