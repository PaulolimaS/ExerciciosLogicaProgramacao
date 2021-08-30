import java.util.Locale;
import java.util.Scanner;

public class exercicioSequencial5 {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	double valor1,valor2,total,codigo1, codigo2,quantidade1,quantidade2;
	
	codigo1 = sc.nextDouble();
	quantidade1 = sc.nextDouble();
	valor1 = sc.nextDouble();
	codigo2 = sc.nextDouble();
	quantidade2 = sc.nextDouble();
	valor2 = sc.nextDouble();
	total = (quantidade1 * valor1) + (quantidade2 * valor2);
	
	System.out.printf("VALOR A PAGAR : R$ %.2f%n",total);
	
	sc.close();

	}

}
