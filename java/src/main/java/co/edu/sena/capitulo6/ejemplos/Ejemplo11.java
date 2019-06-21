package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class Ejemplo11 {

	public static void main(String[] args) {

		int ni, nf, nm, c = 0, i;
		Scanner teclado = new Scanner(System.in);
		System.out.print("numero inicial: ");
		ni = teclado.nextInt();
		System.out.print("numero final: ");
		nf = teclado.nextInt();
		System.out.print("multiplo: ");
		nm = teclado.nextInt();
		for (i = ni; i <= nf; i++) {
			if (i % nm == 0)
				c += 1;
		}
		System.out.println("");
		System.out.println("cantidad: " + c);

	}

}
