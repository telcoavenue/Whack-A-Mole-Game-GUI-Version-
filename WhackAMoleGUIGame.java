
/**

Whack A Mole PC Game ::: Crerated by Constantinos < tinoC23 /> Constantinou @ 06/2017

*/

// class import

import javax.swing.ScrollPaneConstants;

import java.awt.AWTException;

import java.awt.Image;

import java.awt.Toolkit; 

import java.util.Random;

import javax.swing.Box;

import javax.swing.ImageIcon;

	import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import java.lang.Object;
import java.awt.Robot;
	
	 import java.lang.ArrayIndexOutOfBoundsException;
 
 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;

import java.awt.event.*;

import java.awt.event.MouseMotionListener;

import java.awt.Point;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalIconFactory;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;
import java.lang.NumberFormatException;
import java.lang.ArithmeticException;
import java.lang.RuntimeException;

import javax.swing.JScrollPane;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JWindow;

import java.awt.Cursor;

// class import

/**

         Whack A Mole PC GAME .......
	 
	 @
	 
	 *** Whack A Mole Game Grid Table ***
	 
  rows -> columns
	    
   0 -> 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
   B -> 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
   C -> 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
   A -> 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
   B -> 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
   C -> 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
   A -> 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
   B -> 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
   C -> 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
   A -> 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
 
   @
   
   # Player wins if he finds all the hidden moles, before the allowed attempts to find them, run to zero(0), else he lose the game .....
 
*/

public class WhackAMoleGUIGame extends JFrame // throws IndexOutOfBoundsException, HeadlessException
{
	
	//
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	//
	
	private  Font f = new Font("Serif", Font.BOLD, 14);
	
	// initializing jpanels 
	
	private  JPanel navigationMENU;  
	private JPanel GeneralScore;
	private  JPanel GameScore;
	private  JPanel JButtonsContainer;
	private  JPanel JPanelsContainer; 
	
        //
	// jmenubar options .... 
	
	private  JMenuBar KBMenuBar;
        private  JMenu MENU;
	 private  JMenu ABOUT;
	 
	 //
	//  navigation menu jlabels
	
	private   JLabel StartGame;
	 private    JLabel ResetGame;
	  private   JLabel ProgramInstructions;
		private  JLabel  EXIT;  
	private  JLabel  programAuthor;
	
	//
	// moles score , game turns score jlabels
	
	private JLabel molesNumber;
	private int molesINT;
	
	private JLabel turnsRemained;
	private int TURNS;
	
	//
	// player robot score jlabels
         	
	private   JLabel playerW;
	
	private   JLabel robotW;
	
	private   JLabel playerWint;
	private int playerINT;
	
	private   JLabel robotWint;
	private int robotINT;
  
     // 

         String [][] buttonsARRAY=new String[][]{
		 {"R0B00","R0B01","R0B02","R0B03","R0B04","R0B05","R0B06","R0B07","R0B08","R0B09"},
		 {"R1B00","R1B01","R1B02","R1B03","R1B04","R1B05","R1B06","R1B07","R1B08","R1B09"},
		{"R2B00","R2B01","R2B02","R2B03","R2B04","R2B05","R2B06","R2B07","R2B08","R2B09"},
		{"R3B00","R3B01","R3B02","R3B03","R3B04","R3B05","R3B06","R3B07","R3B08","R3B09"},
		{"R4B00","R4B01","R4B02","R4B03","R4B04","R4B05","R4B06","R4B07","R4B08","R4B09"},
		{"R5B00","R5B01","R5B02","R5B03","R5B04","R5B05","R5B06","R5B07","R5B08","R5B09"},
		{"R6B00","R6B01","R6B02","R6B03","R6B04","R6B05","R6B06","R6B07","R6B08","R6B09"},
		{"R7B00","R7B01","R7B02","R7B03","R7B04","R7B05","R7B06","R7B07","R7B08","R7B09"},
		{"R8B00","R8B01","R8B02","R8B03","R8B04","R8B05","R8B06","R8B07","R8B08","R8B09"},
		{"R9B00","R9B01","R9B02","R9B03","R9B04","R9B05","R9B06","R9B07","R9B08","R9B09"}};
		
