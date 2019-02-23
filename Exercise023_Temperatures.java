// This program prints a temperature line graph with the use of the Graph class.
// The user can enter in as many data points as he/she wants to create the temperature line graph.
// However, the user must enter a value that is between -30 and 40 degrees.

// This program must be ended by a "Stop Execution" function within whichever IDE or code executor is used to run this program.

import java.util.Scanner;
 
public class Temperatures {
 
    public static void main(String[] args) {
 
        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true) {
            System.out.print("Enter a temperature: ");
            double temp = Double.parseDouble(reader.nextLine());
            
            if(temp < -30 || temp > 40) {
                System.out.println("Please enter a temperature between -30 and 40 degrees.");
            } else {
                Graph.addNumber(temp);
            }
        }
        // Graph is used as follows:
        //Graph.addNumber(7);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
