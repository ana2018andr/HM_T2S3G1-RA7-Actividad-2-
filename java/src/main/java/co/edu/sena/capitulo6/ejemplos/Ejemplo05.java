package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		int i, n, sp = 0, si = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("numero: ");
		n = teclado.nextInt();
		for (i = 1; i <= n; i += 2) {
			si += i;
		}
		for (i = 2; i <= n; i += 2) {
			sp += i;
		}
		System.out.println("");
		System.out.println("suma pares: " + sp);
		System.out.println("suma impares: " + si);

	}

}
