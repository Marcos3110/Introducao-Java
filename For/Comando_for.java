package For;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Comando_for {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scca

        System.out.println("informe a quantidade de notas");
        int quant = s.nextInt();
    
        double soma = 0;
        for(int i =1;  i <= quant;  i++){
            System.out.println("Informe renda do cidadao " + i);
            double nota = s.nextDouble();
            soma += nota;
        }
        double rendaMedia = soma /quant;
        System.out.println("A renda media é: " + df.format(rendaMedia));
    }
}
