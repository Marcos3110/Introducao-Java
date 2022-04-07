package while_lista1;
import java.util.*;

public class Questao6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE CALCULO DE RAIZ QUADRADA");
		System.out.println("INFORME UM N�MERO");
		int num = s.nextInt();
		int base = num;
		
		int impar = 1;
		int cont = 0;
		while (num > 0){
			num = num - impar;
			impar +=2;
			cont++;
		}
		System.out.println("A RAIZ QUADRADA DE " + base + "=" + cont);
		
		

	}

}
