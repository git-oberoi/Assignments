package Assignment_4;
<<<<<<< HEAD
import java.util.Scanner;
public class Program_6_A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int b = sc.nextInt();
        System.out.println("Enter the power: ");
        int p = sc.nextInt();
        int result =1;

        for (int i = 0; i < p; i++) {
            result *= b;
        }
        System.out.println(b + " to the power " + p + " is: " + result);

    }
}
=======
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
>>>>>>> ba5803e2ca3eb57b7d3329fa48d161e68a4c4143
