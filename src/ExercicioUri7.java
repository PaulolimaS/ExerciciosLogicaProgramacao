import java.util.Locale;
import java.util.Scanner;

public class ExercicioUri7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario >=0 && salario <= 400.00 ){
            double percentual = 15.0 /100.0;
            double total = salario + (percentual * salario);
            double reajuste = total - salario;
            System.out.printf("Novo salario: %.2f%n" , total);
            System.out.printf("Reajuste ganho: %.2f%n" , reajuste);
            System.out.println("Em percentual: 15%");
        }
        else if( salario >= 400.01 && salario <= 800.00) {
            double percentual1 = 12.0 /100.0;
            double total1 = salario + (percentual1 * salario);
            double reajuste1 = total1 - salario;
            System.out.printf("Novo salario: %.2f%n" , total1);
            System.out.printf("Reajuste ganho: %.2f%n" , reajuste1);
            System.out.println("Em percentual: 12%");

        }
        else if(salario >= 800.01 && salario <= 1200.00) {
            double percentual2 = 10.0 /100.0;
            double total2 = salario + (percentual2 * salario);
            double reajuste2 = total2 - salario;
            System.out.printf("Novo salario: %.2f%n" , total2);
            System.out.printf("Reajuste ganho: %.2f%n" , reajuste2);
            System.out.println("Em percentual: 10%");
        }
        else if(salario >= 1200.01 && salario <= 2000.00){
            double percentual3 = 7.0 /100.0;
            double total3 = salario + (percentual3 * salario);
            double reajuste3 = total3 - salario;
            System.out.printf("Novo salario: %.2f%n" , total3);
            System.out.printf("Reajuste ganho: %.2f%n" , reajuste3);
            System.out.println("Em percentual: 7%");
        }
        else {
            double percentual4 = 4.0 /100.0;
            double total4 = salario + (percentual4 * salario);
            double reajuste4 = total4 - salario;
            System.out.printf("Novo salario: %.2f%n" , total4);
            System.out.printf("Reajuste ganho: %.2f%n" , reajuste4);
            System.out.println("Em percentual: 15%");

        }

        sc.close();




    }
}
