/**
 *
 * @author Curtis
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter (int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }
    
    public String toString() {
        if (this.value < 10){
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int valueAtStart) {
        if (!(valueAtStart > this.upperLimit || valueAtStart < 0)) {
            this.value = valueAtStart;
        }
    }
}

import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());
        
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        int i = 0;
        while (i < 121){
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            i++;
        }
    }
}
