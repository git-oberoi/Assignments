import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Input the year: ");

   int year = sc.nextInt();

   boolean LeapYr = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

   System.out.println(year + " is a leap year: " + LeapYr);

   sc.close();

    }
}
