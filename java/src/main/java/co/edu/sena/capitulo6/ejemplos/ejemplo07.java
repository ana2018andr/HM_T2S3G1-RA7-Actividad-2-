package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class ejemplo07 {

	public static void main(String[] args) {

		int  n,s=0,i;
		String r="";
		Scanner teclado = new Scanner (System.in);
		System.out.print("numero: ");
		n = teclado.nextInt();
		for (i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				s += i;
		}
		if (n == 3) {
			r = "prefecto";
		}else { 
			r = "no es perfecto";
		}
		System.out.println("");
		System.out.println("resultado: " + r);
			
	}

}
