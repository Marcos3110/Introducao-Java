package if_else.Lista_2;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("iNFORME O VALOR 1");
			int v1 = s.nextInt();
			
			System.out.println("iNFORME O VALOR 2");
			int v2 = s.nextInt();
			
			System.out.println("iNFORME O VALOR 3");
			int v3 = s.nextInt();
			
			/////////////////////////////////////////
	
			System.out.println("Qual a forma de ordena��o? CRESCENTE DECRESCENTE");
			String opcao = s.next();
			
			if (opcao.equalsIgnoreCase("Crescente")){
				if(v1 <= v2 && v2 <= v3)
					System.out.println(v1 + ", " + v2 + ", " + v3);
				else
					if(v1 <= v3 && v3 <= v2)
						System.out.println(v1 + ", " + v3 + ", " + v2);
					else
						if(v2 <= v3 && v3 <= v1)
							System.out.println(v2 + ", " + v3 + ", " + v1);
						else
							if(v2 <= v1 && v1 <= v3)
								System.out.println(v2 + ", " + v1 + ", " + v3);
							else
								if(v3 <= v1 && v1 <= v2)
									System.out.println(v3 + ", " + v1 + ", " + v2);
								else
									if(v3 <= v2 && v2 <= v1)
										System.out.println(v3 + ", " + v2 + ", " + v1);
				
			}
			else
				if (opcao.equalsIgnoreCase("Decrescente")){
					if(v1 >= v2 && v2 >= v3)
						System.out.println(v1 + ", " + v2 + ", " + v3);
					else
						if(v1 >= v3 && v3 >= v2)
							System.out.println(v1 + ", " + v3 + ", " + v2);
						else
							if(v2 >= v3 && v3 >= v1)
								System.out.println(v2 + ", " + v3 + ", " + v1);
							else
								if(v2 >= v1 && v1 >= v3)
									System.out.println(v2 + ", " + v1 + ", " + v3);
								else
									if(v3 >= v1 && v1 >= v2)
										System.out.println(v3 + ", " + v1 + ", " + v2);
									else
										if(v3 >= v2 && v2 >= v1)
											System.out.println(v3 + ", " + v2 + ", " + v1);
				}
				else
					System.out.println("OP�AO INV�LIDA!!");
					
	}

}































/*
 * 			System.out.println("Informe o primeiro valor");
			int v1 = s.nextInt();
			System.out.println("Informe o segundo valor");
			int v2 = s.nextInt();
			System.out.println("Informe o terceiro valor");
			int v3 = s.nextInt();

			System.out.println("Informe a ordena��o! (Crescente / Decrescente)");
			String ordem = s.next();

			if(ordem.equalsIgnoreCase("crescente"))
			{
				if(v1 <= v2 && v2 <= v3)
					System.out.println(v1 + ", " + v2 + ", " + v3);
				else
					if(v1 <= v3 && v3 <= v2)
						System.out.println(v1 + ", " + v3 + ", " + v2);
					else
						if(v2 <= v3 && v3 <= v1)
							System.out.println(v2 + ", " + v3 + ", " + v1);
						else
							if(v2 <= v1 && v1 <= v3)
								System.out.println(v2 + ", " + v1 + ", " + v3);
							else
								if(v3 <= v1 && v1 <= v2)
									System.out.println(v3 + ", " + v1 + ", " + v2);
								else
									if(v3 <= v2 && v2 <= v1)
										System.out.println(v3 + ", " + v2 + ", " + v1);
			}	
			else
			{
				if(v1 >= v2 && v2 >= v3)
					System.out.println(v1 + ", " + v2 + ", " + v3);
				else
					if(v1 >= v3 && v3 >= v2)
						System.out.println(v1 + ", " + v3 + ", " + v2);
					else
						if(v2 >= v3 && v3 >= v1)
							System.out.println(v2 + ", " + v3 + ", " + v1);
						else
							if(v2 >= v1 && v1 >= v3)
								System.out.println(v2 + ", " + v1 + ", " + v3);
							else
								if(v3 >= v1 && v1 >= v2)
									System.out.println(v3 + ", " + v1 + ", " + v2);
								else
									if(v3 >= v2 && v2 >= v1)
										System.out.println(v3 + ", " + v2 + ", " + v1);
			}

 */

