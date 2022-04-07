package vetores;

import java.util.Scanner;

public class Questao4 {
    public static void main (String[] Args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] lista = new int[10];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Informe um valor");
            lista[i] = s.nextInt();
        }
        
        System.out.println("Informe um valor a pesquisar no array");
        int valor = s.nextInt();
        
        boolean achou = false;
        for (int i = 0; i < lista.length; i++)
        	if (lista[i] == valor)
        	{
                System.out.println("O valor procurado est� na posi��o de �ndice " + i + " do array");
                achou = true;
                break;
        	}
        
        if (!achou)
            System.out.println("O valor procurado n�o existe no array");
            
    }

}
