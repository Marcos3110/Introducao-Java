package vetores;

import java.util.Scanner;

public class Questao11 {
    public static void main (String[] Args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] lista = new int[10];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Informe um valor");
            lista[i] = s.nextInt();
        }
        
        for (int i = 0; i < lista.length; i++)
        {
        	int cont = 0;
            for (int x = i+1; x < (lista.length); x++) {
            	if ((lista[x] == lista[i]))
            		cont++;
            	}
            
            if (cont > 0)
                System.out.println ("O valor " + lista[i] + " aparece " + (cont+1) + " vezes.");
        }
    }	

}
