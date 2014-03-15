/* Programmer: Renan Campos
 *
 * Description:
 * 
 * One of my first GUI programs, it tells the 
 * height and width of the frame.
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FindSize extends JFrame implements ActionListener{
	
	JButton fi;

	public FindSize(String title){
		super(title);
		setLayout(new FlowLayout());
		
		fi = new JButton("Show Size");		
		fi.addActionListener(this);
		add(fi);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}


	public void actionPerformed( ActionEvent evt){
		
		System.out.println("Frame Width: " + getWidth() +". Frame height " + getHeight());
		repaint();

	}

	
	public static void main(String[] args){

		FindSize demo = new FindSize("Find Size");
		demo.setSize(500,500);
		demo.setVisible(true);

	}

}