import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	
	if (A > B && A > C) {
		System.out.printf("%d � maior %n",A);
	}
	else {
		if(B > C && B > A) {
			System.out.printf("%d maior %n",B);
		}
		else {
		 System.out.printf("%d � maior %n",C);
			
		}
	}
	sc.close();	
	}

}
