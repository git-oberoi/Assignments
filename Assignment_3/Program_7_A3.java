
import java.util.Scanner;

public class Program_7_A3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println(" Enter your monthly unit: ");
    double totalAmount= 0.0;
    double units = sc.nextDouble();

    if (units <= 50) {
        totalAmount = units * 3;
    } else if (units <= 200) {
        totalAmount = 50 * 3 + (units - 50) * 4.80;
    } else if (units <= 400) {
        totalAmount = 50 * 3 + 150 * 4.80 + (units - 200) * 5.80;
    } else {
        totalAmount = 50 * 3 + 150 * 4.80 + 200 * 5.80 + (units - 400) * 6.20;
    }

    System.out.println("No. of units consumed: " + (int) units) ;
    System.out.println("Do you want to pay online(y/n): ");
    char ans = sc.next().charAt(0);

if (ans == 'y') {
    System.out.println("Total Amount: " + totalAmount);
    double discount = totalAmount * 0.03;
    System.out.println("Discount: " + discount);
    System.out.println("Amount Payable: " + (totalAmount- discount));
    
}
else{
    System.out.println("TOtal Amount : "+ totalAmount);
}
    sc.close();
}    
}
