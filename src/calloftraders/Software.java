/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calloftraders;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sam
 */
public class Software {
    
    String Name;
    int YearOfRelease;
    String Condition;
    String AgeRating;
    String Platform;
    int Total;
    
    int SoftwareValue(){
        Name();
        YearOfRelease();
        
        Condition();
        Platform();
        Total();
        return Total;
    }
    void Name (){
          //Display a dialog box to allow the user to enter a number
        String NameText = JOptionPane.showInputDialog(null,"Insert Product Name");
        //Store that number in numOne
        Scanner Scanner1=new Scanner(NameText);
        Name = Scanner1.nextLine();
    }
    
    void YearOfRelease (){        
        while (YearOfRelease < 1991){
           //Display a dialog box to allow the user to enter a number
        String YearOfReleaseText = JOptionPane.showInputDialog(null,"Please Enter year of release");
        //Store that number in numOne
        Scanner Scanner2=new Scanner(YearOfReleaseText);
        YearOfRelease = Scanner2.nextInt();  
        }
    }
    
    void Condition (){
        int x = 0;
        System.out.println(x);
        while (x == 0){
             //Display a dialog box to allow the user to enter a number
             String ConditionText = JOptionPane.showInputDialog(null,"Please Enter the condition");
             //Store that number in numOne
             Scanner Scanner3=new Scanner(ConditionText);
             Condition = Scanner3.nextLine();
             if (Condition.equals("New")){
                 System.out.println(x);
                 x = 1;
                 System.out.println(x);
             }
             else if(Condition.equals("Worn")){
                 System.out.println(x);
                 x = 1;
                 System.out.println(x);
             }
             else if (Condition.equals("Damaged")){
                 System.out.println(x);
                 x = 1;
                 System.out.println(x);
             }
        }      
    }
     
    void Platform (){
       //Display a dialog box to allow the user to enter a number
        String PlatformText = JOptionPane.showInputDialog(null,"Please Enter the platform");
        //Store that number in numOne
        Scanner Scanner5=new Scanner(PlatformText);
        Platform = Scanner5.nextLine();  
    }
    void Total(){
      
      if (YearOfRelease < 2009) {
            Total = 10;
            System.out.println(Total);
        }
        else if (YearOfRelease < 2012) {
            Total = 20;
            System.out.println(Total);
        }
        else if (YearOfRelease < 2015) {
           Total = 40;
           System.out.println(Total);
        }
      System.out.println(Total);
        if (Condition.equals("New")){
            Total = Total + 5;
            System.out.println(Total);
        }
        else if (Condition.equals("Worn")){
            Total = Total + 2;
            System.out.println(Total);
        }
        else if (Condition.equals("Damaged")){
            Total = Total / 2;
            System.out.println(Total);
        }           
    }  
}
