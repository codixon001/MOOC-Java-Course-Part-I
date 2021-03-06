import java.util.Random;
 
public class Dice {
    private Random random = new Random();
    private int numberOfSides;
 
    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
        this.random = random; 
    }
 
    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        return this.random.nextInt(numberOfSides) + 1;
    }
}

public class Main {
 
    public static void main(String[] args) {
 
        Dice dice = new Dice(6);
 
        int i = 0;
        while (i < 10) {
            System.out.println(dice.roll());
            i++;
        }
    }
}
