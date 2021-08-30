import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			if (A > B && A > C) {
				System.out.printf("%d eh o maior",A);
			}
			else {
				if(B > C && B > A) {
					System.out.printf("%d eh o maior",B);
				}
				else {
				 System.out.printf("%d eh o maior",C);
					
				}
			}
			sc.close();		
	}

}
