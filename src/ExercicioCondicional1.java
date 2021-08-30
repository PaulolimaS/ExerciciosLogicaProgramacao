import java.util.Scanner;

public class ExercicioCondicional1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		if (X >= 0 ) {
			System.out.println("� positivo");
		}
		else {
			System.out.println("� negativo");
		}
		sc.close();
		
	}

}
