package Assignment_4;
/*Write a java program to enter two numbers through the keyboard. 
Write a program to find the value of one number raised to the power of another. 
(Do not use Java built-in method).*/

import java.util.Scanner;
public class Program_6_A4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base: ");
    int base = sc.nextInt();
        System.out.println("Enter the power: ");
    int power = sc.nextInt();
    double result = 1;

for (int i = 0; i < power; i++) {
    result *= base;
}

System.out.println(base + " to the power " + power + " is: " + (int)result);

    }
}