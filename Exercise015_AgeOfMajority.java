// This program asks the user to enter a number. 
// It prints "You have not reached the age of majority yet!" if the user entered in a number less than 18.
// Otherwise, the program prints "You have reached the age of majority!", as the user obviously entered in a number
// greater than 18 or equal to 18.

import java.util.Scanner;
 
public class AgeOfMajority {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        // Type your program here
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
 
        System.out.println("");
        if (age < 18) {
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority!");
        }
    }
}
