package if_else.lista_1;

import java.util.Scanner;

public class Atividade_8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe a NOTA 1 ");
        double nota1 = s.nextDouble();
        System.out.println("Informe a NOTA 2 ");
        double nota2 = s.nextDouble();
        System.out.println("Informe NOTA 3");
        double nota3 = s.nextDouble();
        System.out.println("Informe a NOTA 4 ");
        double nota4 = s.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("'Vc foi aprovado" + media);
        } else
            System.out.println("Infome a nota do exame");
        double exame = s.nextDouble();

        double nmedia = ((exame + media) / 2);
        if (nmedia >= 5) {
            System.out.println("Vc foi aprovado em exame " + nmedia);
        } else if (nmedia >= 4) {
            System.out.println("Vc reprovou " + nmedia);
        }
    }
}