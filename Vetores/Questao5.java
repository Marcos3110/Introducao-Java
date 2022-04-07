package vetores;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        int soma = 0;
		
		int mat01[][] = new int[6][6];
		int j = 0, i = 0;
		
		System.out.println("matriz antiga: ");

		for (int i05 = 0; i05 < 6; i05++) {
			for (int i06 = 0; i06 < 6; i06++) {
				mat01[i05][i06] = i06;
				if (i05< 3 && i06 < 3) {
					soma += mat01[i05][i06];
					System.out.print(" " + i06);		
				} else if(i05 > 2 && i06 > 2) {
					System.out.print(" " + i06);	
					soma += mat01[i05][i06];
				} else {
					System.out.print(" " + i06);
				}

				j++;
			}
			j = 0;
			i++;
			System.out.println(" ");
		}
		System.out.println(soma);
	}

	}
   

