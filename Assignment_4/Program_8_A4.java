/*Write a program that generates a random integer number between 1 to 10 and asks the user to guess what the number is. 
If the user's guess is higher than the random number, the program should display "Too high, try again."
 If the user's guess is lower than the random number, the program should display "Too low, try again."
The program should use a loop that repeats until the user correctly guesses the random number and display good guess.*/

import java.util.Scanner;

public class Program_8_A4{
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);

        int random = (int) (Math.random() * 10) + 1;
   

 while (true) {
        System.out.print("Guess the number between 1 and 10: ");
        int user = sc.nextInt();
 if (user == random) {
    System.out.println("Good guess! You got it right.");
    break;
} else if (user > random) {
    System.out.println("Too high, try again.");
} else {
    System.out.println("Too low, try again.");
        }   
    }
 }
}


