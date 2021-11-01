import java.util.Locale;
import java.util.Scanner;

public class ExercicioUri5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if (C + B > A){
            double P = A + B + C;
            System.out.printf("Perimetro = %.1f%n",P);
        }
        else {
            double area = (A + B ) * C / 2;
            System.out.printf("Area = %.1f%n",area);
        }

        sc.close();

    }
}
