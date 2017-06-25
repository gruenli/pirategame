package pirategame;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;



public class board {
	
	JPanel mainPanel;
	private field[][] mainArray = new field[20][10];
	
	public board (){
		JPanel nurEinTest = new JPanel(new GridLayout(20,10)); 
		mainPanel = nurEinTest;
		for (int i = 0; i<50; i++)
		{nurEinTest.add(new JButton("Test"+i));}
	//	InitComponents();
	}
	
	public void InitComponents()
	{
		mainPanel.removeAll();
		for ( int row = 0; row < mainArray.length; row++ )
		{
			for ( int col = 0; col < mainArray[0].length; col++)
			{
				mainArray[row][col] = new field(this);
				mainPanel.add(mainArray[row][col]);
			}
		}
		
	}

}
