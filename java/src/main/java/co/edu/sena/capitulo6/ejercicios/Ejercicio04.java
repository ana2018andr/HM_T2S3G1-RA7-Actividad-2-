package co.edu.sena.capitulo6.ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, f1, f2, i, suma = 0;
		do {
			System.out.print("Introduce numero mayor que 1: ");
			numero = teclado.nextInt();
		} while (numero < 1);
		System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");

		f1 = 1;
		f2 = 1;

		System.out.print(f1 + " ");
		for (i = 2; i <= numero; i++) {
			System.out.print(f2 + " ");
			f2 = f1 + f2;
			f1 = f2 - f1;
		}
		suma = f1 + f2 - 1;
		System.out.println();
		System.out.println("La sumatoria es: " + suma);
	}

}
