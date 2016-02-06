
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suzanne
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account a1 = new PersonalAccount(123456, 14.00, 15.00, 23454325, 1234, "Joe", "Shmoe");
        Account a2 = new BusinessAccount(123456, 15.00, 14.00, 1234535, 1245, "Something Inc.");
        Scanner userInput = new Scanner(System.in);
        String input = "";
        int input1 =0; 
        System.out.println("Enter Credit Card Number(23454325 for this)");
        long CCNumber= userInput.nextLong();
        System.out.println("Enter PIN(1234)");
       int pinNumber= userInput.nextInt();
       ATM CheckPin1 = new ATM (pinNumber, CCNumber, 1234, 23454325);
        while (CheckPin1.CheckPin(pinNumber, CCNumber, 1234, 23454325) == true){
        
        
        input = userInput.nextLine();
        if (input.equalsIgnoreCase("W"))
        {
            System.out.println("Please enter an amount to withdraw:");
            input1 = userInput.nextInt();
          
            a1.withdrawCheckings(input1);
            System.out.println(a1.getCheckingBalance());
            break;
        }
        if (input.equalsIgnoreCase("D"))
        {
            System.out.println("Please enter an amount to deposit:");
            input1 = userInput.nextInt();
          
            a1.depositCheckings(input1);
             System.out.println(a1.getCheckingBalance());
             break;
        }
         if (input.equalsIgnoreCase("B"))
        {
            System.out.println(a1.getCheckingBalance());
            System.out.println(a1.getSavingsBalance());
            break;
        }
      
        if (input.equalsIgnoreCase("1"))
        {
            System.out.println("Please enter an amount");
            input1 = userInput.nextInt();
          
            a1.depositSavings(input1);
            System.out.println(a1.getSavingsBalance());
            break;
        }
        if (input.equalsIgnoreCase("2"))
        {
            System.out.println("Please enter an amount");
            input1 = userInput.nextInt();
          
            a1.withdrawSavings(input1);
            System.out.println(a1.getSavingsBalance());
            break;
        }
        System.out.println("Hello, would you like to make a deposit or withdraw or you can view your balance.  Press W for Withdraw or D for Deposit and B to check Balance."+
                "To deposit or withdraw in Savings, please use 1 for Deposit, and 2 for Withdraw");
        
    }
      if(CheckPin1.CheckPin(pinNumber, CCNumber, 1234, 23454325) == false)
            System.out.println("Wrong Pin, CCnumber");
        
    }
    
}
