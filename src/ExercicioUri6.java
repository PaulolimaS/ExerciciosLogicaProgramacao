import java.util.Locale;
import java.util.Scanner;

public class ExercicioUri6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double C = sc.nextDouble();
        double B = sc.nextDouble();
        double A = sc.nextDouble();
        boolean R = A * A == (B * B) + (C * C) ;
        boolean O = A * A > (B * B ) + (C * C);
        boolean ACU = A * A < (B * B ) + (C * C);
        boolean E = A == B && B == C && C == A;
        boolean I = A == B || B == C || C == A;

        if(A >= (B + C) ) {
            System.out.println("nao forma triangulo");
        }
        else if (R  && E){
            System.out.println("triangulo retangulo");
            System.out.println("triangulo equilatero");
        }
        else if(R && I){
            System.out.println("triangulo retangulo");
            System.out.println("triangulo isosceles");
        }
        else if (R){
            System.out.println("triangulo retangulo");

        }
        else if (O  && E){
            System.out.println("triangulo obtusangulo ");
            System.out.println("triangulo equilatero");
        }
        else if(O && I){
            System.out.println("triangulo obtusangulo");
            System.out.println("triangulo isosceles");
        }
        else if (O){
            System.out.println("triangulo obtusangulo");
        }
        else if (ACU  && E){
            System.out.println("triangulo acutangulo ");
            System.out.println("triangulo equilatero");
        }
        else if(ACU && I){
            System.out.println("triangulo acutangulo");
            System.out.println("triangulo isosceles");
        }
        else if (ACU) {
            System.out.println("triangulo acutangulo");
        }

        sc.close();
    }
}
