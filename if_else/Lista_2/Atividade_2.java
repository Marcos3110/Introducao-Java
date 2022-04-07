package if_else.Lista_2;
import java.util.Scanner;
public class Atividade_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe ano de vida");
        int anos = s.nextInt();

        System.out.println("Informe meses de vida");
        int meses = s.nextInt();

        System.out.println("Informe dias de vida");
        int dias = s.nextInt();

        int totalDias = (anos *365) + (meses * 30) + dias;

        System.out.println("Voce tem " + totalDias + " dias de vida");

        System.out.println("Fim");
    }
}
