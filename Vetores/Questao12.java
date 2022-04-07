package vetores;

import java.util.Scanner;

public class Questao12 {
    public static void main (String[] Args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] lista = new int[10];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Informe um valor");
            lista[i] = s.nextInt();
        }
        
        for (int i = 0; i < lista.length; i++) 
            for (int x = 0; x < (lista.length-1); x++) {
            	if (lista[x] == 0)
            	{
            		int aux = lista[x+1];
            		lista[x+1] = lista[x];
            		lista[x] = aux;
            	}
            }
        	
        
        for (int i = 0; i < lista.length; i++)
            System.out.println (lista[i]);
    }	
}
