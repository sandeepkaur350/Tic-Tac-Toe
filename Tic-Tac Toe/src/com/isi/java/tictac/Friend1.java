package com.isi.java.tictac;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Friend1 extends JFrame implements ActionListener
{


	private JPanel movePanel;
	private JPanel scorePanel;


	private JButton[] buttonsArray=new JButton[9];


	public Friend1()
	{
       super(" PLAY AGAINST FRIEND  ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,700);
		setLocationRelativeTo(null);
		setVisible(true);

		CreateComponents();
		CreatePanel();
		AddComponentsToPanel();
	}


	private void CreateComponents()
	{

		for(int i=0;i<9;i++)
		{
			buttonsArray= new JButton[i];
		}

	}

	private void CreatePanel()
	{
		movePanel=(JPanel)getContentPane();
		movePanel.setLayout(new GridLayout(3, 3, 4, 4));
	}

	private void AddComponentsToPanel()
	{
		for(int i=0;i<9;i++)
		{
			movePanel.add(buttonsArray[i]);
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



}
