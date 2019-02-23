import java.util.Scanner;
 
public class WordInsideWord {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first word: ");
        String FirstWord = reader.nextLine();
        
        System.out.print("Type the second word: ");
        String SecondWord = reader.nextLine();
        
        int index = FirstWord.indexOf(SecondWord);
        
        if (index != -1) {
            System.out.println("The word " + "'" + SecondWord + "'" + " is found in the word " + "'" + FirstWord + "'.");
        } else {
            System.out.println("The word " + "'" + SecondWord + "'" + " is not found in the word " + "'" + FirstWord + "'.");
        }
    }
}
