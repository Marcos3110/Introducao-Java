package For.lista_01;
import java.util.*;

public class Questao7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int valor;
		int contaNegativo = 0;
		int contaPositivo = 0;
		
		for(int i = 1;i <= 20;i++){
			System.out.println("Informe " + i + "� valor");
			valor = s.nextInt();
			if(valor >= 0){
				contaPositivo++;
			}else{
				contaNegativo++;
			}
		}
		System.out.println("percentual negativos == " + ((contaNegativo * 100)/20) + "%" +
						   "\npercentual positivos == " + ((contaPositivo * 100)/20) + "%");

	}

}
