import java.util.ArrayList;
import java.util.Scanner;
 
public class RecurringWord {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
 
        while (true) {
            System.out.print("Type a word: ");
            String new_word = reader.nextLine();
 
            if (words.contains(new_word)) {
                System.out.println("You gave the word " + new_word + " twice");
                break;
            }
 
            words.add(new_word);
 
        }
    }
}
