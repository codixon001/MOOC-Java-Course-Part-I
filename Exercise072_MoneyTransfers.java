public class Accounts {
 
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        // Creating all accounts...
        Account a_account = new Account("A", 100.0);
        Account b_account = new Account("B", 0.0);
        Account c_account = new Account("C", 0.0);
        
        // Making transfers...
        transfer(a_account, b_account, 50);
        transfer(b_account, c_account, 25);
        
        // Print all accounts after the transfers...
        System.out.println(a_account);
        System.out.println(b_account);
        System.out.println(c_account);
    }
    
    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
