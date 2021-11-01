import java.util.Locale;
import java.util.Scanner;

public class EstruturaDo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius : ");
            double C = sc.nextDouble();
            double resultado =  C * 9.0 / 5.0 + 32.0;
            System.out.printf("Equivalente em fahrenheit: %.1f%n", resultado);
            System.out.println("Deseja repetir (s/n):");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

    }
}
