// This program asks for the user to enter in a year, and evaluates whether the entered year
// is a leap year or the entered year is not a leap year.
// Truth values and the modulo operator are used.

import java.util.Scanner;
 
public class LeapYear {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
 
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
