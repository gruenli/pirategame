package pirategame;

import java.awt.*;
import javax.swing.*;

//Funktionniert!!! Zu Testzwecken auskommentiert!

//public class Board {
//	
//	JPanel mainPanel;
//	
//	//WIRD NOCH NICHT GENUTZT!!!
//	//private Field[][] mainArray = new Field[10][20];
//	
//	public Board (){
//		JPanel tempPanel = new JPanel(new GridLayout(10,20)); 
//
//		for (int i = 0; i<200; i++)
//		{tempPanel.add(new JButton("Test"+i));}
//		mainPanel = tempPanel;
//
//	}
//}	

public class Board {
	
	JPanel mainPanel;
	private Field[][] mainArray = new Field[10][20];
	
	public Board (){
		JPanel tempPanel = new JPanel(new GridLayout(10,20));
		
		
		for ( int row = 0; row < mainArray.length; row++ ){
			for ( int col = 0; col < mainArray[0].length; col++){
				Field f = new Field(this);
				
				//mainArray[row][col] =f;		//Was genau(Welcher Wert von f) wird hier genau im Array gespeichert??
				//System.out.println(f);		
				//System.out.println(mainArray[row][col]); // Array nicht gefüllt!!!! "null" an jeder Stelle!
				
				//Test um Namen der Buttons in der Console auszugeben.
				f.setName(row+ " , "+col);
				System.out.println(f.getName());
				//Wie schafft man es die Namen auf den Buttons auch anzeigen zu lassen?
				//f.setBackground(Color.darkGray);
				tempPanel.add(f);
			}
		}
		
		mainPanel = tempPanel;
	}
}	
