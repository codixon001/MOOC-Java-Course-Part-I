// More user input and conditional statement practice...
// This program asks the user to enter a number, and prints one of two possible concatenated statements
// depending on the number being an even number or an odd number.
// This program introduces the modulo operator (%) as an easy way to do this exercise.
// For example, 2%2 == 0 -> 2 is an even number; 1%2 == 1 -> 1 is an odd number.

import java.util.Scanner;
 
public class EvenOrOdd {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        // Type your program here
        // NOTE:
        // Parity of a value can be easily checked with modulo-operator %.
        // Test the following:
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int value = 8
        // System.out.println( value%2 );
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
 
        System.out.println("");
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}
