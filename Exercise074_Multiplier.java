/**
 *
 * @author Curtis
 */
public class Multiplier {
    private int number;
    
    public Multiplier(int number) {
        this.number = number;
    }
    
    public int multiply(int otherNumber) {
        return this.number *= otherNumber;
    }
}

public class Main {
 
    public static void main(String[] args) {
        // This is an empty main method which you can use to test your class's functionality.
        Multiplier fiveMultiplier = new Multiplier(5);
        Multiplier twelveMultiplier = new Multiplier(12);
        
        System.out.println("fiveMultiplier.multiply(4): " + fiveMultiplier.multiply(4));
        System.out.println("twelveMultiplier.multiply(12): " + twelveMultiplier.multiply(12));
    }
}
