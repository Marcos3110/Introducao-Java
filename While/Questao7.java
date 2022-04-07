package while_lista1;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe ium valor entre 1000 e 9999: ");
		int valor = s.nextInt();
		while(valor > 1000 && valor < 9999){
			int p1 = Integer.parseInt(String.valueOf(valor).substring(0, 2));
			int p2 = Integer.parseInt(String.valueOf(valor).substring(2, 4));
			
			int result = p1 + p2;
			System.out.println(p1 + "+" + p2 + "=" + result);
			
			System.out.println(result + " ao quadrado =" + (result * result));
			
			if((result * result) == valor)
				System.out.println("O numero " + valor + " apresenta tal caracteristica!!!");
			else
				System.out.println("O numero " + valor + " n�o apresenta tal caracteristica!!!");
			
			System.out.println("");
			System.out.println("------------------------------------------- ");
			System.out.print("Informe ium valor entre 1000 e 9999: ");
			valor = s.nextInt();
		}
		System.out.print("Fim de execu��o. ");
	}

}
