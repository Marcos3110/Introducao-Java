package vetores;

import java.util.Scanner;

public class Questao6 {
    public static void main (String[] Args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] lista = new int[10];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Informe um valor");
            lista[i] = s.nextInt();
        }
        
        for (int i = 1; i < lista.length; i++)
        	if (lista[i] < 0)
        	lista[i] = 0;
            
        for (int i = 0; i < lista.length; i++) 
            System.out.println(lista[i]);
    }

}
