package if_else.Lista_2;

import java.util.*;

public class Questao4 {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe dias de vida");
		int dias = s.nextInt();
		
		int anos = 0;
		int meses = 0;
		
		if (dias >= 365) {
			anos = dias / 365;
			dias = dias % 365;
		}
		
		if (dias >= 30) {
			meses = dias / 30;
			dias = dias % 30;
		}
		
		if ((anos > 0) & (meses > 0) & (dias > 0))
			System.out.println("Vc tem " + anos + " anos, " + meses + " meses e" + dias + " dias.");
		else
			if ((anos > 0) & (meses == 0) & (dias == 0))
				System.out.println("Vc tem " + anos + " anos.");
			else
				if ((anos > 0) & (meses > 0) & (dias == 0))
					System.out.println("Vc tem " + anos + " anos, " + meses + " meses.");
				else
					if ((anos > 0) & (meses == 0) & (dias > 0))
						System.out.println("Vc tem " + anos + " anos e " +  dias + " dias. ");
					else
						if ((anos == 0) & (meses > 0) & (dias == 0))
							System.out.println("Vc tem " + meses + " meses.");
						else
							if ((anos == 0) & (meses > 0) & (dias > 0))
								System.out.println("Vc tem " + meses + " meses e " + dias + " dias." );
							else
								if ((anos == 0) & (meses == 0) & (dias > 0))
									System.out.println("Vc tem " + dias + " dias.");
								else
									System.out.println("Nenhum calculo foi realizado.");
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * 		System.out.println("Informe quantos dias de vida voc� tem");
		int dias = s.nextInt();
		
		int anos = 0;
		int meses = 0;
		
		if (dias >= 365){
			anos = dias /365;
			dias = dias % 365;
		}
		
		if (dias >= 30){
			meses = dias / 30;
			dias = dias % 30;
		}
		
		if ((anos > 0) & (meses > 0) & (dias > 0))
			System.out.println("Vc tem " + anos + " anos, " + meses + " meses e" + dias + " dias.");
		else
			if ((anos > 0) & (meses == 0) & (dias == 0))
				System.out.println("Vc tem " + anos + " anos.");
			else
				if ((anos > 0) & (meses > 0) & (dias == 0))
					System.out.println("Vc tem " + anos + " anos, " + meses + " meses.");
				else
					if ((anos > 0) & (meses == 0) & (dias > 0))
						System.out.println("Vc tem " + anos + " anos e " +  dias + " dias. ");
					else
						if ((anos == 0) & (meses > 0) & (dias == 0))
							System.out.println("Vc tem " + meses + " meses.");
						else
							if ((anos == 0) & (meses > 0) & (dias > 0))
								System.out.println("Vc tem " + meses + " meses e " + dias + " dias." );
							else
								if ((anos == 0) & (meses == 0) & (dias > 0))
									System.out.println("Vc tem " + dias + " dias.");
								else
									System.out.println("Nenhum calculo foi realizado.");
									
		if (anos > 0)					
			System.out.println(anos + " anos" );

		if (meses > 0)					
			System.out.println(meses + " meses" );
		
		if (dias > 0)					
			System.out.println(dias + " dias" );

	 */

