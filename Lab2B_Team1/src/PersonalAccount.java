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
    
    
    PersonalAccount(long AccountNumber, String FirstName, String LastName){
        super(AccountNumber);
        this.FirstName=FirstName;
        this.LastName=LastName;
        
        
    }
    
}
