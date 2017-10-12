/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpvalidator;

/**
 * A simple program that verifies if a CNP is valid
 * It has flaws
 * 
 * @author Blo
 */
public class CnpMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creates an instance of UserCnp class
        UserCnp user = new UserCnp();
        
        //Starts program
        user.enterCnp();
        user.checkCnpLength();
        user.checkGender();
        user.checkDate();
        user.showResult();
        
    }
    
}