package vetores;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] lista = new int[16];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Informe um valor");
            lista[i] = s.nextInt();
        }
        
        int incremento = lista.length/2;

        for (int i = 0; i < incremento; i++)
        {
        	int aux = lista[i];
        	lista[i] = lista[i+incremento];
        	lista[i+incremento] = aux;
        }
        
        
        for (int i = 0; i < lista.length; i++) 
            System.out.println(lista[i]);

	}
}
