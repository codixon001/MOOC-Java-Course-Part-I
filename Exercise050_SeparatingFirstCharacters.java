import java.util.Scanner;
 
public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        if (name.length() < 3) {
            System.out.println("");
        } else {
            char character1 = name.charAt(0);
            char character2 = name.charAt(1);
            char character3 = name.charAt(2);
            System.out.println("1. character: " + character1);
            System.out.println("2. character: " + character2);
            System.out.println("3. character: " + character3);
        }
    }
}
