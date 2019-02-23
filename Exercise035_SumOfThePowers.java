import java.util.Scanner;
 
public class SumOfThePowers {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int i = 0;
        int sum_of_Powers = 0;
        
        while (i <= number) {
            int result = (int)Math.pow(2, i);
            sum_of_Powers += result;
            i++;
        }
 
        System.out.println("The result is " + sum_of_Powers);
    }
}
