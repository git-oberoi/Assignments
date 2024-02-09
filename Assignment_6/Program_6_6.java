package Assignment_6;
import java.util.Scanner;
public class Program_6_6 {
   

public class CharacterCounter {

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.print("Enter a character: ");
        char targetChar = sc.next().charAt(0);

        int occurrences = count(inputString, targetChar);
        System.out.println("Number of occurrences of '" + targetChar + "' in the string: " + occurrences);

        sc.close();
    }
}
}
