
/*Write a Java program to create an applet to find the simple interest on a given 
amount, rate of interest and duration. Use proper GUI components in your program.  
* 
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code= SimpleInterest width="500" height="500" ></applet> */

public class SimpleInterest extends Applet{
		Label l1;
		Label l2;
		Label l3;
		Label l4;
		TextField t1;
		TextField t2;
		TextField t3;
		Button b1;
	
	
	public void init(){
	
	l1=new Label("Enter Principle: ");
	l2=new Label("Enter Rate: ");
	l3=new Label("Enter Time: ");
	l4=new Label("");
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	b1=new Button("Calculate");
	
	setLayout(null);
	
	l1.setBounds(50,50,150,30);
	l2.setBounds(50,150,150,30);
	l3.setBounds(50,250,150,30);
	t1.setBounds(240,50,150,30);
	t2.setBounds(240,150,150,30);
	t3.setBounds(240,250,150,30);
	b1.setBounds(250,350,80,30);
	l4.setBounds(50,400,200,30);
	
	add(l1);
	add(l2);
	add(l3);
	add(t1);
	add(t2);
	add(t3);
	add(b1);
	add(l4);
	
	b1.addActionListener(new MyHandler());
	}
	
	class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
		int p=Integer.parseInt(t1.getText());
		int r=Integer.parseInt(t2.getText());
		int t=Integer.parseInt(t3.getText());
		double si=(p*r*t)/100;
		l4.setText("Simple Interest is: "+si);
	}
	}
}