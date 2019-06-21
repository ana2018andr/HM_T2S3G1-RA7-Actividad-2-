package co.edu.sena.capitulo6.ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contador = 0, div = 0, d;
		int arreglo[] = new int[20];
		System.out.print("Ingrese d :");
		d = teclado.nextInt();

		for (int i = 0; i < d; i++) {
			System.out.print("A[" + (i + 1) + "]= ");
			arreglo[i] = teclado.nextInt();
		}

		System.out.print("Ingrese un divisor: ");
		div = teclado.nextInt();
		for (int i = 0; i < d; i++) {
			if (arreglo[i] % div == 0) {
				contador = contador + 1;
			}
		}
		System.out.println("Se encontraron : " + contador + " multiplos del divisor: " + div);

		return;
	}

}
