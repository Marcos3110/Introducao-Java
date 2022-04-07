package vetores;

import java.util.Scanner;

public class Questao9 {
    public static void main (String[] Args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        String[] unidades = {"", "um", "dois", "tr�s", "quatro", "cinco", "seis", 
        		             "sete", "oito", "nove"};
        
        String[] dezenas = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", 
        		            "sessenta", "setenta", "oitenta", "noventa"};
        
        String[] centenas = {"cem", "cento", "duzentos", "trezentos", "quatrocentos"
        		            , "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
        
        String[] aux = {"", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", 
	             "dezessete", "dezoito", "dezenove"};
        
        
        
      //Numero original: 25345  
      //Numero desmembrado : 2 5 3 4 5
        
        while (true) {
			System.out.println("-------------------------------------");
			System.out.println("Informe um n�mero com no m�ximo cinco algarismos");
			String num = s.next(); //25345

			while (num.length() < 5)
				num = "0" + num;
			
			String extenso = " ";
			int valor = 0;

			// Tratar a dezena de milhar
			//num = 25345 (vou destacar o '25')
			valor = Integer.parseInt(num.substring(0, 2));
			if (valor > 0) {
				if (valor <= 9)
					extenso += unidades[valor] + " ";
				else if (valor >= 11 && valor <= 19)
					extenso += aux[Integer.parseInt(num.substring(1, 2))] + " ";
				else {
					extenso += dezenas[Integer.parseInt(num.substring(0, 1))] + " ";
					if (valor % 10 != 0)
						extenso = extenso + " e " + unidades[Integer.parseInt(num.substring(1, 2))] + " ";
				}
			}

			if (extenso != " ")
				extenso += "mil ";

			// Tratar a centena
			//num = 25345 (vou destacar o '3')
			valor = Integer.parseInt(num.substring(2, 3));
			if (valor == 1 && num.charAt(3) == '0' && num.charAt(4) == '0')
				extenso += "e cem";
			else if (valor > 0)
				extenso += " e " + centenas[Integer.parseInt(num.substring(2, 3))] + " ";

			// Tratar a dezena
			//num = 25345 (vou destacar o '45')
			valor = Integer.parseInt(num.substring(3, num.length()));
			if (valor > 0) {
				if (valor <= 9)
					extenso = extenso + " e " + unidades[valor] + " ";
				else if (valor >= 11 && valor <= 19)
					extenso += aux[Integer.parseInt(num.substring(4, num.length()))] + " ";
				else {
					//num = 25345 (vou destacar o '4')
					extenso += " e " + dezenas[Integer.parseInt(num.substring(3, 4))] + " ";
					//num = 25345 (vou destacar o '5')
					if (valor % 10 != 0)
						extenso = extenso + " e " + unidades[Integer.parseInt(num.substring(4, num.length()))] + " ";
				}
			}

	        if (extenso.trim().startsWith("e")  )
	        	extenso = extenso.substring(3, extenso.length());

	        	System.out.println(extenso);
        }
        

        
        
        
        /*     
        if (num.charAt(0) != '0'){
            if (num.charAt(0) == '1' && num.charAt(1) != '0')
            	extenso += aux[Integer.parseInt(num.substring(1,2))] + " ";
            else
            	extenso += dezenas[Integer.parseInt(num.substring(3,4))] + " ";
        }
        else{
            if (num.charAt(1) != '0')
        	extenso += unidades[Integer.parseInt(num.substring(1,2))] + " ";
        }
        
        if (extenso != " ")
        	extenso += "mil ";
        
        if (num.charAt(2) != '0')
        	extenso += "e " + centenas[Integer.parseInt(num.substring(2,3))] + " ";
        
        if (num.charAt(3) != '0'){
            if (num.charAt(3) == '1' && num.charAt(4) != '0'){
            	extenso += "e " + aux[Integer.parseInt(num.substring(4,5))] + " ";
            }
            else{ 
            	extenso += "e " + dezenas[Integer.parseInt(num.substring(3,4))] + " ";
                if (num.charAt(4) != '0')
                	extenso += "e " + unidades[Integer.parseInt(num.substring(4,num.length()))] + " ";
            }
            
        }
        
        if (num.charAt(3) == '0' && num.charAt(4) != '0')
           	extenso += "e " + unidades[Integer.parseInt(num.substring(4,num.length()))] + " ";

        
        if (extenso.startsWith(" e")  )
        	extenso = extenso.substring(3, extenso.length());*/
        
        
    }

}
