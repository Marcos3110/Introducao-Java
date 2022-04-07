package For.lista_01;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o numero");
		int fat = s.nextInt();
		
		for (int i = fat-1; i >= 1; i--)
		{
			fat = fat *i;
		}

		System.out.println(fat);
	}

}
