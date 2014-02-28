//Imports
package calloftraders;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import calloftraders.Game;


public class GUI extends JPanel implements ActionListener{
    //Declare any buttons and panels.
    JButton btnGame, btnDVD, btnSoftware, btnCalculateTotal;
    JPanel buttonPanel, contentPanel;
    
    
    //global variables
    String Name;
    int YearOfRelease;
    String Condition;
    String AgeRating;
    String Platform;
    
    int Total;
    int FinalTotal;
   
    
    
    GUI () {
     
        //create main content Panel
       contentPanel = new JPanel();
       contentPanel.setOpaque(true);
       contentPanel.setBackground(Color.white);
       
       //create button panel
       buttonPanel = new JPanel();
       buttonPanel.setOpaque(true);
       buttonPanel.setBackground(Color.white);
       
       
       
       
       //create Buttons to add to button panel
       btnGame= new JButton();
       //add action listener to each button
       btnGame.addActionListener(this);
       //set button size
       btnGame.setPreferredSize(new Dimension(200, 50));
       //set text for each button
       btnGame.setText("Game");
       //add buttons to gui
       buttonPanel.add(btnGame);
       //tooltip
       btnGame.setToolTipText("Do you have a game to sell?");
       
       //create Buttons to add to button panel
       btnDVD = new JButton();
       //add action listener to each button
       btnDVD.addActionListener(this);
       //set button size
       btnDVD.setPreferredSize(new Dimension(200, 50));
       //set text for each button
       btnDVD.setText("DVD");
       //add buttons to gui
       buttonPanel.add(btnDVD);
       //tooltip
       btnDVD.setToolTipText("Do you have a DVD to sell?");
       
       //create Buttons to add to button panel
       btnSoftware = new JButton();
       //add action listener to each button
       btnSoftware.addActionListener(this);
       //set button size
       btnSoftware.setPreferredSize(new Dimension(200, 50));
       //set text for each button
       btnSoftware.setText("Software");
       //add buttons to gui
       buttonPanel.add(btnSoftware);
       //tooltip
       btnSoftware.setToolTipText("Do you have a software to sell?");
       
       //create Buttons to add to button panel
       btnCalculateTotal = new JButton();
       //add action listener to each button
       btnCalculateTotal.addActionListener(this);
       //set button size
       btnCalculateTotal.setPreferredSize(new Dimension(200, 50));
       //set text for each button
       btnCalculateTotal.setText("Calculate Total");
       //add buttons to gui
       buttonPanel.add(btnCalculateTotal);
       //tooltip
       btnCalculateTotal.setToolTipText("Finished Shopping"); 
       
       
        
       contentPanel.add(buttonPanel);
       this.add(contentPanel);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnGame)){
          
          Game GameCost = new Game();
          Total = GameCost.GameValue();
          System.out.println(Total);
          FinalTotal = FinalTotal + Total; 
        }
        else if (e.getSource().equals(btnDVD)){
          DVD DVDCost = new DVD();
          Total = DVDCost.DVDValue();
          System.out.println(Total);
          FinalTotal = FinalTotal + Total; 
        }
        else if (e.getSource().equals(btnSoftware)){
          Software SoftwareCost = new Software();
          Total = SoftwareCost.SoftwareValue();
          System.out.println(Total);
          FinalTotal = FinalTotal + Total; 
        }
        else if(e.getSource().equals(btnCalculateTotal)){
           System.out.println(FinalTotal);
        }
    }
}
    
    
    
    
 
