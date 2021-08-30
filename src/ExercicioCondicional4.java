import java.util.Scanner;

public class ExercicioCondicional4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int hora =sc.nextInt();
		int hora2 = sc.nextInt();
		
		int total;
		
		if(hora <hora2) {
			total = hora - hora2;
		}
		else {
			total = 24 - hora + hora2;
		}
		
		System.out.println("O jogo durou " + total + " Horas" );
		
		sc.close();
		
		
		

	}

}
