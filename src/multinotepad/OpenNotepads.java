/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multinotepad;

import java.io.IOException;

/**
 * A program that opens 3 instances of Notepad in a designated folder
 * @author Blo
 */
public class OpenNotepads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ProcessBuilder pb = new ProcessBuilder("notepad.exe", "C:\\Users\\Blo\\Desktop\\java" ,"multiprocess1");
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
            System.out.println("Notepads launched");
        }catch(IOException e){
            System.out.println(e);
        }

    }

}
