// This program asks the user to enter two numbers. If the first number is less or equal to the second number,
// the program will print the first number, and all numbers up to the second number.
// If the user entered a second number that is less than the first number, the program prints nothing and ends.

import java.util.Scanner;
 
public class LowerLimitAndUpperLimit {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        // write your code here
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
 
        System.out.print("Second: ");
        int second = Integer.parseInt(reader.nextLine());
 
        if (first <= second) {
            while (first <= second) {
                System.out.println(first);
                first++;
            }
        } else {
            System.out.println("");
        }
    }
}
