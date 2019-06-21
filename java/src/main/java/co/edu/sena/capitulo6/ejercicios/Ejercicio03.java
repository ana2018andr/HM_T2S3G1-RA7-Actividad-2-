package co.edu.sena.capitulo6.ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int p = 0, impar = 0, sumatotal = 0, m = 0;
		System.out.print("Ingrese numero :");
		int num1 = teclado.nextInt();
		System.out.print("Ingrese numero :");
		int num2 = teclado.nextInt();
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				p = p + 1;
			} else {
				impar = impar + 1;
			}
			if (i % 3 == 0) {
				m = m + 1;
			}
			sumatotal = sumatotal + i;
		}

		System.out.println("La cantidad de numeros PARES es: " + p);
		System.out.println("La cantidad de numeros IMPARES es: " + impar);
		System.out.println("Los Multiplos de 3 es: " + m);
		System.out.println("La Suma Total del rango es: " + sumatotal);
	}

}
