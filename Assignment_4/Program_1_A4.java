import java.util.Scanner;

public class Program_1_A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter first number: ");
		int a = sc.nextInt();	
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
	   
		int sum = 0;
	    int i= a;
		
	    while ( i<=b) {
			System.out.print(i+ " ");
			sum = sum+i;
			i=i+c;
		
		}
		System.out.println("\nThe sum of number displayed is " + sum);
        sc.close();
	}

}
