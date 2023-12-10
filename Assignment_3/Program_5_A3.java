import java.util.Scanner;

public class Program_5_A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = sc.nextInt();

        
        boolean LeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                LeapYear = true;
                }
            } else {
            LeapYear = true;
            }
        }

        System.out.println(year + "is a leap year: " + LeapYear);
        sc.close();
    }
}