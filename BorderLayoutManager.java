/* Program :- Concept of Border Layouts of Applet   
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
/*<applet code="BorderLayoutManager" width="500" height="500"></applet>*/
public class BorderLayoutManager extends Applet{

		public void init(){
			
		BorderLayout bl=new BorderLayout(20,20);
		
		setLayout(bl);
		
		Button b1=new Button("Add");
		Button b2=new Button("Multiply");
		Button b3=new Button("Substraction");
		Button b4=new Button("Division");
		
		
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		
	}
		
}