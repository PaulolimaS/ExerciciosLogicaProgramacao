import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double valor = sc.nextDouble();
		
		if (valor >= 25.01 && valor <= 50) {
			System.out.println("Intervalo (25,50)");
		}
		else if(valor >= 0 && valor <= 25) {
			System.out.println("Intervalo (0,25)");
		}
		else if(valor >= 50.01 && valor <= 75 ) {
			System.out.println("Intervalo (50,75)");
		}
		else if(valor >= 75.01 && valor <= 100  ) {
			System.out.println("Intervalo (75,100)");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		sc.close();
	
	}

}
