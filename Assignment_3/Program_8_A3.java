import java.util.Scanner;

public class Program_8_A3 {
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter (x,y) coordinates: ");
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x==0 && y==0) {
			System.out.println("(" +x + "," + y +"is at origin");
		}
		else if ( x== 0) {
			System.out.println("(" +x + "," + y +"is on Y-axis");
		}
		else if (y==0) {
			System.out.println("(" +x + "," + y +"is on X-axis");
		}
		else if (x>0 && y>0) {
			System.out.println("(" +x + "," + y +"is in Quadrant I");
		}
		else if (x<0 && y>0) {
			System.out.println("(" +x + "," + y +"is in Quadrant II");
	}
		else if (x<0 && y<0) {
			System.out.println("(" +x + "," + y +"is in Quadrant III");
		}
		else if (x>0 && y<0) {
			System.out.println("(" +x + "," + y +"is in Quadrant IV");
		}
		sc.close();
}
}