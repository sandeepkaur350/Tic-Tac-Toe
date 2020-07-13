package com.isi.java.tictac;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.isi.java.tictac.Friend.b11;
import com.isi.java.tictac.Friend.b12;
import com.isi.java.tictac.Friend.b13;
import com.isi.java.tictac.Friend.b21;
import com.isi.java.tictac.Friend.b22;
import com.isi.java.tictac.Friend.b23;
import com.isi.java.tictac.Friend.b31;
import com.isi.java.tictac.Friend.b32;
import com.isi.java.tictac.Friend.b33;

public class Computer extends JFrame
{
	int win,k=0, pos1,pos2 ,count=0;
	char player1='x';
	char player2='y';
	char  currentplayer=player1;


	char   b[][]=new char [4][4];
	int flag; 
	AAction actionListner=new AAction();

	private JPanel computerPanel;

	public  JButton buttonr11;
	private JButton buttonr12;
	private JButton buttonr13;
	private JButton buttonr21;
	private JButton buttonr22;
	private JButton buttonr23;
	private JButton buttonr31;
	private JButton buttonr32;
	private JButton buttonr33;

	private InputFields inputfields;

	private ImageIcon x ,o;

	public Computer() 
	{

		super("PLAYING WITH COMPUTER");

		// 	this.inputfields=inputfields;

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);

		//	x=new ImageIcon(this.getClass().getResource("x.png"));

		//	o=new ImageIcon(this.getClass().getResource("o.png"));

		setVisible(true);



		createcomponents();

