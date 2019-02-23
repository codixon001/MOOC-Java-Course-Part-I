import java.util.Scanner;
 
public class LoopsEndingRemembering {
 
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
 
        Scanner reader = new Scanner(System.in);
 
        // Ask the user to input integers
        System.out.println("Type numbers: ");
        int number;
 
        int sum = 0;
        int count_of_Numbers = 0;
        int even_Numbers = 0;
        int odd_Numbers = 0;
 
        while (true) {
            number = Integer.parseInt(reader.nextLine());
 
            if (number != -1) {
                sum += number;
                count_of_Numbers++;
                
                if (number % 2 == 1) {
                    odd_Numbers++;
                } else {
                    even_Numbers++;
                }
            } else {
                break;
            }
 
        }
 
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count_of_Numbers);
 
        double average = (double) sum / count_of_Numbers;
        System.out.println("Average: " + average);
 
        System.out.println("Even numbers: " + even_Numbers);
        System.out.println("Odd numbers: " + odd_Numbers);
    }
}
