import java.util.Random;
 
public class PasswordRandomizer {
    private Random random = new Random();
    private int length;
 
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = random;
    }
 
    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String password = ""; // Empty string that will be populated by characters in the while loop below
        
        while (i < this.length) {
            int number = this.random.nextInt(26); // Choose a number between 0-25 (26 numbers)...
            char letter = "abcdefghijklmnopqrstuvwxyz".charAt(number); // ...because there are 26 letters in the alphabet
            password = password + letter; // add a letter to the string "password" one by one, from empty until the loop ends
            i++;
        }
        return password;
    }
}

public class Program {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(17);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}
