import java.util.Scanner;

public class ExercicioUri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println(x);

        System.out.println(x / 100 + " nota(s) de R$ 100,00");
        x = x % 100;
        System.out.println(x / 50 + " nota(s) de R$ 50,00");
        int nota20 = x % 50 / 20;
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        int nota10 = x % 100 % 50 % 20 / 10 ;
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        int nota5 = x % 100 % 50 % 20 % 10 / 5 ;
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        int nota2 = x % 100 % 50 % 20 % 10 % 5 / 2;
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        int nota1 = x % 100 % 50 % 20 % 10 % 5 % 2 / 1;
        System.out.println(nota1 + " nota(s) de R$ 1,00");

    sc.close();
    }
}
