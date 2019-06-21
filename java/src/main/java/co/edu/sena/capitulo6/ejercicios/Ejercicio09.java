package co.edu.sena.capitulo6.ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i, j;
		boolean p;
		int r = 2;
		int rF = 100;
		for (i = r; i <= rF; i++) {
			p = true;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					p = false;
				}
			}
			if (p) {
				System.out.println(i + "\n");
			}
		}
	}
}
