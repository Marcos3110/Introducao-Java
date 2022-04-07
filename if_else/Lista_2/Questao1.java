package if_else.Lista_2;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Informe a nota 1");
		double n1 = s.nextDouble();
		System.out.println("Informe a nota 2");
		double n2 = s.nextDouble();
		System.out.println("Informe a nota 3");
		double n3 = s.nextDouble();
		
		System.out.println("Informe o tipo de m�dia [1] Aritmetica [2] Ponderada");
		int tipo = s.nextInt();
		
		double media = 0;
		
		if (tipo == 1){
			//m�dia aritmetica
			media = (n1+n2+n3) / 3;
		}
		else
			if (tipo == 2) {
				//m�dia ponderada
				System.out.println("Informe o peso da nota 1");
				double p1 = s.nextDouble();
				System.out.println("Informe o peso da nota 2");
				double p2 = s.nextDouble();
				System.out.println("Informe o npeso da nota 3");
				double p3 = s.nextDouble();
				media = n1*p1 + n2*p2 + n3*p3;
			}
			else
			{
				System.out.println("Op��o inv�lida");
				media = 0;
			}
		System.out.println("A media �: " + media);


	}

}