		//
		
		JLabel [][] JAVAbuttonsARRAY=new JLabel[buttonsARRAY.length][buttonsARRAY.length];
		
		//
		
		private char [][] moleGrid;
		
		private int [] molesPositions;
		
		//
		
		void gameWinningArrayPots()
		{
		
		Random random = new Random(); // make a new instance of the random class 
		
		molesPositions=new int[molesINT]; // carries the moles positions in the Grid Table
		
		for(int i=0;i<molesPositions.length;i++) // add the zero value to each element of the molesPositions array
		{
			
			molesPositions[i]=0;   
			
		}
		
		//
		// Random generate the moles positions on the grid table and add them to the molesPositions array ..... 
		//
		
		for(int i=0;i<molesPositions.length;i++)
		{
			
			molesPositions[i]=(int)(Math.random()*99 + 1); 
			
			
		}
		
		//
		// look if two or more cells in the molesPositions array
		// have stored the same number ,  and replace it with a new one .......
		//
				
		for(int i=0;i<molesPositions.length;i++)
		{
			
		for(int j=0;j<molesPositions.length;j++)
		{
			 if( ( molesPositions[i] == molesPositions[j] ) && ( j != i ) )
			{
			molesPositions[i]=(int)(Math.random()*99 + 1); 
			}
		         else
			 {
				 // do nothing .........
			 }
		}
			
		}
		
		//
		
		for(int i=0;i<molesPositions.length;i++)
		{
			
		//	System.out.print(molesPositions[i]+" "); // testing ..... 
			
		}
		
		//
		
		moleGrid= new char[molesINT][molesINT];
		
		//
		
	for(int i=0;i<moleGrid.length;i++)
	{
		
	for(int j=0;j<moleGrid.length;j++)
	{
		
	moleGrid[i][j]='*';
		
	}
		
	}
		
	//
	// place to the moleGrid array, the placements of the moles, according to the values of the molesPositions array ... 
	//	
	
		for(int i=0;i<moleGrid.length;i++)
		{
			
			if(molesPositions[i] >=0 && molesPositions[i]<10)
			{
				
				moleGrid[i][molesPositions[i]]='M';
				
			}
		        else if(molesPositions[i] >=10 && molesPositions[i]<20)
			{
				
				moleGrid[i][molesPositions[i]-10]='M';
				
			}
			else if(molesPositions[i] >=20 && molesPositions[i]<30)
			{
				
				moleGrid[i][molesPositions[i]-20]='M';
				
			}
			else if(molesPositions[i] >=30 && molesPositions[i]<40)
			{
				
				moleGrid[i][molesPositions[i]-30]='M';
				
			}
			else if(molesPositions[i] >=40 && molesPositions[i]<50)
			{
				
				moleGrid[i][molesPositions[i]-40]='M';
				
			}
			else if(molesPositions[i] >=50 && molesPositions[i]<60)
			{
				
				moleGrid[i][molesPositions[i]-50]='M';
				
			}
			else if(molesPositions[i] >=60 && molesPositions[i]<70)
			{
				
				moleGrid[i][molesPositions[i]-60]='M';
				
			}
			else if(molesPositions[i] >=70 && molesPositions[i]<80)
			{

				moleGrid[i][molesPositions[i]-70]='M';
				
			}
			else if(molesPositions[i] >=80 && molesPositions[i]<90)
			{
				
				moleGrid[i][molesPositions[i]-80]='M';
				
			}
			else if(molesPositions[i] >=90 && molesPositions[i]<99)
			{
				
				moleGrid[i][molesPositions[i]-90]='M';
				
			}
			else
			{
				
				// do nothing ...... 
				
			}
			
		}
		
				//
		
	for(int i=0;i<moleGrid.length;i++)
	{
		
	for(int j=0;j<moleGrid.length;j++)
	{
		
	//     System.out.print(" || "+moleGrid[i][j]);       
		
	}
	
	// System.out.print(" \n ");
		
	}
		
	//
			
}
     
     //
     // executes only one time , at thde program initial execution .....   
		
