import java.util.Scanner;
 
public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("In reverse order: ");
        int i = 0;
        
        while (i < name.length()) {
            char character = name.charAt((name.length() - 1) - i);
            System.out.print(character);
            i++;
        }
        System.out.println("");
    }
}
