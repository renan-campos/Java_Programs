
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	
	JTextField txt1,txt2,txt3,out;
	JButton doit;
	JLabel l1, l2, l3, l4;
	JPanel info1, info2, info3, info4;


	public Calculator(String title){
		
		super(title);
		
		//switch these to buttons		
		l1 = new JLabel("Enter a number: ");
		l2 = new JLabel("Enter another number: ");
		l3 = new JLabel("Enter an operation: ");
		l4 = new JLabel("Result: ");

		txt1 = new JTextField(5);
		txt2 = new JTextField(5);
		txt3 = new JTextField(5);
		out  = new JTextField(5);

		out.setEditable(false);

		doit = new JButton("Enter");
		doit.addActionListener(this);
		
		info1 = new JPanel();
		info2 = new JPanel();
		info3 = new JPanel();
		info4 = new JPanel();
		
		info1.add(l1); info1.add(txt1);
		info2.add(l2); info2.add(txt2);
		info3.add(l3); info3.add(txt3);
		info4.add(l4); info4.add(out);

		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		this.add(info1);
		this.add(info2);
		this.add(info3);
		this.add(doit);
		this.add(info4);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public void actionPerformed(ActionEvent arg){
		String num1 = txt1.getText();
		String num2 = txt2.getText();
		String op = txt3.getText();

		try{
			if(op.equals("+")){out.setText(addN(Integer.parseInt(num1), Integer.parseInt(num2)) + "");}
			else if(op.equals("-")){out.setText(subN(Integer.parseInt(num1), Integer.parseInt(num2))+ "");}
			else if(op.equals("*")){out.setText(mulN(Integer.parseInt(num1), Integer.parseInt(num2))+"");}
			else{ out.setText(divN(Integer.parseInt(num1), Integer.parseInt(num2))+"");}
		}catch(Exception ob){
			out.setText("Error");
		}
		repaint();
			
	}

	public int addN(int n, int m){
		return(n+m);
	}

	public int subN(int n, int m){
		return(n-m);
	}

	public int mulN(int n, int m){
		return(n*m);
	}

	public int divN(int n, int m){
		return(n/m);
	}

	public static void main(String[] args){
		
		Calculator d = new Calculator("Calculator");
		d.setSize(250,250);
		d.setVisible(true);

	}

}