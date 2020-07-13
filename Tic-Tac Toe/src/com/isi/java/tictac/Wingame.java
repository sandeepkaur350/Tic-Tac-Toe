package com.isi.java.tictac;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import sun.tools.asm.Label;

public class Wingame  extends JFrame
{
	String labelstring ;
	private JLabel label;
	private JTextField text;
	int k =1  , s=2;
	
	private JPanel panel;
	
	
	
	 public Wingame(String s)
	
	{
		super("Wingame");
		
		this.labelstring=s;
		createcomponents();
		createpanels();
		addcomponentstopanel();
		
		
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	       setSize(500,500);
	       setLocationRelativeTo(null);
	       setVisible(true);		
	}


  

private void createcomponents()
   {
	   label=new JLabel("result of the game is ");
	   text=new JTextField();
	   
   }

   
   
   private void createpanels()
   {	   
	  panel=(JPanel)getContentPane();
		panel.setLayout(new GridLayout(3, 3, 4, 4));
		
		
		 panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 30, 30));
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		
	   
   }
   
   
   private void addcomponentstopanel()
   {
	//   panel.add(label);
       panel.add(text);
   

		//text.getText();
		text.setText(labelstring);
       
       
       
       text.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
		
		}
	});
       
       
   }
   
   
   
 // private void textimplementsactionListner() 
 // {
//	 text.setText("player 1 wins");
	// TODO Auto-generated method stub

//}
 

  
  

}
