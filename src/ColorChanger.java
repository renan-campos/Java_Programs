/* 
 * Programmer: Renan Campos
 *
 * Description: 
 *
 * One of my first java GUI programs, written in the summer of my
 * junior year in highschool ( circa. 2011 ). 
 *
 *
 * Displays a window with a set of radio buttons that when selected changes
 * the current background color to that specified. 
 *
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorChanger extends JFrame implements ActionListener{

		JRadioButton blue, green, red, yellow, black;
		JLabel bluel, greenl, redl, yellowl, blackl;
		JPanel r1, r2, r3, r4, r5;

		ColorChanger(){

		super("Color Changer");
		
		ButtonGroup bg = new ButtonGroup();		

		blue = new JRadioButton();
		green = new JRadioButton();
		red = new JRadioButton();
		yellow = new JRadioButton();
		black = new JRadioButton();

		bg.add(blue); bg.add(yellow); bg.add(green); bg.add(red); bg.add(black);

		bluel = new JLabel("Blue");
		greenl = new JLabel("Green");
		redl = new JLabel("Red");
		yellowl = new JLabel("Yellow");
		blackl = new JLabel("black");

		blue.setActionCommand("BLUE");
		green.setActionCommand("GREEN");
		red.setActionCommand("RED");
		yellow.setActionCommand("YELLOW");
		black.setActionCommand("BLACK");
		
		blue.addActionListener(this);
		green.addActionListener(this);
		red.addActionListener(this);
		yellow.addActionListener(this);
		black.addActionListener(this);

		r1 = new JPanel();
		r2 = new JPanel();
		r3 = new JPanel();
		r4 = new JPanel();
		r5 = new JPanel();
		
		r1.setLayout( new BoxLayout(r1, BoxLayout.X_AXIS));
		r2.setLayout( new BoxLayout(r2, BoxLayout.X_AXIS));
		r3.setLayout( new BoxLayout(r3, BoxLayout.X_AXIS));
		r4.setLayout( new BoxLayout(r4, BoxLayout.X_AXIS));
		r5.setLayout( new BoxLayout(r5, BoxLayout.X_AXIS));
		
		r1.add(bluel); r1.add(blue);
		r2.add(greenl); r2. add(green);
		r3.add(yellowl); r3.add(yellow);
		r4.add(redl); r4.add(red);
		r5.add(blackl); r5.add(black);

		

		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(r1);add(r2);add(r3);add(r4);add(r5);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		

		}

		public void actionPerformed( ActionEvent arg ){
			if(arg.getActionCommand().equals("BLUE")) getContentPane().setBackground(Color.BLUE);
			if(arg.getActionCommand().equals("GREEN"))getContentPane().setBackground(Color.GREEN);
			if(arg.getActionCommand().equals("RED"))getContentPane().setBackground(Color.RED);
			if(arg.getActionCommand().equals("YELLOW"))getContentPane().setBackground(Color.YELLOW);
			if(arg.getActionCommand().equals("BLACK"))getContentPane().setBackground(Color.BLACK);

			repaint();
		}

	public static void main(String[] args){

		ColorChanger d = new ColorChanger();
		d.setSize(100,100);
		d.setVisible(true);

		}
}
