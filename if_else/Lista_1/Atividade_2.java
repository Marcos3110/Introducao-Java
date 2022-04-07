package if_else.lista_1;

import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o seu peso ");
        double peso = s.nextDouble();

        System.out.println("informe a sua altura ");
        double altura = s.nextDouble();

        double imc = (peso) / (altura * altura);

        if (imc < 20) {
            System.out.println("abaixo do peso");
        }

        else if (imc >= 20 && imc < 25) {
            System.out.println("Peso normal");
        }

        else if (imc >= 25 && imc < 30) {
            System.out.println("Sobre peso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Obeso");
        } else if (imc >= 40) {
            System.out.println("Obeso morbido");
        }
    }
}