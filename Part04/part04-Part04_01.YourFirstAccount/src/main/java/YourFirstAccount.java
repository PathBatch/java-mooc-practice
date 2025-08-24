
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account bankAccount = new Account("Account", 100.0);
        bankAccount.deposit(20.0);
        System.out.println(bankAccount);
    }
}
