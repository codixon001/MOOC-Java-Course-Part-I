// This program prompts the user to enter in two numbers, adds the two numbers and prints the sum. 
// Teaches the coder how to get the program to "ask" the user for numerical user input and how the 
// program parses the numerical user input and assigns it to a int variable (the syntax to ask for String input is taught later).

import java.util.Scanner;
 
public class Adder {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        int sum = num1 + num2;
        
        System.out.println("Sum of the numbers: " + sum);
    }
}
