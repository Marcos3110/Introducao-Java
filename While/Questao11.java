package while_lista1;

public class Questao11 {

	public static void main(String[] args) {
		int n = 1;
		
		while(n <= 500){
			if(n % 5 == 0 & n % 3 == 0){
				System.out.println(n + " ");
			}
			n++;
		}
	}

}
