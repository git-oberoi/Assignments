package Assignment_4;

import java.util.Scanner;

public class Program_3_A4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
     System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int sum = 0;
        int count = 0;

        do {
            int randomNum = (int) (Math.random() * N) + 1;
            System.out.print(randomNum + " ");
            sum += randomNum;
            count++;
        } while (count < N);

        double average = (double) sum / N;

        System.out.println("\nAverage of " + N + " random numbers is " +(int) average);
    }
}