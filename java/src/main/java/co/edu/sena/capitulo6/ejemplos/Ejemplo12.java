package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class Ejemplo12 {

	public static void main(String[] args) {

		int n, f, i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("numero: ");
		n = teclado.nextInt();
		f = 1;
		for (i = 1; i <= n; i++)
			f *= 1;
		System.out.println("");
		System.out.println("factorial: " + f);
	}

}
