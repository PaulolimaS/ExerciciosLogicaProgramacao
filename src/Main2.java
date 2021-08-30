import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double total = ((nota1 * 2.0)+(nota2 * 3.0)+(nota3 * 5.0))/(2.0 + 5.0 + 3.0);
		
		System.out.printf("MEDIA = %.1f%n" , total);
		
		sc.close();

	}

}
