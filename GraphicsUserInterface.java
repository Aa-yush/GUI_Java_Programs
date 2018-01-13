
/* Program to understand "Concept of CheckBox in GUI"  
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
/*<applet code="GraphicsUserInterface" width="500" height="500"></applet>*/
public class GraphicsUserInterface extends Applet{
	public void init(){
		Choice shoping = new Choice();
		shoping.addItem("Clothing");
		shoping.addItem("Bed");
		shoping.addItem("Sofa");
		shoping.addItem("shoes");
		shoping.addItem("Books");
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox c1=new Checkbox("Male",cbg,false);
		Checkbox c2=new Checkbox("female",cbg,false);
		Checkbox c3=new Checkbox("Other",cbg,true);
		
		TextArea ta=new TextArea();
		
			add(c1);
			add(c2);
			add(c3);	
			add(shoping);
			add(ta);
		}		
	public void paint(Graphics g){
		Font f=new Font("Arial",Font.BOLD,20); 	// Font Object 
		g.setColor(Color.red); 					//To set the Text as Red
		g.setFont(f);  							// set Font for String
		g.drawString("Red Color String",50,100); // To print a String
		g.drawLine(50,70,50,120);  				// To Draw a Line(x1,y1,x2,y2)
		g.drawRect(200,200,50,30); 				// draw rectangle(x,y,width,height)
		g.drawOval(200,300,90,90); 				// Draw Circle		
	}
}