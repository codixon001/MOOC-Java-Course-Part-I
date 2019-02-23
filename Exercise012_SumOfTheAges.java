// This program is similar to Exercise 8's program. This time however, the coder is taught 
// how to get the program to ask for String user input.

import java.util.Scanner;
 
public class SumOfTheAges {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        // Implement your program here
        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        System.out.print("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        System.out.print("Type your name: ");
        String secondName = reader.nextLine();
        System.out.print("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());
        
        int sum_of_Ages = firstAge + secondAge;
        
        System.out.println("");
        System.out.println(firstName + " and " + secondName + " are " + sum_of_Ages + " years old in total.");
    }
}
