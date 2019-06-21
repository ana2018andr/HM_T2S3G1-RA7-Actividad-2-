package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class Ejemplo13 {

	public static void main(String[] args) {

		int n, i;
		boolean flag;
		String r = "";
		Scanner teclado = new Scanner(System.in);
		System.out.print("numero inicial: ");
		n = teclado.nextInt();
		flag = true;
		i = 2;
		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			r = "es primo";
		} else {
			r = "no es primo";
		}
		System.out.println("");
		System.out.println("respuesta: " + r);

	}

}
