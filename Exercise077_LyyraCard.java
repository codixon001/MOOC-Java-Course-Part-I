/**
 *
 * @author Curtis
 */
public class LyyraCard {
 
    private double balance;
 
    // Constructor for LyyraCard
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
 
    // Establishing toString, which is known by Java's "System.out.println" by default
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
 
    // The following two methods manipulate the LyyraCard balance as written.
    // These two methods will do nothing if the LyyraCard balance is going to be less than zero.
    public void payEconomical() {
        if ((this.balance - 2.50) >= 0) {
            this.balance -= 2.50;
        }
    }
 
    public void payGourmet() {
        if ((this.balance - 4.00) >= 0) {
            this.balance -= 4.00;
        }
    }
 
    // The following method adds a specified amount to the LyyraCard balance.
    // However, the LyyraCard balance cannot be greater than 150.
    // As a result, this method has an "excessBalance" double variable. 
    // excessBalance will be subtracted from the LyyraCard balance to reduce this to 150.
    public void loadMoney(double amount) {
        double excessBalance = 0;
 
        if (amount >= 0) {
            this.balance += amount;
            if (this.balance > 150) {
                excessBalance = this.balance - 150;
                this.balance = this.balance - excessBalance;
            }
        }
    }
}

import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
 
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
 
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
 
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}
