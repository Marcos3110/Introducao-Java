package if_else.Lista_2;
import java.util.*;
import java.math.*;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe a medida do cateto oposto");
		double cOposto = s.nextInt();
		
		System.out.println("Informe a medida do cateto adjacente");
		double cAdjacente = s.nextInt();

		System.out.println("Informe a medida da hipotenusa");
		double hipotenusa = s.nextInt();
		
		if (Math.pow(hipotenusa,2) == (Math.pow(cOposto,2) + Math.pow(cAdjacente, 2)))
			System.out.println("Triangulo ret�ngulo");
		else
			System.out.println("N�o � triangulo ret�ngulo");
	}

}
