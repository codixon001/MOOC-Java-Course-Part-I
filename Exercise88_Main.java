import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true) {
            System.out.print("Name: ");
            String name = reader.nextLine();
        
            if (name.equals("")){
                break;
            }
            System.out.print("Student Number: ");
            String studentNumber = reader.nextLine();
            list.add( new Student(name, studentNumber) );
        }
        // Print the Student list with a for loop that iterates through the entire list....
        System.out.println("");
        for( Student child : list ) {
            System.out.println(child);
        }
        
        // Search for a student or students with the entered partial string and print them...
        System.out.println("");
        System.out.print("Enter a search string: ");
        String searchString = reader.nextLine();
        
        System.out.println("Result: ");
        for( Student kid : list ){
            if(kid.getName().contains(searchString)){
                System.out.println(kid);
            }
        }
    }
}
