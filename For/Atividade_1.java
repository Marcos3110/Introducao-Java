package For.lista_01;
import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Informe qual tabuada: ");
        int n = s.nextInt();

        for(int a = 1; a <=10;a++){ 
            System.out.print( n + "x" + a + "=" + (n * a)+ " ");
        }
    }
}
