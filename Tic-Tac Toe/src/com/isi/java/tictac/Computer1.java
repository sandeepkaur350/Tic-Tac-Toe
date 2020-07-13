package com.isi.java.tictac;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Computer1 extends JFrame

{

	int win,k=0, pos1,pos2 ;
	char player1='x';
	char player2='y';
	char  currentplayer=player1;
	int b[][]=new int[3][3];
	

	
	private JButton[][] button=new JButton[3][3];
	
	private JPanel computerPanel;
	
	
	public Computer1()
	{
		super(" PLAYING WITH COMPUTER ai  ");
		

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);
		

		setVisible(true);

		createcomponents();
		createpanels();
		addcomponentstopanel();   
				
	}
	
	private void createcomponents()
	{
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				button[i][j]=new JButton(" ");
				// button[i][j].addActionListener(new button11[i][j] ());
			}
			
		}
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			//	 button[i][j].addActionListener(new buttonr[1][2] () );
			}
			
		}
		
		
	}
	
	private void createpanels() 
	{

		computerPanel=(JPanel)getContentPane();
		computerPanel.setLayout(new GridLayout(3, 3, 4, 4));
	}
	
	private void addcomponentstopanel() 
	{
	

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		     computerPanel.add( button[i][j]  );
			}
		}
		
	}
	
	
	
	
	class buttonr11 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub



		}		

	}
	
	
}
