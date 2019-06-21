package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class ejemplo06 {

	public static void main(String[] args) {
		int i,n,c=0;
		Scanner teclado = new Scanner (System.in);
		System.out.print("numero: ");
		n = teclado.nextInt();
		for (i = 1;  i<= n; i++)
			c = c + (2 + i -1);
		System.out.println("");
		System.out.println("cuadrado: " + c);
	}

}
