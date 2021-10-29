import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0 ; i <=n ; i++ ){
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();
            double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }
         sc.close();






    }
}
