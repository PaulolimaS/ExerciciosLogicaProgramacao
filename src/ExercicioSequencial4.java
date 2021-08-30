import java.util.Locale;
import java.util.Scanner;

public class ExercicioSequencial4 {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	int numeroF;
	double horas,valor,total;
	
	numeroF= sc.nextInt();
	valor = sc.nextDouble();
	horas = sc.nextDouble();
	total = valor * horas;
	
	System.out.println("Number = " + numeroF);
	System.out.printf("Salary = U$ %.2f%n" , total);
	
	sc.close();

	}

}
