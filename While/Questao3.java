package while_lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int contA = 0;
		int contB = 0;
		int contC = 0;
		double valorTotalCompra =  0.0;
		double valorTotalVenda = 0.0;
		
		System.out.println("Informe nome da mercadoria ('x' para terminar).");
		String nome = s.next();

		while(!nome.equalsIgnoreCase("x")){
			System.out.println("Informe pre�o de compra.");
			double pCompra = s.nextDouble();

			System.out.println("Informe pre�o de venda.");
			double pVenda = s.nextDouble();

			valorTotalCompra += pCompra;
			valorTotalVenda += pVenda;
			
			double lucro = (pCompra * (pVenda-pCompra)) / pVenda; 
			if(lucro < 10.0)
				contA++;
			else 
				if(lucro >= 10.0 && lucro <= 20)
					contB++;
				else 
					if(lucro > 20.0)
						contC++;
			
			System.out.println("Informe nome da mercadoria ('x' para terminar).");
			nome = s.next();
		}
		System.out.println("Lucro < 10% == " + contA + 
						   "\nLucro >= 10% e Lucro <= 20% == " + contB + 
						   "\nLucro > 20% == " + contC + 
						   "\nValor total de compra == " + valorTotalCompra + 
						   "\nValor total de venda == " + valorTotalVenda + 
						   "\nValor total de lucro == " + 
						   new DecimalFormat("R$ ###,###,##0.00").format((valorTotalVenda - valorTotalCompra)));

	}
	

}
