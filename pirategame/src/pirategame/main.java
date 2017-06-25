package pirategame;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;


public class main {
	
    public static void main(String[] args){
    	
    	JFrame frame = new JFrame ("Pirategame");
        frame.setVisible(true);
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
              
        board mainBoard = new board();
    	frame.getContentPane().add(mainBoard.mainPanel, BorderLayout.CENTER);
        
        
        

  
        
        
        
        
        
        
        
     /*   JButton button_test1 = new JButton("Test1");
        panel_test.add(button_test1);
        
        JButton button_test2 = new JButton("Test2");
        panel_test.add(button_test2);
       
        
        JButton button_test3 = new JButton("Test3");
        panel_test.add(button_test3);
       
        
        JButton button_test4 = new JButton("Test4");
        panel_test.add(button_test4);
       
        
        JButton button_test5 = new JButton("Test5");
        panel_test.add(button_test5);
       
        JButton button_test6 = new JButton("Test6");
        panel_test.add(button_test6);*/
       
        
 
     

        
        
        

    }
}
