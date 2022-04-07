package if_else.lista_1;

import java.util.Scanner;

public class Atividade_9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o N° 1 ");
        int num1 = s.nextInt();
        System.out.println("Informe o N°2 ");
        int num2 = s.nextInt();
        System.out.println("Informe o N° 3");
        int num3 = s.nextInt();
        System.out.println("Informe o N°4 ");
        int num4 = s.nextInt();
        System.out.println("Informe o N°5");
        int num5 = s.nextInt();

        int media = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("A media é: " + media);

        if (num1 > media) {
            System.out.println("O N°1 é maior que a media " + num1);
        }
        if (num2 > media) {
            System.out.println("O N°2 é maior que a media " + num2);
        }
        if (num3 > media) {
            System.out.println("O N°3 é maior que a media " + num3);
        }
        if (num4 > media) {
            System.out.println("O N°4 é maior que a media " + num4);
        }
        if (num5 > media) {
            System.out.println("O N°5 é maior que a media " + num5);
        }
    }
}
