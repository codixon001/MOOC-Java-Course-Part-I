// This program is almost the same as Exercise 8's. 
// However, this exercise teaches the coder how an int variable value should be converted into a double value for correct division. 
// For example, computers see 5/2 = 2. 
// We know from math schooling and our calculators will correctly tell us 5/2 = 2.5, which is the result 
// we get from this program as "num1" is converted from...let's say 6...to 6.0. 6.0 is a proper double variable value.

import java.util.Scanner;
 
public class Divider {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        double quotient = (double)num1 / num2;
        
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
    }
}
