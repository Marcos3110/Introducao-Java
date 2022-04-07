package if_else.lista_1;

import java.util.Scanner;

public class Atividade_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a quantidade de peixe; ");

        double peso = s.nextDouble();
        if (peso <= 500) {
            System.out.println("O peso ta no limite ");
        } else if (peso > 500) {
            double peixe = (peso) - (500);
            double multa = (peixe) * (4);

            System.out.println("Pagar valor de: " + multa + " reais");
        }

    }
}
