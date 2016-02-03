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
   public double WithdrawMoney(double WithdrawAmount);
   int CheckPin(int PinNumber, long CCNumber);
   public double DepositMoney(double DepositAmount);
   public long accountNumberCheck(long CCNumber, long AccountNumber);
}
