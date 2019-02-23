// This exercise introduces the AND truth value ("&&").
// This program asks for user input, and uses the AND and OR truth values in conjunction with each other
// to evaluate the entered Strings.

import java.util.Scanner;
 
public class Usernames {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        System.out.print("Type your username: ");
        String username = reader.nextLine();
        
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        
        if ((username.equals("alex") && password.equals("mightyducks")) || (username.equals("emily")) && (password.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
