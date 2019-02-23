ublic class CashRegister {
 
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
 
    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }
 
    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double economicalPrice = 2.5;
        
        if (cashGiven >= economicalPrice) {
            this.cashInRegister += economicalPrice;
            this.economicalSold++;
            return cashGiven - economicalPrice;
        }
        return cashGiven;
    }
 
    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double gourmetPrice = 4;
        
        if (cashGiven >= gourmetPrice) {
            this.cashInRegister += gourmetPrice;
            this.gourmetSold++;
            return cashGiven - gourmetPrice;
        }
        return cashGiven;
    }
 
    public boolean payEconomical(LyyraCard card) {
        double economicalPrice = 2.5;
        
        boolean success = card.pay(economicalPrice);
        if (success) {
            this.economicalSold++;
            return success;
        }
        return success;
    }
    
    public boolean payGourmet(LyyraCard card) {
        double gourmetPrice = 4;
        
        boolean success = card.pay(gourmetPrice);
        if (success) {
            this.gourmetSold++;
            return success;
        }
        return success;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }
 
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}

public class LyyraCard {
 
    private double balance;
 
    public LyyraCard(double balance) {
        this.balance = balance;
    }
 
    public double balance() {
        return this.balance;
    }
 
    public void loadMoney(double amount) {
        this.balance += amount;
    }
 
    public boolean pay(double amount) {
       // method checks if the balance of the card is at least amount given as parameter
       // if not, methods returns false meaning that the card could not be used for the payment
       // if the balance is enough, the given amount is taken from the balance and true is returned
       if (this.balance >= amount) {
           this.balance -= amount;
           return true;
       }
       return false;
    }
}

public class Main {
 
    public static void main(String[] args) {
        // write test code here
        CashRegister unicafeExactum = new CashRegister();
        System.out.println(unicafeExactum);
        
        LyyraCard cardOfBob = new LyyraCard(2);
        System.out.println("Bob's card balance: " + cardOfBob.balance() + " euros");
        
        boolean succeeded = unicafeExactum.payGourmet(cardOfBob);
        System.out.println("Payment success: " + succeeded);
        
        unicafeExactum.loadMoneyToCard(cardOfBob, -1);
        
        succeeded = unicafeExactum.payGourmet(cardOfBob);
        System.out.println("Payment success: " + succeeded);
        
        System.out.println("Bob's card balance: " + cardOfBob.balance() + " euros");
        
        System.out.println(unicafeExactum);       
    }
}
