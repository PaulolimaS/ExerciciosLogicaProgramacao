import java.util.Locale;
import java.util.Scanner;

public class ExercicioUri4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();
        double media = ((nota1 * 2.0)+(nota2 * 3.0)+(nota3 * 4.0)+(nota4 * 1.0))/(2.0 + 3.0 + 4.0 + 1.0);

        if (media >= 7.0){
            System.out.printf("media: %.2f%n" , media);
            System.out.println("Aluno Aprovado");
        }
        else if(media >= 5.0 && media <= 6.9){
            double exame = sc.nextDouble();
            double total = (exame + media)/2;
            if(total >= 5.0){
                System.out.printf("Media: %.2f%n",media);
                System.out.println("Aluno em exame");
                System.out.printf("Nota do exame: %.2f%n",exame);
                System.out.println("Aluno Aprovado");
                System.out.printf("Media final: %.2f%n", total);
            }
            else if(total <= 5.0){
                System.out.printf("Media: %.2f%n",media);
                System.out.println("Aluno em exame");
                System.out.printf("Nota do exame: %.2f%n",exame);
                System.out.println("Aluno Reprovado");
                System.out.printf("Media final: %.2f%n", total);
            }
        }

        else{
            System.out.printf("media: %.2f%n",media);
            System.out.println("Aluno Reprovado");
        }
        sc.close();
    }
}
