package com.isi.java.tictac;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tictac extends JFrame
{
	
	
	private JLabel welcomeLabel;
 
	
	private JButton friendButton;
	private JButton aiButton;
	
	
	
	private JPanel contentpane;
     

	Tictac()	
	{
       super("TICTAC");
       
       
       createcomponents();
       createpanel();
       addcomponentstopanel();
       
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(500,500);
       setLocationRelativeTo(null);
       setVisible(true);
       
	}


	private void createcomponents()
	{
		welcomeLabel=new JLabel("WELCOME TO THE TIC TAC GAME");
		
    
       
       
       friendButton=new JButton(" PLAY WITH FRIEND ");
       aiButton=new JButton    (" PLAY WITH AI           ");
	}




	private void createpanel()
	{
	contentpane=(JPanel)getContentPane();
	 contentpane.setLayout(new GridLayout(2,1,10,10));
	 // contentpane.setLayout(new BoxLayout(aiButton,BoxLayout.X_AXIS));
	 
	 contentpane.setBorder(BorderFactory.createEmptyBorder(50, 50, 30, 30));
		contentpane.setLayout(new BoxLayout(contentpane, BoxLayout.Y_AXIS));

		
     //    movePanel=new JPanel();
	  //   movePanel.setLayout(new GridLayout(3, 3));
	     
		
	    
		
	}

	private  void addcomponentstopanel()
	{
		
		
		
		
		contentpane.add(welcomeLabel);
		contentpane.add(friendButton);
		contentpane.add(aiButton);
		
		
		
		
		
		
		friendButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Friend game=new Friend();
				Friend game=new Friend();
			}
		});
		
		
		
		aiButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Computer computer=new Computer();
				
			}
		});
		
	
		
 
	
	}


}
