package Assignment_6;
import java.util.Scanner;

public class Program_6_8 {
    public static String revString(String str){
        String rev ="";
        for(int i =str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i); 
    
        }
        return rev;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str;
    System.out.println("Enter the word: ");
    str = sc.nextLine();
  
    System.out.println(revString(str));
    sc.close();
}
 
 
}
