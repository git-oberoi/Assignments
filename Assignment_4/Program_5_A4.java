
package Assignment_4;
import java.util.*;
public class Program_5_A4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int sum = 0;
        int n = sc.nextInt();

        for(int i =1; i<= n/2; i++)
        {
            if(n%i==0){
                sum+=i;
            }   

        }
if(sum == n){
    System.out.println(n+" is a perfect number.");
}
    else{
System.out.println(n+" is not perfect number.");
    }
}
    }
