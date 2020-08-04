/*
 * Authors: Kevin Xu and Harold Pham
 * File Creation Date: 8/3/2020
*/

import java.awt.*;
import java.io.*;
import javax.swing.*;

public class CheckersMain extends JFrame 
{

	public static void main(String[] args) 
	{
		//Create the Objects
		DrawingPanel p = new DrawingPanel(700,500);
		Graphics g = p.getGraphics();
		Image p1B = p.loadImage(new File("Board.jpg")); 
		
		//Set the Colors
		p.setBackground(Color.BLUE);
		g.setColor(Color.BLACK);
		
		
		g.drawImage(p1B,100,0,p);
		
		
	}

}
