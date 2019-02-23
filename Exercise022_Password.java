// This program uses a "while (true)" loop that will ask the user to enter in a known password.
// The "while (true)" loop will not end and the program will keep asking the user for the known password
// until the user enters "carrot" as the known password.
// This exercise introduces the "while (true)" loop and "break" function to end the "while (true)" loop.

import java.util.Scanner;
 
public class Password {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
 
        // Write your code here
        while (true) {
            System.out.print("Type the password: ");
            String typed_Password = reader.nextLine();
 
            if (typed_Password.equals("carrot")) {
                System.out.println("Right!");
                System.out.println("");
                System.out.println("The secret is: beta carotene!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
