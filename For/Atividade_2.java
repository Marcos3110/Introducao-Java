package For.lista_01;

import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int media1 = 0;
        int  cont = 0;
 
        for (int i = 0; i < 5; i++) {
 
            System.out.println("Informe o valor:");
            media1 =s.nextInt();
 
            if(media1 < 0){
                cont = cont + 1;
            }
        }
        System.out.println("A quantidade de números negativos digitados são: " + cont);
    }
}
