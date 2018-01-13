

/* Program :- Using applet show cordinates where mouse clicked
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
import java.awt.event.*;
import java.applet.*;
/*<applet code="MouseCoordinates" width="500" height="500"></applet>*/

public class MouseCoordinates extends Applet{
	Label l1;
	Label l2;
	
	public void init(){
		l1=new Label();
		l2=new Label();
		
		setLayout(null);
		
		l1.setBounds(30,30,60,40);
		l2.setBounds(100,30,60,40);
		
		add(l1);
		add(l2);
		
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				l1.setText("X= "+e.getX());
				l2.setText("Y= "+e.getY());
			}
		});
	}
}