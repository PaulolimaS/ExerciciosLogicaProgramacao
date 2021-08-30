import java.util.Scanner;

public class ExercicioCondicional5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		double quantidade = sc.nextInt();
		
		if (codigo == 1  ) {
			System.out.printf("Total: R$ %.2f%n",quantidade * 4,00);
		}
		else if(codigo==2){
			System.out.printf("Total: R$ %.2f%n",quantidade * 4,50);
		  	
		}
		else if(codigo == 3) {
			System.out.printf("Total: R$ %.2f%n",quantidade * 5,00);
			
		}
		else if(codigo==4) {
			System.out.printf("Total: R$ %.2f%n",quantidade * 2,00);
		}
		else if(codigo==5) {
			System.out.printf("Total: R$ %.2f%n",quantidade * 1,50);
		}
		else {
			System.out.println("codigo invalido");
		}
		sc.close();
		
		
		

	}

}
