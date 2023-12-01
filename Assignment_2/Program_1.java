import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a degree in fahrehiet : ");
		
		double fahren = sc.nextDouble();
		double celsius= (fahren - 32 )*(5.0/9);
		System.out.println( fahren + " Fahrenhiet is " +(float) celsius+ " Celsius");
		sc.close();
		

	}

}
