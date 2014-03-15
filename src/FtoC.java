/*
 * Programmer: Renan Campos
 *
 * Description:
 *
 * A simple application that converts from Farenheit to Celsius.
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FtoC extends JFrame implements ActionListener{
	
	JLabel ti, fr, c;
	JTextField far, cel;

	public FtoC(String title){
		super(title);
		setLayout(new FlowLayout());
		
		ti = new JLabel("Farenheit to Celsius Converter");
		fr = new JLabel("Enter Feringheight");
		c = new JLabel("Here is the Celsius");

		cel = new JTextField(15);
		cel.setEditable(false);
		
		far = new JTextField(15);
		far.addActionListener(this);

		add(ti);
		add(fr);
		add(far);
		add(c);
		add(cel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	int convert(int f){
		return( (f-32) * 5) / 9;
	}

	public void actionPerformed( ActionEvent evt){
		String userIn = far.getText();

		try{
			int fart = Integer.parseInt( userIn );
			int celt = convert(fart);
			cel.setText( celt + "");
		}
		catch(Exception ex){
			cel.setText( "Re-enter F");
		}

		repaint();

	}

	
	public static void main(String[] args){

		FtoC demo = new FtoC("Done on notepad");
		demo.setSize(500,500);
		demo.setVisible(true);

	}

}