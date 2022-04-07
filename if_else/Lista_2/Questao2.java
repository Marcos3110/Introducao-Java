package if_else.Lista_2;

import java.util.Scanner;

public class Questao2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Informe a sua idade");
		int idade = s.nextInt();
		
		if (idade == 1)
			System.out.println("Um ano");
		else
			if (idade == 2)
				System.out.println("Dois anos");
			//...
			else
				if (idade == 100)
					System.out.println("Cem anos");
		
		

	}

}