	void JButtonsArrayINIT()
	{
			
		for(int i=0;i<buttonsARRAY.length;i++)
		{
			
		for(int i1=0;i1<buttonsARRAY.length;i1++)
		{
			
			JAVAbuttonsARRAY[i][i1]=new JLabel(/*buttonsARRAY[i][i1]*/);
			
		}	
			
		}
			
	}
	
  
  //  
  
         void clear()
	{
		
		//
		
	Image image = toolkit.getImage("mole_hill.png");
	
	ImageIcon icon = new ImageIcon(image); 
		
		//
	  
		for(int i=0;i<buttonsARRAY.length;i++)
		{
			
		for(int i1=0;i1<buttonsARRAY.length;i1++)
		{
			
			JAVAbuttonsARRAY[i][i1].setEnabled(true);
			

		JAVAbuttonsARRAY[i][i1].setIcon(icon);
			
		}	
			
		}
		
		//
		
		molesINT=10;
	
	TURNS=25;
		
		//
		
			
      	molesNumber.setText(" || Moles Remain : "+Integer.toString(molesINT)+" ");
	
	
	turnsRemained.setText(" || Turns Left : "+Integer.toString(TURNS)+" ");
	
	//
		
	}
	
	//
	
	 void newGame( )
	{
		
		clear();
		
		gameWinningArrayPots();
		
	}
	
	//
	
	public  void resetGame()
	{
		
          clear();
		
	gameWinningArrayPots();
		
	}
	
	
	//
	
	public WhackAMoleGUIGame()
	{
		
		//
		
			splashSCREEN();
		
		//
		
		JButtonsArrayINIT();
		
		//
		
		JFrame frame=new JFrame("Whack A Mole PC Game Version 1.00");
		
		//
		
		molesINT=10;
	
	TURNS=25;
		
		//
		
		gameWinningArrayPots();
		
		// initialize program jpanels
	
	navigationMENU=new JPanel();  
		
	GeneralScore=new JPanel();  
		
	GameScore=new JPanel();  
		
	JButtonsContainer=new JPanel();  
		
	JPanelsContainer=new JPanel();  
		
		// initialize program layout
		
		//
		
		
	


		
		
		//
		
		navigationMENU.setLayout(new FlowLayout(FlowLayout.LEFT));
		navigationMENU.setBackground(Color.ORANGE);
		// navigationMENU.setSize(new Dimension(200, 300));
		  navigationMENU.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		  navigationMENU.setCursor(Cursor.getDefaultCursor());
		
		//
		
		GeneralScore.setLayout(new FlowLayout(FlowLayout.CENTER));
		GeneralScore.setBackground(Color.ORANGE);
		// GeneralScore.setSize(new Dimension(100, 150));
		  GeneralScore.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		  GeneralScore.setCursor(Cursor.getDefaultCursor());
		  
		  //
		   
		GameScore.setLayout(new FlowLayout(FlowLayout.CENTER));
		GameScore.setBackground(Color.WHITE);
		// GameScore.setSize(new Dimension(100, 150));
		  GameScore.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		  GameScore.setCursor(Cursor.getDefaultCursor());
		  
		  //
		
		JButtonsContainer.setLayout(new GridLayout(10,10,5,5));
		JButtonsContainer.setBackground(Color.CYAN);
		// JButtonsContainer.setSize(new Dimension(550, 550));
		  JButtonsContainer.setBorder(BorderFactory.createLineBorder(Color.RED));
		  	Image image22 = toolkit.getImage("wood_hammer.png");
       Cursor c = toolkit.createCustomCursor(image22 , new Point(JButtonsContainer.getX(), JButtonsContainer.getY()), "img");
		  JButtonsContainer.setCursor(c);
		  
		  
		  //
		  
		  JPanelsContainer.setLayout((new BoxLayout(JPanelsContainer, BoxLayout.Y_AXIS)));
		JPanelsContainer.setBackground(Color.RED);
		
		//
		
				// initialize program layout
		
	//////////////////////////////////////////////////////////////////////////////////////////////////////////			
		//
		// Program Menu  
		//    Create the menu bar   
		
        KBMenuBar = new JMenuBar();
        
        // initialize the main menu 
        
        MENU = new JMenu("MENU");
		MENU.setForeground(Color.BLACK);
		MENU.setBackground(Color.WHITE);
		
	ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK);
	ABOUT.setBackground(Color.WHITE); 
			
