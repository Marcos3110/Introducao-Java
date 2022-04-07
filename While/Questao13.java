package while_lista1;

public class Questao13 {

	public static void main(String[] args) {
		double paisA = 5000000.0;
		double paisB = 7000000.0;
		int n = 0;
		
		while(paisA <= paisB){
			paisA += paisA * 0.03;
			paisB += paisB * 0.02;
			n++;
		}
		System.out.println(n + " anos");
	}

}
