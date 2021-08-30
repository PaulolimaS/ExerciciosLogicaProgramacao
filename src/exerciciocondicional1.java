import java.util.Scanner;

public class exerciciocondicional1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		if (X >= 0 ) {
			System.out.println("é positivo");
		}
		else {
			System.out.println("é negativo");
		}
		sc.close();
		
	}

}
