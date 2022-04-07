package For.lista_01;
import java.util.*;

public class Questao2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double valor;
		int contaNegativos = 0;
		
		for(int i = 1;i <= 5;i++){
			System.out.println("Informe o " + i + "� valor");
			valor = s.nextDouble();
			if(valor < 0){
				contaNegativos++;
			}
		}
		System.out.println("numeros negativos == " + contaNegativos);

	}

}
