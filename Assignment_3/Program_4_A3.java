import java.util.Scanner;

public class Program_4_A3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

System.out.println(" Enter a number between 1 to 9: ");
    int user = sc.nextInt();

   double comp = (Math.random() * 9) + 1;
   
    System.out.println(" USer Number: " + user );
    System.out.println("Computer Number: " + (int)comp);

    if (user == (int)comp) {
        System.out.println(" You got it right");
    }
    else if (user + 1 == (int)comp || user - 1 == (int)comp) {
        System.out.println("Almost got it");
    }
    else{
        System.out.println("You got it wrong");
    }
    sc.close();
}    
}
