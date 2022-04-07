package if_else.Lista_2;

import java.util.*;
import java.math.*;

public class Questao7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Informe os valores referentes ao ponto 1");
		System.out.print("Informe x1");
		double dx1 = s.nextDouble();
		System.out.print("Informe y1");
		double dy1 = s.nextDouble();
		System.out.println("Agora Informe os valores referentes ao ponto 2");
		System.out.print("Informe x2");
		double dx2 = s.nextDouble();
		System.out.print("Informe y2");
		double dy2 = s.nextDouble();
		
		if(dx1 < dx2){
			double distancia = Math.sqrt(  Math.pow((dx2 - dx1), 2) + Math.pow((dy2 - dy1), 2)   );
			System.out.println("A distancia entre os dois pontos �: " + distancia);
		}
		else
			System.out.println("N�o possivel calcular pois P1 > P2");
	}
}
