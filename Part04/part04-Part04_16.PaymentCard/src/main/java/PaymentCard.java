/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably() {
        balance = balance - 2.60;
        if (balance < 0) {
            balance = balance + 2.60;
        }
    }
    
    public void eatHeartily() {
        balance = balance - 4.60;
        if (balance < 0) {
            balance = balance + 4.60;
        }
    }
    
    public void addMoney (double money) {
        if (money > 0) {
          balance = balance + money;  
        }
        if (balance > 150) {
            balance = 150;
        }
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
}
