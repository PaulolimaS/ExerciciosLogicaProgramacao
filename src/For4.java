import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++ ){
            int A =sc.nextInt();
            int B =sc.nextInt();

            if (B == 0 ){
                System.out.println("divisão impossivel");
            }
            else{
                double div = (double) A /B;
                System.out.printf("%.1f%n",div);
            }

            sc.close();
        }

    }
}
