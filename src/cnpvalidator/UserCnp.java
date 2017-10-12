/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpvalidator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Blo
 */
public class UserCnp {
    //create a string in wich the cnp code will be put in for further verification
    private String cnp;
    //create a Scanner for user input
    Scanner input = new Scanner(System.in);
    
    //Asks user for input
    public void enterCnp() {
        System.out.println("Please enter a valid format CNP(MMDDYYYY) here: ");
        cnp = input.next();
        
    }

    //Checks the length of the CNP and verify if the user inserted only digits
    public void checkCnpLength() {
        //Create a pattern for digit check
        Pattern length = Pattern.compile("\\d{13}");
        Matcher matcher = length.matcher(cnp);
        
        if(cnp == null || cnp.length() !=13 || !matcher.find()){
            throw new IllegalArgumentException("ERROR! Your cnp must be exactly 13 Digits long");
        }
    }
    
    //Checks the first number to be valid
    public void checkGender(){
        //Create a local integer and assign the first number of the CNP to it
        int x = Character.getNumericValue(cnp.charAt(0));
        
        if(x != 1 && x != 2){
            throw new IllegalArgumentException("ERROR! Your cnp must start with 1 or 2");
        }
    }
    
    //Checks the MMDDYYYY pattern in the CNP code
    public void checkDate(){
        //Create a local string and assign the next two numbers to it
        String mm = "" + cnp.charAt(1) + cnp.charAt(2);
        //Parse the numbers to integer so we can use mathematical operations
        int x = Integer.parseInt(mm);
        //Checks for a valid month
        if(x < 1 || x > 12){
            throw new IllegalArgumentException("ERROR! Your cnp must contain a valid month");
        }
        
        //Create another local string(altough we could use the string above again) 
        //and assign the next two numbers to it
        String dd = "" + cnp.charAt(3) + cnp.charAt(4);
        //Parse the numbers to integer
        x = Integer.parseInt(dd);
        //Checks for a valid day of the month(THIS CODE SHOULD BE REVISED)
        if(x < 1 || x > 31){
            throw new IllegalArgumentException("ERROR! Your cnp must contain a valid day");
        }
        
        //Create a local string and assign the next four numbers to it
        String yyyy = cnp.substring(5, 9);
        //Parse the numbers to integer
        x = Integer.parseInt(yyyy);
        //Checks for a valid year
        if(x < 1900 || x > 2017){
            throw new IllegalArgumentException("ERROR! Your cnp must contain a valid year");
        }
    }
    //Display validation message
    public void showResult(){
        System.out.println("You have entered a valid CNP. Thank you!");
    }
}