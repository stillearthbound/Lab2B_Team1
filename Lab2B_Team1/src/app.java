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
        
        a1.depositCheckings(100);
        System.out.println(a1.getAccountNumber());
        System.out.println(a1.getCheckingBalance()); 
        
        
        
        
    }
    
}
