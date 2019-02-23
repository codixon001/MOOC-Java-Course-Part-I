// This program asks the user to enter a number, and the program tells the user
// if the number is a positive number or not a positive number.
// This is an introduction to "if-else" conditional statements.

import java.util.Scanner;
 
public class PositiveValue {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        // Type your program here:
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
 
        if (number > 0) {
            System.out.println("");
            System.out.println("The number is positive.");
        } else {
            System.out.println("");
            System.out.println("The number is not positive.");
        }
    }
}
