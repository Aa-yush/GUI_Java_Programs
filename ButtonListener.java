/* Program :-Event Handling on button using Applet   
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


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="ButtonListener" width="500" height="500"> </applet> */

public class ButtonListener extends Applet{
	
	Label l1;
	public void init(){
		Button b1=new Button("Click me");
		l1=new Label();
	
	setLayout(null);
	
	b1.setBounds(30,30,400,400);
	l1.setBounds(50,450,100,30);
	
	add(b1);
	add(l1);
	
	b1.addActionListener(new MyHandler());
	}
	class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String str=new String("Button is Pressed");
			l1.setText(str);
			
		}
	}
}
