import java.util.Scanner;

public class curso3 {

	public static void main(String[] args) {
		// para ler um texto até a quebra de linha //
		// digitar e só pular pra proxima quando der enter//
		
		Scanner sc = new Scanner(System.in);
		
		String s1,s2,s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		sc.close();
		

	}

}