		 KBMenuBar.add(MENU);
		 KBMenuBar.add(ABOUT);
		 
		 /*
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
				
	StartGame=new JLabel("start a new game");
	  StartGame.setBackground(Color.WHITE);
	   StartGame.setForeground(Color.BLACK);
	 StartGame.setEnabled(true);
	StartGame.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =StartGame.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           StartGame.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          StartGame.setForeground(oldcolor);
         }
      }
      );
	StartGame.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
				
		 		try
				{
                               newGame();             
                          	}
				catch(NullPointerException NullPointerException)
				{
					NullPointerException.printStackTrace();
				}
				
                       }
		
      }
      );
       MENU.add(new JSeparator());//add a seperator line
	 MENU.add(StartGame);
	 
	 */
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
				
				/*
				
	ResetGame=new JLabel("reset the current game");
	  ResetGame.setBackground(Color.WHITE);
	   ResetGame.setForeground(Color.BLACK);
	 ResetGame.setEnabled(true);
	ResetGame.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =ResetGame.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           ResetGame.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          ResetGame.setForeground(oldcolor);
         }
      }
      );
	ResetGame.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
				
		 		try
				{
					
				resetGame();
					
				}
				catch(NullPointerException NullPointerException)
				{
					NullPointerException.printStackTrace();
				}
				
                       }
		
      }
      );
       MENU.add(new JSeparator());//add a seperator line
	 MENU.add(ResetGame);
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
				
				*/
				
