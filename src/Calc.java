/* Programmer: Renan Campos
 * 
 * Description:
 *
 * A calculator I made my junior year of high school.
 *
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc extends JFrame implements ActionListener{
	
	
	private int num1, num2, ops;               //ops enumerations: + 1; - 2; * 3; / 4;
	JTextField inout;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;     // Numbers
	JButton add, sub, mul, div, clear, equals; //Operations
	JPanel io, buttons, r1, r2, r3, r4;


	public Calc(){
		
		super("Calculator");
		
		inout  = new JTextField(25);

		inout.setEditable(false);

		b0 =     new JButton("0");
		b1 =     new JButton("1");
		b2 =     new JButton("2");
		b3 =     new JButton("3");
		b4 =     new JButton("4");
		b5 =     new JButton("5");
		b6 =     new JButton("6");
		b7 =     new JButton("7");
		b8 =     new JButton("8");
		b9 =     new JButton("9");
		add =    new JButton("+");
		sub =    new JButton("-");
		mul =    new JButton("*");
		div =    new JButton("/");
		clear =  new JButton("c");
		equals = new JButton("=");

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		add.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
		equals.addActionListener(this);
		
		
		io      = new JPanel();
		buttons = new JPanel();
		r1      = new JPanel();
		r2      = new JPanel();
		r3      = new JPanel();
		r4      = new JPanel();

		r1.setLayout(new BoxLayout(r1, BoxLayout.X_AXIS));
		r2.setLayout(new BoxLayout(r2, BoxLayout.X_AXIS));
		r3.setLayout(new BoxLayout(r3, BoxLayout.X_AXIS));
		r4.setLayout(new BoxLayout(r4, BoxLayout.X_AXIS));
		
		r1.add(b1);r1.add(b2   );r1.add(b3    );r1.add(div);
		r2.add(b4);r2.add(b5   );r2.add(b6    );r2.add(mul);
		r3.add(b7);r3.add(b8   );r3.add(b9    );r3.add(sub);
		r4.add(b0);r4.add(clear);r4.add(equals);r4.add(add);

		buttons.setLayout(new BoxLayout(buttons, BoxLayout.Y_AXIS));
		buttons.add(r1);buttons.add(r2);buttons.add(r3);buttons.add(r4);
				

		io.add(inout);

		setLayout(new BorderLayout());
		add(inout, BorderLayout.NORTH);
		add(buttons, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	
	public void actionPerformed(ActionEvent arg){
		
//Numbers
		     if(arg.getActionCommand().equals("0")){ String text = inout.getText(); inout.setText(text + "0");}
		else if(arg.getActionCommand().equals("1")){ String text = inout.getText(); inout.setText(text + "1");}
		else if(arg.getActionCommand().equals("2")){ String text = inout.getText(); inout.setText(text + "2");}
		else if(arg.getActionCommand().equals("3")){ String text = inout.getText(); inout.setText(text + "3");}
		else if(arg.getActionCommand().equals("4")){ String text = inout.getText(); inout.setText(text + "4");}
		else if(arg.getActionCommand().equals("5")){ String text = inout.getText(); inout.setText(text + "5");}
		else if(arg.getActionCommand().equals("6")){ String text = inout.getText(); inout.setText(text + "6");}
		else if(arg.getActionCommand().equals("7")){ String text = inout.getText(); inout.setText(text + "7");}
		else if(arg.getActionCommand().equals("8")){ String text = inout.getText(); inout.setText(text + "8");}
		else if(arg.getActionCommand().equals("9")){ String text = inout.getText(); inout.setText(text + "9");}
//Operations
		else if(arg.getActionCommand().equals("+")){ 
		    String text = inout.getText(); 
		    try{
			num1 = Integer.parseInt(text); 
			ops = 1;
		    }catch(Exception ob){ 
			inout.setText("Forgot to enter number (press c)");
		    }
		    inout.setText("");
		}
		else if(arg.getActionCommand().equals("-")){ 
		    String text = inout.getText(); 
		    try{
			num1 = Integer.parseInt(text);
			ops = 2;
		    }catch(Exception ob){ 
			inout.setText("Forgot to enter number (press c)");
		    }
		    inout.setText("");
		}
		else if(arg.getActionCommand().equals("*")){
		    String text = inout.getText();
		    try{
			num1 = Integer.parseInt(text);
			ops = 3;
		    }catch(Exception ob){ 
			inout.setText("Forgot to enter number (press c)");
		    } 
		    inout.setText("");
		}
		else if(arg.getActionCommand().equals("/")){
		    String text = inout.getText();
		    try{num1 = Integer.parseInt(text);
			ops = 4;
		    }catch(Exception ob){ 
			inout.setText("Forgot to enter number (press c)");
		    }
		    inout.setText("");
		}
//Other		
		else if(arg.getActionCommand().equals("c")){ num1 = 0; inout.setText("");}
		else if(arg.getActionCommand().equals("=")){ String text = inout.getText(); try{num2 = Integer.parseInt(text); 
		switch(ops){
		case 1: {inout.setText(addN(num1, num2) + ""); break;}
		case 2: {inout.setText(subN(num1, num2) + ""); break;}
		case 3: {inout.setText(mulN(num1, num2) + ""); break;}
		case 4: {inout.setText(divN(num1, num2) + ""); break;} 
		}
		}catch(Exception ob){ inout.setText("Forgot to enter number (press c)");}}
		else{ inout.setText("How did you manage to do this?");}
		
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
		
		Calc d = new Calc();
		d.setSize(177,160);
		d.setResizable(true);
		d.setVisible(true);

	}
}

