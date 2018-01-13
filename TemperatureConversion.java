
/* Program :- Write a Java program to create an Applet which takes temperature in Celsius
 and converts it into Fahrenheit (The formula for Celsius to Fahrenheit conversion is 
 5 * C = 9 * (F — 32), where C is Celsius temperature and F is Fahrenheit temperature. 
  
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
import java.awt.event.*;
import java.awt.*;

/*<applet code="TemperatureConversion" width="500" height="250"></applet>*/

public class TemperatureConversion extends Applet{
	Label l1,l2;
	TextField t1;
	Button b1;
	
	public void init(){
		l1=new Label("Enter Temperature in Celcious: ");
		l2=new Label("");
		t1=new TextField();
		b1=new Button("Convert");
		
		setLayout(null);
		
		l1.setBounds(50,50,200,30);
		t1.setBounds(280,50,100,30);
		b1.setBounds(200,100,70,30);
		l2.setBounds(150,180,200,30);
		
		add(l1);
		add(l2);
		add(t1);
		add(b1);
		
		b1.addActionListener(new MyHandler());
	}
	
	class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double var=Double.parseDouble(t1.getText());
			l2.setText("In Fahrenheit is: "+(var*1.8+32)+"F");
		}
	}
}
