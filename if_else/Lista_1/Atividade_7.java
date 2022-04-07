package if_else.lista_1;

import java.util.Scanner;

public class Atividade_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um numero ");
        double numero = s.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("O número informado é par!!");
        } else
            System.out.println("O número informado é impar");
    }
}
