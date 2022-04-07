package while_lista1;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o valor m�ximo da s�rie fetuccine");
		int valorMaximo = s.nextInt();
		
		System.out.print("informe o termo 1 ");
		int termoAntAnt = s.nextInt();
		System.out.print("informe o termo 2 ");
		int termoAnt = s.nextInt();
		System.out.print(termoAntAnt + " " + termoAnt + " ");
		
		int termoCorr = 0;
		int indice = 3;
		while (termoCorr < valorMaximo)
		{
			if (indice % 2 > 0)
				termoCorr = termoAnt + termoAntAnt;
			else
				termoCorr = termoAnt - termoAntAnt;

			System.out.print(termoCorr + " ");

			termoAntAnt = termoAnt;
			termoAnt = termoCorr;
			indice ++;
		}
	}

}
