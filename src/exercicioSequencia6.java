import java.util.Locale;
import java.util.Scanner;

public class exercicioSequencia6 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo,pi;
	A = sc.nextDouble();
	B = sc.nextDouble();
	C = sc.nextDouble();
	pi = 3.14159;
	triangulo = A * C / 2;
	circulo = C * C * pi;
	trapezio = (A + B) * C / 2;
	quadrado = B * B;
	retangulo = A * B ;
	System.out.printf("Triangulo: %.3f%n",triangulo);
	System.out.printf("Circulo: %.3f%n",circulo);
	System.out.printf("Trapezio: %.3f%n",trapezio);
	System.out.printf("Quadrado: %.3f%n",quadrado);
	System.out.printf("Retangulo: %.3f%n",retangulo);
	
	sc.close();	

	}

}
