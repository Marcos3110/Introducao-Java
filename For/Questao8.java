package For.lista_01;
import java.util.*;

public class Questao8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome;
		
		int contaBom = 0;
		int contaExemplar = 0;
		String citacao = "";
		
		for(int i = 1;i <= 50;i++){
			double somaNota = 0;
			int notasDez = 0;
			
			System.out.println("informe nome");
			nome = s.next();
			for(int n = 1;n <= 4;n++){
				System.out.println("informe nota do " + n + "� bimestre");
				double nota = s.nextDouble();
				somaNota += nota;
				if(nota == 10){
					notasDez++;
				}
			}
			if((somaNota/4) >= 7 && (somaNota/4) <= 7.9){
				contaBom++;
				citacao = "honras pelo bom aproveitamento";
			}
			else
				if((somaNota/4) >= 8 && (somaNota/4) <= 8.9)
					citacao = "honras pelo �timo aproveitamento";
				else
					if((somaNota/4) >= 9 && (somaNota/4) <= 10 && notasDez >= 2){
						contaExemplar++;
						citacao = "aluno exemplar";
					}
					else
						citacao = "honras pelo excelente aproveitamento";				
			
			System.out.println("nome == " + nome + "\nmedia anual == " + (somaNota/4) + 
							   "\ncitacao == " + citacao + "\n");
		}
		System.out.println("horas pelo bom aproveitamento == " + contaBom + 
						   "\npercentual aluno exemplar == " + ((contaExemplar * 100)/50) + "%");	

	}

}