	EXIT=new JLabel("exit game");
	  EXIT.setBackground(Color.WHITE);
	   EXIT.setForeground(Color.BLACK);
	 EXIT.setEnabled(true);
    EXIT.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXIT.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           EXIT.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXIT.setForeground(oldcolor);
         }
      }
      );
	EXIT.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
		 		
	System.exit(0);
		 		
        }
		
      }
      );
       MENU.add(new JSeparator());//add a seperator line
	 MENU.add(EXIT);	
       MENU.add(new JSeparator());//add a seperator line
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
		
		 programAuthor=new JLabel("game creator");
	  programAuthor.setBackground(Color.WHITE);
	  programAuthor.setForeground(Color.BLACK);
	 programAuthor.setEnabled(true);
   programAuthor.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programAuthor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programAuthor.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programAuthor.setForeground(oldcolor);
         }
      }
      );
	programAuthor.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
	
    		
	JOptionPane.showMessageDialog(null," \n Game created by: \n Constantinos < tinoC23 /> Constantinou \n @ 06/2017 \n email : c.constantinou.24@gmail.com \n </[-_-]/> \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
 ABOUT.add(new JSeparator());//add a seperator line
      ABOUT.add(programAuthor);
       ABOUT.add(new JSeparator());//add a seperator line
      
      //
      
      		navigationMENU.add(KBMenuBar);

      //
      
      playerINT=0;
      robotINT=0;
	  		
	playerW=new JLabel(" || Player Wins : ");
	playerW.setForeground(Color.BLACK);
	playerW.setFont(f);
	 GeneralScore.add(playerW);
	 
	 	playerWint=new JLabel(Integer.toString(playerINT));
	playerWint.setForeground(Color.BLACK);
	playerWint.setFont(f);
	 GeneralScore.add(playerWint);
	
	
	robotW=new JLabel(" || Robot Wins: ");
	robotW.setForeground(Color.red);
	robotW.setFont(f);
	 GeneralScore.add(robotW);
	 
	 	robotWint=new JLabel(Integer.toString(robotINT)+" || ");
	robotWint.setForeground(Color.red);
	robotWint.setFont(f);
	 GeneralScore.add(robotWint);
	 
	//
		
      	molesNumber=new JLabel(" || Moles Remain : "+Integer.toString(molesINT)+" ");
	molesNumber.setForeground(Color.LIGHT_GRAY);
	molesNumber.setFont(f);
	 GameScore.add(molesNumber);
	
	
	turnsRemained=new JLabel(" || Turns Left : "+Integer.toString(TURNS)+" ");
	turnsRemained.setForeground(Color.red);
	turnsRemained.setFont(f);
	 GameScore.add(turnsRemained);
	
	
	//
	
	Image image11 = toolkit.getImage("mole_hill.png");
	
	ImageIcon icon = new ImageIcon(image11); 
	
	//
	
	for(int i=0;i<buttonsARRAY.length;i++)
	{
			
		for(int i1=0;i1<buttonsARRAY.length;i1++)
		{
				
		JAVAbuttonsARRAY[i][i1].setBackground(Color.WHITE);		
			JAVAbuttonsARRAY[i][i1].setEnabled(true);
		//	JAVAbuttonsARRAY[i][i1].setText("?");
		//	JAVAbuttonsARRAY[i][i1].setSize(8,8);
			JAVAbuttonsARRAY[i][i1].setIcon(icon);
			JAVAbuttonsARRAY[i][i1].setBorder(BorderFactory.createLineBorder(Color.black));
		JAVAbuttonsARRAY[i][i1].addMouseListener(new MouseAdapter() 
		{ 
			
			//
			
					//		 

public void mouseEntered(MouseEvent e) 
       { 
			
			/*	
		
             		Image image242 = toolkit.getImage("wood_hammer.png");
       Cursor ccc3 = toolkit.createCustomCursor(image242 , new Point(JButtonsContainer.getX(), JButtonsContainer.getY()), "img");
		  JButtonsContainer.setCursor(ccc3);       
				
	       */
				
	}
				
	//			
				
public void mouseExited(MouseEvent e) 
	{ 
		
		
		/*
		
			Image image232 = toolkit.getImage("wood_hammer.png");
       Cursor ccc33 = toolkit.createCustomCursor(image232 , new Point(JButtonsContainer.getX(), JButtonsContainer.getY()), "img");
		  JButtonsContainer.setCursor(ccc33);
		
		
		*/
		
	}

//
			
			//
				
          public void mousePressed(MouseEvent me) 
		{ 
				
				// 
			
			int control=0;
			
		Image image = toolkit.getImage("mole_uncovered.png");
	
	ImageIcon iconUNCOVERED = new ImageIcon(image); 
			
			Image image2 = toolkit.getImage("mole_hill_false.png");
	
	ImageIcon iconFALSE = new ImageIcon(image2); 
			
			
			//
			/*
			
			Image image222 = toolkit.getImage("wood_hammer.gif");
       Cursor cc = toolkit.createCustomCursor(image222 , new Point(JButtonsContainer.getX(), JButtonsContainer.getY()), "img");
		  JButtonsContainer.setCursor(cc);
			
			*/
				//
				
		for(int i=0;i<buttonsARRAY.length;i++)
		{
			
		for(int i1=0;i1<buttonsARRAY.length;i1++)
		{
			
		if (me.getSource() == JAVAbuttonsARRAY[i][i1]) 
		{
			
		if( JAVAbuttonsARRAY[i][i1].isEnabled() == false )	
		{
			
			control++;
			
		}
		else{
		
			if(moleGrid[i][i1] == 'M')
			{
				
		  molesINT--;
				
		//	JAVAbuttonsARRAY[i][i1].setText("M");
				
			
				
			JAVAbuttonsARRAY[i][i1].setEnabled(false);
				
					JAVAbuttonsARRAY[i][i1].setIcon(iconUNCOVERED);
								
			molesNumber.setText(" || Moles Remain : "+Integer.toString(molesINT)+" ");
				
			}
			else
			{
				
			//	JAVAbuttonsARRAY[i][i1].setText("---");	
				
				
				
				JAVAbuttonsARRAY[i][i1].setEnabled(false);
				
				
					JAVAbuttonsARRAY[i][i1].setIcon(iconFALSE);
				
				
			}
			
			i=1000;
			i1=1000;
			
                }}
			
		}

		if(control == 0){
		if( ( i == (buttonsARRAY.length-1) ) || ( i==1000 ) )
		{
			
		TURNS--;
			
		turnsRemained.setText(" || Turns Left : "+Integer.toString(TURNS)+" ");	
			
		}}		
			
		}
		
		//
		
		control=0;
		
		// match the jbutton name with the jbutton names array appropriate coordinates [x][y] ....
		// match the x-y coordinates of the array with the moles carrier array coordinates ...
		// present the result on the game interface ....
		
		if( (molesINT==0 && TURNS==0) || (molesINT==0 && TURNS!=0) )
		{
			
			playerINT++;
			
			playerWint.setText(Integer.toString(playerINT));
			
	JOptionPane.showMessageDialog(null," \n Player won the turn !!! \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
         
			//
			
			newGame();
			
			//	
			
		}
		else if((molesINT!=0 && TURNS==0))
		{
			
			robotINT++;
			
			robotWint.setText(Integer.toString(robotINT)+" || ");

                         			
	JOptionPane.showMessageDialog(null," \n Robot won the turn !!! \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
         		
			//
			
			newGame();
			
			//		
			
		}
		
		
		//
		
		
	
		
		
		//
	       
		
		}
		
		//
		
		});
		JButtonsContainer.add(JAVAbuttonsARRAY[i][i1]);
			
		}	
			
	}
	
	//
	
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
double width = screenSize.getWidth();
double height = screenSize.getHeight();

		int w=(int)width;
			int h=(int)height;
	
	//
	
		JPanel JButtonsContainer2 = new JPanel();
	JButtonsContainer2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButtonsContainer2.setBackground(Color.WHITE);
		// JButtonsContainer2.setSize(new Dimension(100, 150));
		  JButtonsContainer2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		  JButtonsContainer2.setCursor(Cursor.getDefaultCursor());
	
	//
	
 JScrollPane scrollPane = new JScrollPane(JButtonsContainer,   ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
 scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
   		 scrollPane.setPreferredSize(new Dimension(w-50, h-200));
		scrollPane.setBounds(5, 5, w-50, h-100);
                scrollPane.setBorder(BorderFactory.createTitledBorder("Whack-A-Mole-Game"));
		scrollPane.setViewportView(JButtonsContainer);	
	
       //
	
	    JButtonsContainer2.add(scrollPane); // add acrollpane to frame
		
		//
		// additional code goes here .... [jpanels] 
	
	navigationMENU.revalidate();
	GeneralScore.revalidate();
	GameScore.revalidate();
	JButtonsContainer.revalidate();
		
		JPanelsContainer.add(navigationMENU);
		JPanelsContainer.add(GeneralScore);
		   JPanelsContainer.add(GameScore);
		   JPanelsContainer.add(JButtonsContainer2);
	
	
	JPanelsContainer.revalidate();
		
		//
		
		frame.add(JPanelsContainer);

		
		frame.setDefaultLookAndFeelDecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.setResizable(true);
		
		frame.setLocationRelativeTo(null);
		
	
		
		 frame.setSize(w-50,h-100);
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
                 //  frame.setUndecorated(true);
		
		frame.revalidate();
		
	        frame.pack();
		
                

                   //
		   
		   
		
		      
	}
	
	//
	
	void splashSCREEN()
	{
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
double width = screenSize.getWidth();
double height = screenSize.getHeight();
		
		int w=(int)width;
		
			int h=(int)height;
		
		JWindow window = new JWindow();

 ImageIcon image = new ImageIcon("moleSplashScreen.jpg");	
JLabel jl= new JLabel(image);
jl.setText("Whack-A-Mole-Java-Game");
jl.setHorizontalTextPosition(JLabel.CENTER);
jl.setVerticalTextPosition(JLabel.BOTTOM);		
jl.setForeground(Color.BLACK);
		
window.add(jl);				
		
window.setBounds( h/2, w/4 , 230, 240);
		
window.setVisible(true);
		
try 
{
Thread.sleep(5000);
} 
catch (InterruptedException e) 
{
    e.printStackTrace();
}

window.setVisible(false);

window.dispose();
		
	}
	
	// accessing the main method ... 
	
	public static void main(String [] whackGUI)
	{
		
	
		
		new WhackAMoleGUIGame();
		
		
		
	}
	
	// accessing the main method ... 
	
}



