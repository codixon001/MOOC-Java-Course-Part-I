import java.util.Random;
import java.util.Scanner;
 
public class GuessingNumberGame {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        int guesses_made = 0; // This is the counter for the number of guesses made in this game.
 
        // program your solution here. Do not touch the above lines!
        while (true) {
            
            System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
 
            if (guess < numberDrawn) {
                guesses_made++;
                System.out.println("The number is greater, guesses made: " + guesses_made);
            } else if (guess > numberDrawn) {
                guesses_made++;
                System.out.println("The number is lesser, guesses made: " + guesses_made);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }
        // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
