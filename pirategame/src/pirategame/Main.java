package pirategame;

import javax.swing.*;
import java.awt.*;


public class Main {
	
    public static void main(String args[]){
    	
    	JFrame mainFrame = new JFrame ("Pirategame");
        Board mainBoard = new Board();
        
        
        mainFrame.getContentPane().add(mainBoard.mainPanel, BorderLayout.CENTER);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Unsicher ob sowohl Repaint als auch Pack nötig sind, aber so klappt es!
        //Möglich dass auch ein Resize am Ende genügt!
        mainFrame.repaint();
        mainFrame.pack();
        mainFrame.setSize(1800, 900);
    }
}