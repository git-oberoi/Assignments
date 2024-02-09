package Assignment_6;
/* Write a method that returns the number of days in a year using the following header:
public static int numberOfDaysInAYear(int year)
Write a java program that displays the number of days in year from 2000 to 2020. */
public class Program_6_4 {
    
public class NumberOfDaysInYear {

    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366; 
        } else {
            return 365; 
        }
    }

    public static void main(String[] args) {
        System.out.println("Year\tNumber of Days");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "\t" + numberOfDaysInAYear(year));
        }
    }
}

}
