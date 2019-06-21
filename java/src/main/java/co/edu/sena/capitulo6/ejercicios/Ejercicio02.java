package co.edu.sena.capitulo6.ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int num, j, sum = 0, div = 0;
		System.out.println("enter one number ");
		num = teclado.nextInt();
		for (j = 0; j <= num; j++) {
			sum += j;
			if (j % 3 == 0 && j % 5 == 0 && j != 0) {
				div += 1;
			}
		}
		System.out.println("sumatoria: " + sum);
		System.out.println("cantidad de divisores de 3 & 5: " + div);
	}

}
