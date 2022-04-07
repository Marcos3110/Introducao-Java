package if_else.Lista_2;

import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a NOTA 1 ");
        double nota1 = s.nextDouble();
        System.out.println("Informe a NOTA 2 ");
        double nota2 = s.nextDouble();
        System.out.println("NOTA 3");
        double nota3 = s.nextDouble();

        System.out.println("qual o tipo de media ");
        System.out.println("[A]Aritimetica [P]ponderada ");
        String opçao = s.next();

        double media = 0;
        if (opçao.equalsIgnoreCase("A")) {
            // calcula media aritmetica
            media = (nota1 + nota2 + nota3) / 3;
        }

        if (opçao.equalsIgnoreCase("P")) {
            // calcular media ponderada
            System.out.println("Digite o peso da nota 1");
            double peso1 = s.nextDouble();
            System.out.println("Digite o peso da nota 2");
            double peso2 = s.nextDouble();
            System.out.println("Digite o peso da nota 3");
            double peso3 = s.nextDouble();

            media = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        }

        System.out.println("A media é : " + media);

        if (media >= 7) {
            System.out.println("Aprovado " + media);
            System.out.println("Parabens");
        } else if (media < 5) {
            System.out.println("reprovado  " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("Exame " + media);

        }
    }
}