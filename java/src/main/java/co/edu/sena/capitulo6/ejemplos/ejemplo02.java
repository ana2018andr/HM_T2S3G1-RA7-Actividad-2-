package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class ejemplo02 {

	public static void main(String[] args) {

		int i,ni,nf,c=0;
		Scanner teclado = new Scanner (System.in);
		System.out.print("num inicial: ");
		ni = teclado.nextInt();
		System.out.print("num final: ");
		nf = teclado.nextInt();
		ni = ni + 1;
		nf = nf + 1;
		for (i = ni; i <= nf; i++)
			c += 1;
		System.out.println("");
		System.out.println("cantidad: " + c);
		
	}

}
