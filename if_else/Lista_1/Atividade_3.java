package if_else.lista_1;

import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o seu saldo");

        double saldo = s.nextDouble();
        if (saldo <= 500) {
            System.out.println("Nenhum credito");
        } else if (saldo >= 501 && saldo <= 1000) {
            double valor = (saldo * 0.3);
            System.out.println("O seu limite de crédito é: " + valor);
        } else if (saldo >= 1001 && saldo <= 3000) {
            double valor = (saldo * 0.4);
            System.out.println("O seu limite de crédito é: " + valor);
        } else if (saldo >= 3001) {
            double valor = (saldo * 0.5);
            System.out.println("O seu limite de crédito é: " + valor);
        }
    }
}
