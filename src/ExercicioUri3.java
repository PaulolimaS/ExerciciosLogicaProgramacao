import java.util.Scanner;

public class ExercicioUri3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if (B <= C){
            System.out.println("Valores nao aceitos");
        }
        else if (D <= A){
            System.out.println("Valores nao aceito");
        }
        else if(C + D < A + B ){
            System.out.println("Valores nao aceitos");
        }
        else if(C <= 0 ){
            System.out.println("Valores nao aceitos");
        }
        else if(D <= 0 ) {
            System.out.println("Valores nao aceitos");
        }
        else if(A % 2 ==1) {
            System.out.println("Valores nao aceitos");
        }
        else {
            System.out.println("Valores aceitos");
        }
        sc.close();
    }
}
