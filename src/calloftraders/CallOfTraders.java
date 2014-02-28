/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calloftraders;
import javax.swing.*;

/**
 *
 * @author m1203709
 */
public class CallOfTraders {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       JFrame application = new JFrame ("Calculator");
    
        GUI graphicalInterface = new GUI();  
        application.add(graphicalInterface);
        

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        application.setLocation(200,200);           
        application.pack();
        application.setVisible(true); 
        application.setResizable(false); 
    }
}
