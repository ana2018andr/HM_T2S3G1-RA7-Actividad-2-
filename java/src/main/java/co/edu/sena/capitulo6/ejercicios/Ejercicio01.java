package co.edu.sena.capitulo6.ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		double s1 = 0, s2 = 0;
		System.out.println("Numero: ");
		num = teclado.nextInt();
		for (s1 = 0; s1 <= num; s1++) {
			s1 = num * (num + 1) * (2 * num + 1) / 6;
		}
		for (s2 = 0; s2 <= num; s2++) {
			s2 = num * num * (num + 1) * (num + 1) / 4;
		}
		System.out.println("Suma de los cuadrados de los n primeros terminos:" + s1);
		System.out.println("Suma de los cubos de los n primeros terminos:" + s2);

	}

}
