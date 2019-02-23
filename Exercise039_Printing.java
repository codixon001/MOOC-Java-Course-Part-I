// The exercise introduces the creation of "argument containing methods" and calling these methods in the main body of a program.

public class Printing {
 
    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times       
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
 
    public static void printSquare(int sideSize) {
        // 39.2
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            i++;
        }
        System.out.println("");
    }
 
    public static void printRectangle(int width, int height) {
        // 39.3
        int i = 0;
        while (i < height) {
            printStars(width);
            i++;
        }
        System.out.println("");
    }
 
    public static void printTriangle(int size) {
        // 39.4
        int i = 0;
        while (i < size) {
            printStars(i + 1);
            i++;
        }
        System.out.println("");
    }
 
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
 
        printStars(5);
        printStars(3);
        printStars(9);
        printStars(15);
        printStars(8);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        printSquare(8);
        printSquare(5);
        printSquare(11);
        System.out.println("\n---");
        printRectangle(5, 6);
        printRectangle(17, 3);
        printRectangle(2, 8);
        printRectangle(9, 4);
        System.out.println("\n---");
        printTriangle(3);
        printTriangle(4);
        printTriangle(8);
        System.out.println("\n---");
    }
 
}
