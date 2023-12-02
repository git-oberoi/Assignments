import java.util.Scanner;

public class Program_6_A3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println(" Enter your monthly unit: ");

    double unit = sc.nextDouble();

    if (unit <= 50) {
        System.out.println(" Your bill is: " + unit * 3);
    }
    else if (unit > 50 || unit <= 200) {
        System.out.println(" Your bill is: " + unit * 4.80);
    }
    else if (unit > 200 || unit <= 400) {
        System.out.println(" Your bill is: " + unit * 5.80);
    }
    else if (unit > 400) {
        System.out.println(" Your bill is: " + unit * 6.20);
    }
    else {
        System.out.println("Enter correct unit");
    }
    sc.close();
}    
}
