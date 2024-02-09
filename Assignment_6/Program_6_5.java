package Assignment_6;
import java.util.Scanner;

public class Program_6_5 {
    public class RegularPolygonArea {

        public static double area(int n, double side) {
            return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of sides");
            int n = sc.nextInt(); 
            System.out.println("Enter Length of each side");
            double side = sc.nextDouble(); 
    
            double polygonArea = area(n, side);
            System.out.println("Area of the regular polygon: " + polygonArea);
            sc.close();
        }
    }
    }
    

