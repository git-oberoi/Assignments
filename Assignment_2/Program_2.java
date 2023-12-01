import java.util.Scanner;
public class Program_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the distance in km= ");
		double km = sc.nextDouble();
		
		double m = (km * 1000);
		double f = (km * 3280.8399);
		double i = (km *  39370.0787);
		double c = (km * 100000);
		
		System.out.println(km + " km is " +(int) m + " meters");
		System.out.println(km + " km is " + f + " feet");
		System.out.println(km + " km is " + i + " inch");
		System.out.println(km + " km is " + c + " centimeters");
		sc.close();
		
	

	}

}
