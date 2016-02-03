/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capta
 */
public interface ATM {
   double WithdrawMoney(double WithdrawAmount);
   boolean CheckPin(int PinNumber, long CCNumber);
   public double DepositMoney(double DepositAmount);
   public boolean accountNumberCheck(long CCNumber, long AccountNumber);
}
