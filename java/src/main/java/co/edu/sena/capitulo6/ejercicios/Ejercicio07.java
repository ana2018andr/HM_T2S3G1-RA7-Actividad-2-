package co.edu.sena.capitulo6.ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
		double p = 1, x, f = 1, s = 1;
		System.out.println("Ingrese valor de x : ");
		x = teclado.nextInt();
		System.out.println("Ingrese valor de n : ");
		n = teclado.nextInt();
		for (i = 1; i <= n - 1; i++) {
			f = f + 1;
			p = p * x;
			s = s * p / f;
		}
		System.out.println("");
		System.out.println("La sumatoria es  : " + s);
	}

}
