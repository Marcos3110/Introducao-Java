package if_else.lista_1;

import java.util.Scanner;

public class Atividade_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Iforme um n° de 1 a 7 para descobri o dia da semana");
        int dia = s.nextInt();

        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-feira");
        } else if (dia == 3) {
            System.out.println("Terça-feira");
        } else if (dia == 4) {
            System.out.println("Quarta-feira");
        } else if (dia == 5) {
            System.out.println("Quinta-feira");
        } else if (dia == 6) {
            System.out.println("Sexta-feira");
        } else if (dia == 7) {
            System.out.println("Sabado");
        } else if (dia > 7) {
            System.out.println("Nao tem dia correspondente");
        }

    }
}
