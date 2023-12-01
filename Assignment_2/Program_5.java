import java.util.Scanner;

public class Program_5 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the hemisphere: ");
        double r = sc.nextDouble();
        double sa = 3 * Math.PI * r * r;
        double va = 2.0/3 * Math.PI * r * r * r;

        System.out.println("The surface area of the hemisphere is " + (float)sa);
        System.out.println("The volume area of the hemisphere is " + (float)va);
        sc.close();


        
    }
}
