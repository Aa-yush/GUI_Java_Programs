
/* Program :- Concept of Flow Layouts of Applet   
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
/*<applet code="FlowLayoutManager" width="500" height="500"></applet>*/
public class FlowLayoutManager extends Applet{

		public void init(){
			
		FlowLayout fl=new FlowLayout();
		
		setLayout(fl);
		
		Button b1=new Button("Add");
		Button b2=new Button("Multiply");
		Button b3=new Button("Substraction");
		Button b4=new Button("Division");
		
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
	}
		
}