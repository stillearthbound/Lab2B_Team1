/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capta
 */
public class ATM {
   
   boolean CheckPin(int PinNumber, long CCNumber, int AccountPin, long AccountCC){
    if (PinNumber == AccountPin && CCNumber == AccountCC){
        return true;
    }
    else{
        return false;
    }
    
}

    
    public double WithdrawMoney(double WithdrawAmount, long AccountNumber, double AccountBalance){
       AccountBalance= AccountBalance - WithdrawAmount;
       return AccountBalance;
   }
   public double DepositMoney(double DepositAmount, long AccountNumber, double AccountBalance){
       AccountBalance= AccountBalance + DepositAmount;
       return AccountBalance;
    
}
   public double convertEuroToDollars(double Amount){
    Amount = Currency.convertEuroToDollar(Amount);
    return Amount;
}
   
}
