
import java.util.Scanner;

public class Curso9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int senha = sc.nextInt();
        while (senha != 2002) {
           System.out.println ("acesso negado");
           senha = sc.nextInt();
        }
        System.out.println("acesso permitido");

        sc.close();
    }
}
