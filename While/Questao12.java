package while_lista1;

public class Questao12 {

	public static void main(String[] args) {
		int n = 25;
		int soma = 0;
		
		while(n <= 200){
			if (n % 2 == 0)
				soma +=  n;
			n++;
		}
		System.out.println(soma);
	}

}
