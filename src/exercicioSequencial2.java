import java.util.Locale;
import java.util.Scanner;

public class exercicioSequencial2 {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	double raio , pi , area;
    
	raio = sc.nextDouble();
	pi = 3.14159;
    area = raio * raio * pi ;
    
    System.out.printf("A = %.4f%n", area);
    
    sc.close();
	}

}
