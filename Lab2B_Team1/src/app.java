
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
       
        

        System.out.println("Hello, Would you like to make a deposit or withdrawl?");

        System.out.println("Hello, would you like to make a deposit or withdrawl or you can view your balance.  Press W for Withdraw or D for deposit and B to check Balance.");
        
        input = userInput.nextLine();
        if (input.equalsIgnoreCase("W"))
        {
            System.out.println("Please enter an amount to withdraw:");
            input1 = userInput.nextInt();
          
            a1.withdrawCheckings(input1);
            System.out.println(a1.getCheckingBalance());
        }
        if (input.equalsIgnoreCase("D"))
        {
            System.out.println("Please enter an amount to deposit:");
            input1 = userInput.nextInt();
          
            a1.depositCheckings(input1);
             System.out.println(a1.getCheckingBalance());
        }
         if (input.equalsIgnoreCase("B"))
        {
            System.out.println(a1.getCheckingBalance());
            System.out.println(a1.getSavingsBalance());
        }
   
        
    }
    
}