		createpanels();
		addcomponentstopanel();   
	}



	private void createcomponents()
	{

		buttonr11=new JButton("");
		buttonr12=new JButton("");
		buttonr13=new JButton("");
		buttonr21=new JButton("");
		buttonr22=new JButton("");
		buttonr23=new JButton("");
		buttonr31=new JButton("");
		buttonr32=new JButton("");
		buttonr33=new JButton("");




		buttonr11.addActionListener( new br11() );
		
		
		buttonr12.addActionListener( new br12() );
		buttonr13.addActionListener( new br13() );
		buttonr21.addActionListener( new br21() );
		buttonr22.addActionListener( new br22() );
		buttonr23.addActionListener( new br23() );
		buttonr31.addActionListener( new br31() );
		buttonr32.addActionListener( new br32() );
		buttonr33.addActionListener( new br33() );

	}
	class br11 implements ActionListener
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
			
			if(b[1][1]==0)
			{
				
			

            System.out.println("started b11  :"+currentplayer );
			if(currentplayer==player1)
			{
				buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[1][1]=1;
				count++;
				
			//	b[1][2]=0;
				currentplayer=player2;
				
				
				if(count<9)
				{
				
				  Random rd= new Random();
	                 
                  pos1=rd.nextInt(3)+1;
                 pos2=rd.nextInt(3)+1; 
           
                 
                 
                 while(   b[pos1][pos2]!=0     )
                 {
                	   pos1=rd.nextInt(3)+1;
                       pos2=rd.nextInt(3)+1; 
                 }
				
                 
				 selectbutton(pos1,pos2);
				 count++;
				 
			}
				 
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
				 
					//		b11.SetEnabled(false );
			}

		
			System.out.println("stopped b11 :"+ currentplayer);

		}	
	}

	}


	class br12 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[1][2]==0)
			{
				
			
			System.out.println("strted b12 :"+ currentplayer);
			
			if(currentplayer==player1)
			{
				buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[1][2]=1;
				
				currentplayer=player2;
				count++;
				
				if(count<9)
				{
				  Random rd= new Random();
	                 
                  pos1=rd.nextInt(3)+1;
                 pos2=rd.nextInt(3)+1; 
           
                 
                 
                 while(   b[pos1][pos2]!=0     )
                 {
                	   pos1=rd.nextInt(3)+1;
                       pos2=rd.nextInt(3)+1; 
                 }
				
				 selectbutton(pos1,pos2);
				 count++;
				}
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

			System.out.println("stopped b12 :"+ currentplayer);
		}
		}
	}


	class br13 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[1][3]==0)
			{
				
			
			
			System.out.println("started b13 :"+ currentplayer);
			
			
			
			if(currentplayer==player1)
			{
				buttonr13.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[1][3]=1;
				count++;
				currentplayer=player2;
				if(count<9)
				{
					
				
				  Random rd= new Random();
	                 
                  pos1=rd.nextInt(3)+1;
                 pos2=rd.nextInt(3)+1; 
           
                 
                 
                 while(   b[pos1][pos2]!=0     )
                 {
                	   pos1=rd.nextInt(3)+1;
                       pos2=rd.nextInt(3)+1; 
                 }
				 selectbutton(pos1,pos2);
				 count++;
				}
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
			System.out.println("stopped b13 :"+ currentplayer);
		
		}
		}
	}


	class br21 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[2][1]==0)
			{
				
			
			
			System.out.println("started b21 :"+ currentplayer);
			
			if(currentplayer==player1)
			{
				buttonr21.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[2][1]=1;
				count++;
				currentplayer=player2;
				
				
				if(count<9)
				{
					
				
				  Random rd= new Random();
	                 
                  pos1=rd.nextInt(3)+1;
                 pos2=rd.nextInt(3)+1; 
           
                 
                 
                 while(   b[pos1][pos2]!=0     )
                 {
                	   pos1=rd.nextInt(3)+1;
                       pos2=rd.nextInt(3)+1; 
                 }
				
				
				 selectbutton(pos1,pos2);
				 count++;
				 
				}
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

			System.out.println("stopped b21 :"+ currentplayer);
		}
		}
	}

	class br22 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[2][2]==0)
			{
				
			
			System.out.println("started b22 :"+ currentplayer);
			
			if(currentplayer==player1)
			{
				buttonr22.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[2][2]=1;
				count++;
				currentplayer=player2;
				
				
				if(count<9)
				{
					
				
				  Random rd= new Random();
	                 
                  pos1=rd.nextInt(3)+1;
                 pos2=rd.nextInt(3)+1; 
           
                 
                 
                 while(   b[pos1][pos2]!=0     )
                 {
                	   pos1=rd.nextInt(3)+1;
                       pos2=rd.nextInt(3)+1; 
                 }
				
				 selectbutton(pos1,pos2);
				 count++;
				 
				}
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
			
			
			System.out.println("stopped b22 :"+ currentplayer);

	/*	else 
			{  Random rd= new Random();
            
            pos1=rd.nextInt(9)+1;
           pos2=rd.nextInt(9)+1; 
     
           
           
           while(   b[pos1][pos2]!=0     )
           {
          	   pos1=rd.nextInt(3)+1;
                 pos2=rd.nextInt(3)+1; 
           }
           
           
              selectbutton(pos1,pos2);
		//	buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
		//	b[1][1]=2;
			currentplayer=player1;
			k=checkwin();
		
			}*/
		}
		}
	}


	class br23 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[2][3]==0)
			{
				
			
			
			System.out.println("started b23 :"+ currentplayer);
			
			if(currentplayer==player1)
			{
				buttonr23.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[2][3]=1;
				count++;
				currentplayer=player2;
				
				if(count<9)
				{
					
				
				
				  Random rd= new Random();
	                 
                  pos1=rd.nextInt(3)+1;
                 pos2=rd.nextInt(3)+1; 
           
                 
                 
                 while(   b[pos1][pos2]!=0     )
                 {
                	   pos1=rd.nextInt(3)+1;
                       pos2=rd.nextInt(3)+1; 
                 }
				
				 selectbutton(pos1,pos2);
				 count++;
				 
				}
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
			
			System.out.println("stopped b23 :"+ currentplayer);

		}
		}
	}


	class br31 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[3][1]==0)
			{
				
			
			System.out.println("started b31 :"+ currentplayer);
			if(currentplayer==player1)
			{
				buttonr31.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[3][1]=1;
				count++;
				currentplayer=player2;
				
				
				if(count<9)
				{
					
				
				  Random rd= new Random();
	                 
                  pos1=rd.nextInt(3)+1;
                 pos2=rd.nextInt(3)+1; 
           
                 
                 
                 while(   b[pos1][pos2]!=0     )
                 {
                	   pos1=rd.nextInt(3)+1;
                       pos2=rd.nextInt(3)+1; 
                 }
				 selectbutton(pos1,pos2);
				 count++;
				 
				}
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
			System.out.println("stopped b31 :"+ currentplayer);
	
		}
		}
	}

	class br32 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			
			if(b[3][2]==0)
			{
				
			
			System.out.println("started b32 :"+ currentplayer);
			
			if(currentplayer==player1)
			{
				buttonr32.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[3][2]=1;
				count++;
				currentplayer=player2;
				if(count<9) 
				{
				  Random rd= new Random();
	                 
                  pos1=rd.nextInt(3)+1;
                 pos2=rd.nextInt(3)+1; 
           
                 
                 
                 while(   b[pos1][pos2]!=0     )
                 {
                	   pos1=rd.nextInt(3)+1;
                       pos2=rd.nextInt(3)+1; 
                 }
				
				 selectbutton(pos1,pos2);
				 count++;
			}
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

			System.out.println("stopped b32 :"+ currentplayer);
		}
		}
	}

	class br33 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)

		{
			if(b[3][3]==0)
			{
				
			
			System.out.println("started b33 :"+ currentplayer);
			
			if(currentplayer==player1)
			{
				buttonr33.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\x.png"))  ; 
				b[3][3]=1;
				count++;
				currentplayer=player2;
				
				if(count<9)
				{
					
				
				
				  Random rd= new Random();
	                 
                  pos1=rd.nextInt(3)+1;
                 pos2=rd.nextInt(3)+1; 
           
                 
                 
                 while(   b[pos1][pos2]!=0     )
                 {
                	   pos1=rd.nextInt(3)+1;
                       pos2=rd.nextInt(3)+1; 
                 }
                 
                 selectbutton(pos1,pos2);
                 count++;
				}
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

			System.out.println("stopped b33 :"+ currentplayer);
		}
		}
	}




	private void addcomponentstopanel()
	{
		computerPanel.add(buttonr11);
		computerPanel.add(buttonr12);
		computerPanel.add(buttonr13);
		computerPanel.add(buttonr21);
		computerPanel.add(buttonr22);
		computerPanel.add(buttonr23);
		computerPanel.add(buttonr31);
		computerPanel.add(buttonr32);
		computerPanel.add(buttonr33);

	}



	private void createpanels()
	{
		computerPanel=(JPanel)getContentPane();
		computerPanel.setLayout(new GridLayout(3, 3, 4, 4));


	}

	private void AddListners()
	{
		buttonr11.addActionListener((ActionEvent e)->
		{

			buttonr11.setText("x");

			//	setVisible(true);

			//actionListner.display();
		}

				);

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
		
		
		
		else if(  b[1][3]==2 && b[2][2]==2 && b[3][1]==2    )
		{
			//	k= 2;
			return 2;
		}

       if(count ==9)
       {
    	   return 3;
       }
		else 
		{
			return 0;
		}

	}


   private  void selectbutton(int pos1,int pos2)
   {
	   
	   System.out.println(pos1+ " "+pos2);
	   
	   if( pos1==1  && pos2==1   )
	   {
			buttonr11.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
	         b[1][1]=2;
	   
	   }
	   
	   else if( pos1==1 && pos2==2       )
	   {
		 //  buttonr12.addActionListener( new br12() );
			buttonr12.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
	        b[1][2]=2;
	   }
	   
	   else if( pos1==1 && pos2==3  )
	   {
			buttonr13.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
	         b[1][3]=2;   
	   }
	   
	   else if( pos1==2 && pos2== 1     )
	   {
			buttonr21.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
	         b[2][1]=2;
	   }
	   
	   else if(pos1==2 && pos2==2 )
	   {
			buttonr22.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
	       b[2][2]=2;
	   }
	   
	   else if(pos1==2 && pos2==3)
	   {
			buttonr23.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
	       b[2][3]=2;
	   }
	   
	   else if(pos1==3 && pos2==1)
	   {
			buttonr31.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
	       b[3][1]=2;
	   }
	   
	   else if( pos1==3 && pos2==2 )
	   {
			buttonr32.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
	      b[3][2]=2;
	   }
	   
	   else if( pos1==3 && pos2==3    )
	   {
			buttonr33.setIcon(new ImageIcon("C:\\Users\\nkapoor1\\Desktop\\study\\do 4\\java workspace\\Tiktok\\src\\com\\isi\\java\\tictac\\o.png"))  ; 
	   b[3][3]=2;
	   }
	   
	   
   }















}
