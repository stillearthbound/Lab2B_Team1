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

public double convertBusinessEuroToDollars(double AccountBalance){
    this.BusinessAccountBalance = AccountBalance;
    AccountBalance = Currency.convertEuroToDollar(AccountBalance);
    return AccountBalance;
}

public double convertCheckingEuroToDollars(double AccountBalance){
    this.CheckingBalance = AccountBalance;
    AccountBalance = Currency.convertEuroToDollar(AccountBalance);
    return AccountBalance;
}

public double convertSavingEuroToDollars(double AccountBalance){
    this.SavingsBalance = AccountBalance;
    AccountBalance = Currency.convertEuroToDollar(AccountBalance);
    return AccountBalance;
}
}
