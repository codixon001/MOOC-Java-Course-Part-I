import java.util.ArrayList;
import java.util.Random;
 
public class LotteryNumbers {
 
    private ArrayList<Integer> numbers;
 
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }
 
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }
 
    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        int i = 0;
 
        while (i < 7) {
            int number = random.nextInt(39) + 1;
            if (!(containsNumber(number))) {
                this.numbers.add(number);
                i++;
            }
        }
    }
 
    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)){
            return true;
        } else {
            return false;
        }
    }
}

import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();
 
        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
