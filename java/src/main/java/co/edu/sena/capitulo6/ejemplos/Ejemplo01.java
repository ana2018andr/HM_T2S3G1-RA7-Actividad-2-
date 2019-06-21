package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {

		int i, n, s = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("numero: ");
		n = teclado.nextInt();
		for (i = 1; i <= n; i++)
			s = s + i;
		System.out.println("");
		System.out.println("suma: " + s);
	}

}
