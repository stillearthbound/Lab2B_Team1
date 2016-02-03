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
     public long AccountNumber;
     public double SavingsBalance; 
     public double CheckingBalance;
     public long CreditCardNumber;
     public int pin; 
     
     Account (long AccountNumber, double SavingsBalance, double CheckingBalance, long CreditCardNumber, int pin){
        this.AccountNumber=AccountNumber;
        this.SavingsBalance = SavingsBalance;
        this.CheckingBalance = CheckingBalance;
        this.CreditCardNumber = CreditCardNumber;
        this.pin= pin;
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
}
