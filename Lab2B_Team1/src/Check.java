/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Richa
 */

public class Check{
    private long receivingAccountNumber;
    private long sendingAccountNumber;
    private double checkAmount;
    private int numberOfChecks;

    Check(long receivingAccountNumber, long sendingAccountNumber, double checkAmount, int numberOfChecks)
    {
        this.receivingAccountNumber = receivingAccountNumber;
        this.sendingAccountNumber = sendingAccountNumber;
        this.checkAmount = checkAmount;
        this.numberOfChecks = numberOfChecks;
    }
    
    public long getReceivingAccountNumber() {
        return receivingAccountNumber;
    }


    public long getSendingAccountNumber() {
        return sendingAccountNumber;
    }

    public double getCheckAmount() {
        return checkAmount;
    }

    public int getNumberOfChecks() {
        return numberOfChecks;
    }
}
