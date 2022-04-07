package if_else.lista_1;

import java.util.Scanner;

public class Atividade_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual tipo de prato?");
        System.out.println("[1] Vegetariano [2] Peixe [3] Frango [4] Carne");
        String prato = s.next();

        int prato1 = 0;
        if (prato.equalsIgnoreCase("1")) {
            int caloria = 180;
            prato1 = (caloria);
        } 
        else if (prato.equalsIgnoreCase("2")) {
            int caloria = 230;
            prato1 = (caloria);
        } 
        else if (prato.equalsIgnoreCase("3")) {
            int caloria = 250;
            prato1 = (caloria);
        } 
        else if (prato.equalsIgnoreCase("4")) {
            int caloria = 350;
            prato1 = (caloria);
        }
        System.out.println("Qual tipo de sobremesa?");
        System.out.println("[1] Abacaxi [2] Sorvete diet [3] Mouse diet  [4] Mouse de chocolate");
        String sobremesa = s.next();

        int sobremesa1 = 0;
        if (sobremesa.equalsIgnoreCase("1")) {
            int caloria2 = 75;
            sobremesa1 = (caloria2);
        } 
        else if (sobremesa.equalsIgnoreCase("2")) {
            int caloria2 = 110;
            sobremesa1 = (caloria2);
        } 
        else if (sobremesa.equalsIgnoreCase("3")) {
            int caloria2 = 170;
            sobremesa1 = (caloria2);
        } 
        else if (sobremesa.equalsIgnoreCase("4")) {
            int caloria2 = 200;
            sobremesa1 = (caloria2);
        }
        System.out.println("Qual tipo de prato?");
        System.out.println("[1] Cha [2] Suco de laranja [3] suco de melao [4] refrigerante diet");
        String bebida = s.next();

        int bebida1 = 0;

        if (bebida.equalsIgnoreCase("1")) {
            int caloria1 = 20;
            bebida1 = (caloria1);                                                              
        } 
        else if (bebida.equalsIgnoreCase("2")) {
            int caloria1 = 70;
            bebida1 = (caloria1);
        } 
        else if (bebida.equalsIgnoreCase("3")) {
            int caloria1 = 100;
            bebida1 = (caloria1);
        } 
        else if (bebida.equalsIgnoreCase("4")) {
            int caloria1 = 65;
            bebida1 = (caloria1);
        }
        int caloriasTotal = (prato1) + (sobremesa1) + (bebida1);
        System.out.println("A media de calorias é: " + caloriasTotal);
    }
}