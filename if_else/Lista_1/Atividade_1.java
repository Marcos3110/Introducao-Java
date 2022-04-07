package if_else.lista_1;

import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um N°; ");
        double num = s.nextDouble();

        if (num % 10 == 0) {
            System.out.println("O número informado é divisível por 10");
        }
        if (num % 5 == 0) {
            System.out.println("O número informado é divisível por 5");
        }
        if (num % 2 == 0) {
            System.out.println("O número informado é divisível por 2");
        } else {
            System.out.println("O numero nao é divisivel por 10, 5 e nem por 2");
        }
    }
}
