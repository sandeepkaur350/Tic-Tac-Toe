package com.isi.java.tictac;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import com.sun.java.util.jar.pack.Instruction.Switch;

// import com.isi.java.airplane.model.InvalidActionException;

public class Friend extends JFrame implements ActionListener	
{


	ImageIcon x;
	ImageIcon o;
	//boolean win;
	int win,k=0;
	char player1='x';
	char player2='y';
	char  currentplayer=player1;
	int   count =0;

	char   b[][]=new char [4][4];
	int flag; 


	private JPanel movePanel;
	private JPanel fieldpanel;
	private JPanel scorePanel;
	private JPanel movefieldpanel;



	private JButton[][] buttonsArray=new JButton[3][3];

	private JButton buttonr11;
	private JButton buttonr12;
	private JButton buttonr13;
	private JButton buttonr21;
	private JButton buttonr22;
	private JButton buttonr23;
	private JButton buttonr31;
	private JButton buttonr32;
	private JButton buttonr33;
	private JButton button;


	private JButton scoreButton11;
	private JButton scoreButton12;
	private JButton scoreButton21;
	private JButton scoreButton22;

	private JTextField textField;

	public Friend() 
	{

		super("PLAYING WITH FRIEND");
		//	Wingame wingame=new Wingame();


		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,700);
		setLocationRelativeTo(null);
		setVisible(true);





		createcomponents();
		createpanels();
		addcomponentstopanel();

		//	addListeners();





