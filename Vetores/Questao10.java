package vetores;

import java.util.Scanner;

public class Questao10 {

    public static void main (String[] Args) throws Exception {
        Scanner s = new Scanner(System.in);
        String[] lista1 = new String[5];
        String[] lista2 = new String[5];
        
        for (int i = 0; i < lista1.length; i++) {
            System.out.println("Informe um valor lista1[" + i + "]");
            lista1[i] = s.next().toUpperCase();
        }
        
        for (int i = 0; i < lista2.length; i++) {
            System.out.println("Informe um valor lista2[" + i + "]");
            lista2[i] = s.next().toUpperCase();
        }
        
        boolean igual = true;
        for (int i = 0; i < lista1.length; i++)
        {
        	boolean contem = false;
            for (int x = 0; x < (lista2.length); x++) 
            	if (lista2[x].equals(lista1[i]))
            		contem = true;
            
            if (!contem) {
            	igual = false;
            	break;
            }
        }
        
        if (!igual)
            System.out.println("As duas listas s�o diferentes");
        else
            System.out.println("As duas listas s�o iguais");
    }	

}
