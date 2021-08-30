import java.util.Scanner;

public class main6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				
		double carro = 12;
		int tempo = sc.nextInt();
		int velocidade = sc.nextInt();
		double	total = tempo * velocidade / carro;
		
		System.out.printf("%.3f%n",total);
				
		sc.close();
		
		
	}

}
