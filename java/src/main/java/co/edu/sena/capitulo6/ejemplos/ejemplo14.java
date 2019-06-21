package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class ejemplo14 {

	public static void main(String[] args) {
		
		int n, c = 0, i, j = 0;
		boolean flag;
		Scanner teclado = new Scanner(System.in);
		System.out.print("numero: ");
		n = teclado.nextInt();
		for (i = 2; j <= i / 2; i++) {
			flag = true;
			for(j = 2; j <= i / 2; i++) {
				if (i % j == 0) 
					flag = false;
					break;
			}

		if (flag) {
			c += 1;
			flag = true;
		}
	}
		System.out.println("");
		System.out.println("cantidad " + c);
		
	}

}
