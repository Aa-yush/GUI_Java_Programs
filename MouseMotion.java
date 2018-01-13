
/* Program :- Program using Applet show motion dragged and Mouse moved cordinates
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
/*<applet code="MouseMotion" width="500" height="500"></applet>*/

public class MouseMotion extends Applet{
	Label l1;
	Label l2;
	
	public void init(){
		l1=new Label();
		l2=new Label();
		
		setLayout(null);
		
		l1.setBounds(20,20,200,40);
		l2.setBounds(240,20,190,40);
		
		
		add(l1);
		add(l2);
		
		addMouseMotionListener(new MyHandler());
	}
	
	class MyHandler implements MouseMotionListener{
		public void mouseDragged(MouseEvent e){
			l1.setText("Mouse Dragged :- "+"("+e.getX()+","+e.getY()+")");
			
		}
		
		public void mouseMoved(MouseEvent e){
			l2.setText("Mouse Moved :- "+"("+e.getX()+","+e.getY()+")");
		}
	}
}