		//	Buttons();
		//    displayimage();
	}


	private void createcomponents()
	{
		// 	buttonsArray =   for loop make j buutttons

		/*	for(int j=1;j<3;j++)
		{
			for(int i=1;i<9;i++)
			{
				buttonsArray[j][i] ;
			}
		}
		 */

		buttonr11=new JButton("");
		buttonr12=new JButton("");
		buttonr13=new JButton("");
		buttonr21=new JButton("");
		buttonr22=new JButton("");
		buttonr23=new JButton("");
		buttonr31=new JButton("");
		buttonr32=new JButton("");
		buttonr33=new JButton("");

		textField=new JTextField();


		scoreButton11=new JButton();
		scoreButton12=new JButton();
		scoreButton21=new JButton();
		scoreButton22=new JButton();



		buttonr11.addActionListener( new b11() );
		buttonr12.addActionListener( new b12() );
		buttonr13.addActionListener( new b13() );
		buttonr21.addActionListener( new b21() );
		buttonr22.addActionListener( new b22() );
		buttonr23.addActionListener( new b23() );
		buttonr31.addActionListener( new b31() );
		buttonr32.addActionListener( new b32() );
		buttonr33.addActionListener( new b33() );






		//	button.addActionListener(new b() );

		// Wingame wingame=new Wingame();	
	}

	private void createpanels()
	{
		movePanel=(JPanel)getContentPane();
		movePanel.setLayout(new GridLayout(3, 3, 4, 4));

		//	movePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		//	movePanel.setLayout(new BoxLayout(movePanel, BoxLayout.X_AXIS));



		fieldpanel=new JPanel();
		//	movePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		//	fieldpanel.setLayout(new BoxLayout(m BoxLayout.Y_AXIS));
		//	fieldpanel.setLayout(new GridLayout(1, 1, 4, 4));


		//	movefieldpanel=new JPanel();
		//	movePanel.setLayout(new GridLayout(4, 1));




		scorePanel=new JPanel();
		//	scorePanel.setLayout(new GridLayout(2, 2, 2, 2));

	}


	private void addcomponentstopanel()
	{

		//	buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));
		movePanel.add(buttonr11);



		//	buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));
		movePanel.add(buttonr12);

		movePanel.add(buttonr13);
		movePanel.add(buttonr21);
		movePanel.add(buttonr22);
		movePanel.add(buttonr23);
		movePanel.add(buttonr31);
		movePanel.add(buttonr32);
		movePanel.add(buttonr33);

		//     fieldpanel.add(textField);
		//   movefieldpanel.add(movePanel);
		//  movefieldpanel.add(fieldpanel);


		scorePanel.add(scoreButton11);
		scorePanel.add(scoreButton12);
		scorePanel.add(scoreButton21);
		scorePanel.add(scoreButton22);

		//	addListeners();
		//	addListeners2();



	}




	class b11 implements ActionListener
	{

		/*
		public void actionperformed(ActionEvent e)
		{
	//		if(currentplayer==player1)
	//		{
	//			buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
	//			b[1][1]=1;
		//		b11.SetEnabled(false );
	//		}
		}
		 */
		@Override


	
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

if( b[1][1]==0 )
{
	
			if(currentplayer==player1)
			{
				buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				count++;
				b[1][1]=1;
				//		b[1][2]=0;
				currentplayer=player2;


				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if (k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}

				else if(k==3) 
				{
					Wingame wingame=new Wingame("draw");
				}



				//		b11.SetEnabled(false );
			}

			else {



				buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
				b[1][1]=2;
				count++;
				currentplayer=player1;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}

				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}

			}


		}	
		
	}

	}


	class b12 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		
		
		
		
		{
			
			if(b[1][2]==0)
			{
				
			
			
			if(currentplayer==player1)
			{
				buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[1][2]=1;
				count++;
				currentplayer=player2;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2) 
				{
					Wingame wingame=new Wingame("player 2 wins");
				}

				else if(k==3)
				{
					Wingame wingame=new Wingame("");
				}
			}

			else 
			{
				buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
				b[1][2]=2;
				count++;

				currentplayer=player1;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}

				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");	
				}
			}
		}
			
			
		}	
	}


	class b13 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			
			if(b[1][3]==0)
			{
				
			
			
			if(currentplayer==player1)
			{
				buttonr13.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[1][3]=1;
				count++;

				currentplayer=player2;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}
				else if (k==3)
				{
					Wingame wingame=new Wingame("draw");
				}

			}

			else 
			{
				buttonr13.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
				b[1][3]=2;
				count++;
				currentplayer=player1;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}

				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}
			}
		}
	}
	}


	class b21 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[2][1]==0)
			{
				
			
			
			if(currentplayer==player1)
			{
				buttonr21.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[2][1]=1;
				count++;
				currentplayer=player2;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}
				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}
			}

			else 
			{
				buttonr21.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
				b[2][1]=2;
				count++;

				currentplayer=player1;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}

				else {
					if(k==3)
					{
						Wingame wingame=new Wingame("draw");
					}
				}
			}
		}
	}
	}

	class b22 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[2][2]==0)
			{
				
			
			
			if(currentplayer==player1)
			{
				buttonr22.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[2][2]=1;
				count++;
				currentplayer=player2;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}

				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}
			}

			else 
			{
				buttonr22.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
				b[2][2]=2;
				count++;
				currentplayer=player1;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}
				else if (k==3)
				{
					Wingame wingame=new Wingame("draw");
				}
			}
		}
	}
	}

	class b23 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[2][3]==0)
			{
				
			
			
			if(currentplayer==player1)
			{
				buttonr23.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[2][3]=1;
				count++;
				currentplayer=player2;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}

				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}
			}

			else 
			{
				buttonr23.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
				b[2][3]=2;
				count++;
				currentplayer=player1;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}
				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}

			}
		}
	}
	}


	class b31 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			
			if(b[3][1]==0)
			{
				
			
			if(currentplayer==player1)
			{
				buttonr31.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[3][1]=1;
				count++;
				currentplayer=player2;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}
				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}
			}

			else 
			{
				buttonr31.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
				b[3][1]=2;
				count++;
				currentplayer=player1;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}
				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}
			}
		}
	}
	}
	class b32 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[3][2]==0)
			{
				
			
			
			if(currentplayer==player1)
			{
				buttonr32.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[3][2]=1;
				count++;
				currentplayer=player2;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2) 
				{
					Wingame wingame=new Wingame("player 2 wins");
				}
				else if(k==3)
				{
					Wingame wingame=new Wingame(" draw");
				}
			}

			else 
			{
				buttonr32.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
				b[3][2]=2;
				count++;
				currentplayer=player1;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}
				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}
			}
		}
		}
	}

	class b33 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[3][3]==0)
			{
				
			
			
			if(currentplayer==player1)
			{
				buttonr33.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[3][3]=1;
				count++;
				currentplayer=player2;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}
				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}
			}

			else 
			{
				buttonr33.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
				b[3][3]=2;
				count++;
				currentplayer=player1;
				k=checkwin();

				if(k==1)
				{
					Wingame wingame=new Wingame("player 1 wins");
				}
				else if(k==2)
				{
					Wingame wingame=new Wingame("player 2 wins");
				}
				else if(k==3)
				{
					Wingame wingame=new Wingame("draw");
				}
			}
		}
	}
	}









	/*
	private void  Buttons()

	{
		x=new ImageIcon(this.getClass().getResource("x.png"));
		o=new ImageIcon(this.getClass().getResource("o.png"));

		this.addListeners();
	}

	 */

	/*
	private void addListeners()
	{


	if(currentplayer==player1)
	{
		buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 


	}



		buttonr11.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1 )
			{
			buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			currentplayer=player2;



		//	Wingame wingame=new Wingame();


			this.addListeners2();

	//		b[1][1]='x';
			}

			else 
			{
				buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
			    currentplayer=player1;
			this.addListeners2();
	//		b[1][1]='y';
			}

		});


		buttonr12.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1)
			{
			buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			currentplayer=player2;

			this.addListeners2();
	//		b[1][2]='x';

			}

			else 
			{
				buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
				currentplayer=player1;
			this.addListeners2();
	//		b[1][2]='y';

			}			

		});


		buttonr13.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1)
			{
			buttonr13.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			currentplayer=player2;
			this.addListeners2();
	//		b[1][3]='x';

			}

			else 
			{
				buttonr13.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
				currentplayer=player1;
			this.addListeners2();
	//		b[1][3]='y';

			}			

		});







		buttonr21.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1 )
			{
			buttonr21.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			currentplayer=player2;

		//	Wingame wingame=new Wingame();
		//	b[2][1]='x';

			this.addListeners2();
			}

			else 
			{
				buttonr21.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
			    currentplayer=player1;
		//	    b[2] [1]='y';

			this.addListeners2();
			}

		});


		buttonr22.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1 )
			{
			buttonr22.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			currentplayer=player2;

		//	Wingame wingame=new Wingame();

		//	  b[2] [2]='x';
			this.addListeners2();
			}

			else 
			{
				buttonr22.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
			    currentplayer=player1;

		//	    b[2] [2]='y';
			    this.addListeners2();



			}

		});




		buttonr23.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1 )
			{
			buttonr23.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			currentplayer=player2;

		//	Wingame wingame=new Wingame();
		//	
			  b[2] [3]='x';
			this.addListeners2();
			}

			else 
			{
				buttonr23.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
			    currentplayer=player1;

		//	    b[2] [3]='y';
			    this.addListeners2();



			}

		});



		buttonr31.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1 )
			{
			buttonr31.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			currentplayer=player2;

		//	Wingame wingame=new Wingame();
		//	b[3][1]='x';

			this.addListeners2();
			}

			else 
			{
				buttonr31.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
			    currentplayer=player1;
		//	    b[3][1]='y';

			this.addListeners2();
			}

		});


		buttonr32.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1 )
			{
			buttonr32.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			currentplayer=player2;

		//	Wingame wingame=new Wingame();

		//	b[3][2]='x';
			this.addListeners2();
			}

			else 
			{
				buttonr32.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
			    currentplayer=player1;
			//    b[3][2]='y';

			this.addListeners2();
			}

		});




		buttonr33.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1 )
			{
			buttonr33.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			currentplayer=player2;
		//	b[3][3]='x';

		//	Wingame wingame=new Wingame();


			this.addListeners2();
			}

			else 
			{
				buttonr33.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
			    currentplayer=player1;
			//    b[3][3]='y';

			this.addListeners2();
			}

		});






	//	Wingame wingame=new Wingame();



	}



	private void addListeners2()
	{


		buttonr11.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer ==player1)
			{
			buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			//player2='y';
              currentplayer=player2;
			this.addListeners();

			}

			else 
			{
				buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
			    currentplayer=player1;
			    this.addListeners();

			}

		});


		buttonr12.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1)
			{
			buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			currentplayer=player2;
			this.addListeners();
			}

			else 
			{
				buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));

				 currentplayer=player1;
			this.addListeners();
			}			

		});


		buttonr13.addActionListener((ActionEvent e) ->  
		{



			if(currentplayer==player1 )
			{
			buttonr13.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));   

			//player2='y';
			currentplayer=player2;
			this.addListeners();
			}

			else 
			{
				buttonr13.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
				currentplayer=player1;
		this.addListeners();
			}			

		});






		/*
		buttonr12.addActionListener((ActionEvent e) ->
		{

			//flag++;


			// flag%=3;


			switch(flag)
			{

			case 0:
			{
              //   setIconImage(null);
			}
			case 1:
			{
				buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"));
              //   setIconImage(this.getClass().getResource("x.png"));
			}

			case 2 :
			{
				buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"));
			}

			}




			//		x=new ImageIcon(getClass().getResource("x.png"));
			//		o=new ImageIcon(getClass().getResource("o.png"));

		});



	}



	private void addListeners3()
	{
	Wingame win=new Wingame();
	}

	 */


	private void setIconImage(URL resource) {
		// TODO Auto-generated method stub

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	private void game()
	{

	}


	private int   checkwin()
	{



		if( b[1][1]==1 && b[1][2]==1 && b[1][3]==1    )
		{

			return 1;
		}
		else if(  b[1][1]==2 && b[1][2]==2 && b[1][3]==2    )
		{
			//	k= 2;
			return 2;
		}
		else if(  b[2][1]==1 && b[2][2]==1 && b[2][3]==1    )
		{
			//	k= 1;
			return 1;
		}
		else if(  b[2][1]==2 && b[2][2]==2 && b[2][3]==2    )
		{
			//	k= 2;
			return 2;
		}

		else if(  b[3][1]==1 && b[3][2]==1 && b[3][3]==1    )

		{
			//	k= 1;
			return 1;

		}

		else if(  b[3][1]==2 && b[3][2]==2 && b[3][3]==2    )
		{
			//	k= 2;
			return 2;
		}
		else if(  b[1][1]==1 && b[2][2]==1 && b[3][3]==1    )
		{
			//	k= 1;
			return 1;
		}


		else if(  b[1][1]==2 && b[2][2]==2 && b[3][3]==2    )
		{
			//	k= 2;
			return 2;
		}
		else if(  b[1][3]==2 && b[2][2]==2 && b[3][1]==2    )
		{
			//	k= 2;
			return 2;
		}

		

		else if( b[1][1]==1 && b[2][1]==1 && b[3][1]==1    )
		{

			return 1;
		}
		

		else if( b[1][1]==2 && b[2][1]==2 && b[3][1]==2    )
		{

			return 2;
		}
		

		else if( b[1][2]==1 && b[2][2]==1 && b[3][2]==1    )
		{

			return 1;
		}
		

		else if( b[1][2]==2 && b[2][2]==2 && b[3][2]==2   )
		{

			return 2;
		}
		
		else if( b[1][3]==1 && b[2][3]==1 && b[3][3]==1   )
		{

			return 1;
		}
		
		else if( b[1][3]==2 && b[2][3]==2 && b[3][3]==2   )
		{

			return 2;
		}
		
		
		
		
		
		
		
		
		
		

		if(count==9)
		{
			k=3;
			return 3; 
		}


		else 
		{
			return 0;
		}

	}





}
