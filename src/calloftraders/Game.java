/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calloftraders;

import java.util.Scanner;
import javax.swing.JOptionPane;
import calloftraders.GUI;
import javax.swing.ToolTipManager;


public class Game {
    
    String Name;
    int YearOfRelease;
    String Condition;
    String AgeRating;
    String Platform;
    int Total;
    
    int GameValue(){
        Name();
        YearOfRelease();
        Condition();
        AgeRating();
        Platform();
        Total();
        return Total;
    }
    void Name (){
          //Display a dialog box to allow the user to enter a number
        String NameText = JOptionPane.showInputDialog(null,"Insert Product Name");

        Scanner Scanner1=new Scanner(NameText);
        Name = Scanner1.nextLine();
    }
    
   void YearOfRelease (){        
        while (YearOfRelease < 1991){
           //Display a dialog box to allow the user to enter a number
        String YearOfReleaseText = JOptionPane.showInputDialog(null,"Please Enter year of release");
        
        Scanner Scanner2=new Scanner(YearOfReleaseText);
        YearOfRelease = Scanner2.nextInt();  
        }
    }
    
     void Condition (){
        int x = 0;
        System.out.println(x);
        while (x == 0){
             //Display a dialog box to allow the user to enter text
             String ConditionText = JOptionPane.showInputDialog(null,"Please Enter the condition");
            
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
    
    void AgeRating (){
         //Display a dialog box to allow the user to enter a number
        String AgeRatingText = JOptionPane.showInputDialog(null,"Please Enter the age rating");

        Scanner Scanner4=new Scanner(AgeRatingText);
        AgeRating = Scanner4.nextLine();
    }
    
    void Platform (){
       //Display a dialog box to allow the user to enter a number
        String PlatformText = JOptionPane.showInputDialog(null,"Please Enter the platform");
    
        Scanner Scanner5=new Scanner(PlatformText);
        Platform = Scanner5.nextLine();  
    }
    void Total(){
        
        if (YearOfRelease < 2009) {
            Total = 4;
            System.out.println(Total);
        }
        else if (YearOfRelease < 2012) {
            Total = 6;
            System.out.println(Total);
        }
        else if (YearOfRelease < 2015) {
           Total = 10;
           System.out.println(Total);
        }
      System.out.println(Total);
        if (Condition.equals("New")){
            Total = Total + 3;
            System.out.println(Total);
        }
        else if (Condition.equals("Worn")){
            Total = Total + 2;
            System.out.println(Total);
        }
        else if (Condition.equals("Damaged")){
            Total = Total - 2;
            System.out.println(Total);
        }
       
        
    }  
}
