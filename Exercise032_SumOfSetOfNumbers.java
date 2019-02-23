import java.util.Scanner;
 
public class TheSumOfSetOfNumbers {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        // Ask the user for n in the 1+2+3+...+n program
        System.out.print("Until what? ");
        int n = Integer.parseInt(reader.nextLine());
 
        // Establish the variables for the while loop that executes 1+2+...+n
        int i = 1; // i stands for "increment" -> how many times the while loop below will execute according to this variable
        int sum = 0; // "sum" will contain the 1+2+...+n result inside the while loop
 
        // The below while loop will run as long as i is less than or equal to the n the user entered at the beginning of the program.
        // Remember, the below while loop will calculate the 1+...+n set of numbers
        while (i <= n) {
            sum += i; // Assignment operator -> same as "sum = sum + i"
            i++; // Same as i = i + 1
        }
 
        System.out.println("Sum is " + sum);
    }
}
