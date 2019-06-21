package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class Ejemplo08 {

	public static void main(String[] args) {

		int i, n1, n2, s1 = 0, s2 = 0;
		String r = "";
		Scanner teclado = new Scanner(System.in);
		System.out.print("numero 1: ");
		n1 = teclado.nextInt();
		System.out.print("numero 2: ");
		n2 = teclado.nextInt();
		for (i = 1; i <= n1 / 2; i++) {
			if (n1 % i == 0)
				s1 += i;
		}
		for (i = 1; i <= n2 / 2; i++) {
			if (n2 % i == 0)
				s2 += i;
		}
		if (n1 == s2 && n2 == s1) {
			r = "son amigos";
		} else {
			r = "no son amigos";
		}
		System.out.println("");
		System.out.println("resultado: " + r);

	}

}
