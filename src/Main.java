import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome;
		double salario,vendas,total;
		nome = sc.next();
		salario = sc.nextDouble();
		vendas =  sc.nextDouble();
		total =salario + (15.0 / 100.0 * vendas);
		
		System.out.printf("TOTAL = R$ %.2f%n",total);
		
		sc.close();
		
	}

}
