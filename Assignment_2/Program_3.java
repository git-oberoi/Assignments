import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		double salary = sc.nextDouble();
		
		double da = (salary * 40 / 100);
		double hra = (salary * 20 / 100);
		double gross = (salary+da + hra);
		System.out.println("DA is "+ da);
		System.out.println("HRA is "+ hra);
		System.out.println("Gross salary is "+(int) gross);
		
		

	}

}