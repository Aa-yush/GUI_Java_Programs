
/* Program :- Concept of Grid Layout of Applet   
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
/*<applet code="GridLayoutManager" width="300" height="300"></applet>*/
public class GridLayoutManager extends Applet{

		public void init(){
			
		GridLayout gl=new GridLayout();
		
		setLayout(gl);
		
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