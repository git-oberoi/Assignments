package Assignment_4;

import java.util.Scanner;

public class Program_7_A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. for which you want to find the multiplication table: ");
		int n = sc.nextInt();
		int i = 1; 
		System.out.println("The multiplication table of "+ n+" is:");
		while(i<=10) {
			System.out.println(n+ "*"+ i+ "=" + (n*i));
			i++;
		}
		sc.close();

	}

}

    
