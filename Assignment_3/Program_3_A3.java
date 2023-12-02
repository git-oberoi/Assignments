import java.util.Scanner;

public class Program_3_A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers: "); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("First number: " + a);
        System.out.println("Second number: " +b);
        System.out.println("Third number: " + c);
        
    if (a<b && b<c) {
        System.out.println("Increasing");
        
    }
    else if (a>b && b>c) {
        System.out.println("Decreasing");
    }
    else{
        System.out.println("Neither Increasing nor decreasing");
    }
    sc.close();
    }
}
