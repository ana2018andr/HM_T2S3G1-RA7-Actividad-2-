package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		int i, ni, nf, cp = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("num inicial: ");
		ni = teclado.nextInt();
		System.out.print("num final: ");
		nf = teclado.nextInt();
		ni = ni + 1;
		nf = nf + 1;
		for (i = ni; i <= nf; i++) {
			if (i % 2 == 0)
				cp += 1;
		}
		System.out.println("");
		System.out.println("cant. pares: " + cp);

	}

}
