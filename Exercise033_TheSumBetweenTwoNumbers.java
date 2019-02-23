import java.util.Scanner;
 
 
public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Ask the user for the lower and upper bound numbers for lower+...+upper sum
        System.out.print("First: ");
        int lower = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int upper = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while (lower <= upper) {
            sum += lower; // Assignment operator -> sum immediately gets the value of lower on this while loop's first iteration
            lower++;
        }
        
        System.out.println("The sum is " + sum);
    }
}
