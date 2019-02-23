// This exercise introduces the truth value OR ("||") to the coder.
// This program asks for the user's age, and checks to see if the age entered "makes sense"... 

import java.util.Scanner;
 
public class AgeCheck {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
 
        if (age < 0 || age > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
