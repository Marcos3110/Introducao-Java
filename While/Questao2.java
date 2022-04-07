					package while_lista1;

import java.text.*;

public class Questao2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("00.00");
		int far = 50;
		String tabela = "";
		while (far <= 150){
			double cel = ((double)5 / (double)9 ) *(far - 32);
			tabela += far + " Farheneit= " + df.format(cel) + " celcius" + "\n";
			far++;
		}
		System.out.println(tabela);
	}

}											
 