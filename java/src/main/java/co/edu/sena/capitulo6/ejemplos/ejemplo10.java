package co.edu.sena.capitulo6.ejemplos;

import java.util.Scanner;

public class ejemplo10 {

	public static void main(String[] args) {
		
		int ni, nf, cp=0, cn=0, i;
		Scanner teclado = new Scanner (System.in);
		System.out.print("numero inicial: ");
		ni = teclado.nextInt();
		System.out.print("numero final: ");
		nf = teclado.nextInt();
		for(i = ni; i <= nf; i++) {
			if (i != 0) {
				if (i < 0)
				cn +=1;	
			}else {
				cp += 1;
			}
		}
		System.out.println("");
		System.out.println("cant positivos: " + cp);
		System.out.println("cant negativos: " + cn);

	}

}
