package For.lista_01;

import java.util.*;

public class Questao1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base;
		
		System.out.println("Informe a base");
		base = s.nextInt();
		for(int n = 1; n <= 10;n++){
			System.out.println(n + " * " + base + " == " + (n * base));
		}

	}

}
