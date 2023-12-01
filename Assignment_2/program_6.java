import java.util.Scanner;

public class program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double g = 32.174;
System.out.println("Enter the number of seconds: ");
        double t = sc.nextDouble();
       
        
        
        double d = (1.0/2.0) *g*t*t;
        System.out.println("Distance travelled: " + d);

        
    }
    
}
