package For.lista_01;
import java.util.*;

public class Questao4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		int valor = s.nextInt();
		int maiorValor = valor;
		int menorValor = valor;
		int somaValores = 0;
		
		for(int i = 2;i <= 500;i++){
			System.out.println("Informe o " + i + "� valor");
			valor = s.nextInt();
			if(valor > maiorValor){
				maiorValor = valor;
			}
			if(valor < menorValor){
				menorValor = valor;
			}
			somaValores += valor;
		}
		System.out.println("maior valor = " + maiorValor +
						   "menor valor = " + menorValor + 
						   "media == " + (somaValores / 500));

	}

}
