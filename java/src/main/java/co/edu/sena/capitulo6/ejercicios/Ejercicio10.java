package co.edu.sena.capitulo6.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int n = 0;
		System.out.print("Introduce numero : ");
		n = teclado.nextInt();

		while (n > 0) {
			n = n / 10;
			i++;
		}

		System.out.println("tiene " + i + " dígitos conformantes de un numero capicua");
	}

}
