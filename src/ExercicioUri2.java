import java.util.Scanner;

public class ExercicioUri2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(x / 365 + "ano(s)");
        x = (x % 365) / 30;
        System.out.println(x + "mes(es)");
        x = (x % 365) % 30;
        System.out.println(x + " dia(s)");

        sc.close();
    }
}
