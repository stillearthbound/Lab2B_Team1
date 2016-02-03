/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suzanne
 */
abstract public class Account {
     private long AccountNumber;
     private double SavingsBalance; 
     private double CheckingBalance;
     private long CreditCardNumber;
     private int pin;
     private long BusinessAccountNum;
     private double BusinessAccountBalance;
     
     Account (long AccountNumber, double SavingsBalance, double CheckingBalance, long CreditCardNumber, int pin){
        this.AccountNumber=AccountNumber;
        this.SavingsBalance = SavingsBalance;
        this.CheckingBalance = CheckingBalance;
        this.CreditCardNumber = CreditCardNumber;
        this.pin= pin;
     }
     
     Account (long AccountNumber, double AccountBalance, long CreditCard, int Pin){
         this.AccountNumber = AccountNumber;
         this.BusinessAccountBalance = AccountBalance;
         this.CreditCardNumber = CreditCard;
         this.pin = Pin;
     }
     public void depositCheckings(double depositAmount){
        this.CheckingBalance = this.CheckingBalance + depositAmount;
    }
     public void withdrawCheckings(double withdrawAmount){
        this.CheckingBalance = this.CheckingBalance - withdrawAmount;
    }
     public void depositSavings(double depositAmount){
        this.SavingsBalance = this.SavingsBalance + depositAmount;
    }
     public void withdrawSavings(double withdrawAmount){
        this.SavingsBalance = this.SavingsBalance - withdrawAmount;
    }
     
public String getAccountNumber()
{
    return ""+  this.AccountNumber;
}
public String getSavingsBalance() 
{    
    return "Savings Balance = " + this.SavingsBalance; 
}
public String getCheckingBalance()
{
        return "Checking Balance =" + this.CheckingBalance;                         
}

public String getBusinessAccountBalance(){
    return "Account Balance = " + this.BusinessAccountBalance;
}
}
