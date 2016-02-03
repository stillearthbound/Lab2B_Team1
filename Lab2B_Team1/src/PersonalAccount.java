/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suzanne
 */
public class PersonalAccount extends Account{
    private String FirstName;
    private String LastName;
    
    
    PersonalAccount(long AccountNumber, double SavingsBalance, double CheckingBalance, long CreditCardNumber,int pin, String FirstName, String LastName){
        super(AccountNumber, SavingsBalance, CheckingBalance, CreditCardNumber, pin);
        this.FirstName=FirstName;
        this.LastName=LastName;
        
        
    }
    
    public String getAccountNumber()
    {
        return this.FirstName + " " + this.LastName + "'s Account Number is " + super.getAccountNumber(); 
    }
   public String getSavingsBalance(){
   return super.getSavingsBalance();
   }
   public String getCheckingBalance() {
       return super.getCheckingBalance();
   }
    
}
