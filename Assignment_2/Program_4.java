import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number between 0 and 1000 : ");
	 int num = sc.nextInt();
	 int sum = 0;
	 int digit = num % 10;
			 sum += digit;
			 num /= 10;
			 digit = num % 10;
			 sum += digit;
			 num /= 10;
			 digit = num % 10;
			 sum += digit;
			 num /= 10;
	
	
	 System.out.println("The sum of digit is "+ sum);
	 sc.close();
	 
	 
	 
	}

}
