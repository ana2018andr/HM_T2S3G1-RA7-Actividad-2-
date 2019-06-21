package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class ejemplo15 {

	public static void main(String[] args) {
		
		int n, d, i, r = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("numero: ");
		n = teclado.nextInt();
		System.out.print("divisor: ");
		d = teclado.nextInt();
		for (i = n - 1; i >= 1; i -= 1) {
			if (i % d == 0)
				r = i;
			break;
		}
		System.out.println("");
		System.out.println("respuesta: " + r);
	}
}
