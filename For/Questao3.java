package For.lista_01;
import java.util.*;

public class Questao3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int valor;
		int somaPositivo = 0;
		int contaMenoresZero = 0;
		int contaIntervalo = 0;
		int contaPositivo = 0;
		
		for(int i = 1;i <= 10;i++){
			System.out.println("Informe " + i + "� valor");
			valor = s.nextInt();
			if(valor >= 0){
				somaPositivo += valor;
				contaPositivo++;
			}
			if(valor < 0){
				contaMenoresZero++;
			}
			if(valor >= 5 && valor <= 50){
				contaIntervalo++;
			}
		}
		System.out.println("media positivos == " + (somaPositivo / contaPositivo) + 
						   "\nvalores < 0 == " + contaMenoresZero + 
						   "\nvalores no intervalo: 5 >= valor <= 50 == " + contaIntervalo);

	}

}
