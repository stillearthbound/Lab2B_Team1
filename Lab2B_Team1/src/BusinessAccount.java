/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class BusinessAccount extends Account {
    private String BusinessName;
    BusinessAccount(long AccountNumber, double SavingsBalance, double CheckingBalance, long CreditCard,int Pin, String BusinessName){
        super(AccountNumber,SavingsBalance, CheckingBalance,CreditCard,Pin);
        this.BusinessName = BusinessName;
    }
    
    public String getAccountNumber(){
        return this.BusinessName + "'s Account Number is " + super.getAccountNumber();
    }
    public String getAccountBalance(){
        return super.getBusinessAccountBalance();
    }
    
}
