/**
 *
 * @author Curtis
 */
public class Counter {
 
    private int startingValue;
    private boolean check;
 
    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }
 
    public Counter(int startingValue) {
        this(startingValue, false);
    }
 
    public Counter(boolean check) {
        this(0, check);
    }
 
    public Counter() {
        this(0, false);
    }
 
    public int value() {
        return this.startingValue;
    }
 
    public void increase() {
        this.startingValue++;
    }
 
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.startingValue = this.startingValue + increaseAmount;
        }
    }
 
    public void decrease() {
        if (this.check == true) {
            if (this.startingValue > 0) {
                this.startingValue--;
            }
        } else {
            this.startingValue--;
        }
    }
 
    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (this.check == true) {
                if (this.startingValue - decreaseAmount > 0) {
                    this.startingValue = this.startingValue - decreaseAmount;
                } else {
                    this.startingValue = 0;
                }
            } else {
                this.startingValue = this.startingValue - decreaseAmount;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter test = new Counter(2, true);
        
        test.decrease(4);
        System.out.println(test.value());
    }
}
