package Assignment_6;
import java.util.*;
public class Program_6_1{
    
    public static int additionSimple(int x, int y){
         return x+y;
    }
    public static int subtractionSimple(int x, int y){
        return x-y;
    }
    public static int multiplicationSimple(int x, int y){
        return x*y;
    }
    public static double divisionSimple(int x, int y){
        if (x == 0) {
            System.out.println("Division by zero");
        }
        return (double) y / x;
    }
    public static int remainderSimple(int n, int m){
        return n%m;
    }
    public static double squareRootSimple(int n) {
        if (n < 0) {
           System.out.println("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(n);
    }

  
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();
        
        System.out.println("Addition: " + additionSimple(x, y));
        System.out.println("Subtraction: " + subtractionSimple(x, y));
        System.out.println("Multiplication: " + multiplicationSimple(x, y));
        System.out.println("Division: " + divisionSimple(x, y));
        System.out.println("Remainder: " + remainderSimple(x, y));
        
        System.out.print("Enter a number to find its square root: ");
        int num3 = scanner.nextInt();
        System.out.println("Square Root: " + squareRootSimple(num3));
        
        scanner.close();

    }

    

}