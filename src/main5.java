import java.util.Locale;
import java.util.Scanner;

public class main5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1,y1;
		double x2 ,y2;
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		double total = (Math.pow ((x2-x1),2.0)) + (Math.pow((y2 - y1),2.0));
		double total2 = Math.sqrt(total);
		System.out.printf("%.4f%n",total2);
		
		sc.close();
		
		
		

	}

}
