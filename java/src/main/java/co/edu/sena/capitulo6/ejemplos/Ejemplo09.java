package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class Ejemplo09 {

	public static void main(String[] args) {

		float n, i, s = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("numero : ");
		n = teclado.nextInt();
		for (i = 1; i <= n - 1; i++)
			s = s + (i / (i + 1));
		System.out.println("");
		System.out.println("suma: " + s);

	}

}
