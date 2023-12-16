package Assignment_4;

import java.util.Scanner;

public class Program_2_A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int x=n;
		int sum = 0;
		
		while (n!=0) {
			int r=n%10;
			sum = sum +r;
			n = n/10;
		}
		if (sum % 9 == 0) {
			System.out.println("The number " + x + " is divisible by 9");
		}
		else {
			{System.out.println("The number " + x + " is not divisible by 9");
		}
		}
	}

}
