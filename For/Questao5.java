package For.lista_01;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont = 0;
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("Informe um numero");
			int num = s.nextInt();
			
			boolean primo = num >= 2;
			for (int x = 2; x < num; x++)
			{
				if (num % x == 0){
					primo = false;
					break;
				}
			}
			if (primo)
				cont++;
				
		}
		System.out.println("Foram informados " + cont + " numeros primos");
		
	}

}
