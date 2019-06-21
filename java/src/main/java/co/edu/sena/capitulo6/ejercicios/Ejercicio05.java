package co.edu.sena.capitulo6.ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int t = 0, n1, n2, a = 0, b = 0;
		System.out.print("numero inicial ");
		n1 = teclado.nextInt();
		System.out.print("numero final ");
		n2 = teclado.nextInt();
		if (n1 < n2) {
			a = n2;
			b = n1;
		} else {
			a = n1;
			b = n2;
		}
		while (b != 0) {
			t = a % b;
			a = b;
			b = t;
		}
		System.out.println("resultado :" + a);
	}

}
