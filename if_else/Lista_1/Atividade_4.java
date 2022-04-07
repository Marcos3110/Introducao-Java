package if_else.lista_1;

import java.util.Scanner;

public class Atividade_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        System.out.println("informe sua idade: ");
        int ida = s.nextInt();

        if (ida < 16) {
            System.out.println("Nao eleitor");
        } else if (ida >= 18 && ida <= 65) {
            System.out.println("Eleitor obrigatorio");
        }
        if (ida >= 16 && ida < 18 || ida >= 65) {
            System.out.println("Eleitor facutativo");
        }
    }
}
