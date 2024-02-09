package Assignment_6;
import java.util.Scanner;
public class Program_6_3 {
    public static int reverse(int number){
        int r =0;
        
        while (number != 0) {
            int digit = number % 10;
            r = r * 10 + digit;
            number /= 10;
            }
            return r;
    }
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        sc.close();
    }
}