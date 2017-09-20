/* Basic Skeleton of GUI */

import java.awt.*;

public class Skeleton {
  public static void main(String[] args){
	Frame f1=new Frame("Adding");  // object of Frame with title "Adding"
	f1.setSize(300,300);           // set frame size 500 height and 500 width
	f1.setVisible(true);           // set frame Visible make it false to invisible
	f1.setResizable(false);        // Restriction on maximization and extend size of frame 
	
	f1.setLayout(null); // To make your own layout
	Label l1=new Label("Enter First Number:");   // Make label
	Label l2=new Label("Enter Second Number:");
	Label l3=new Label("Sum is: ");
	TextField t1=new TextField();  // TextField
	TextField t2=new TextField();  // TextField
	Button b1=new Button("Add");   // Button
	
/*
   (20,70,120,20)= (Pixels x, pixels y, pixels width ,pixels height) 

*/	
	
	
	l1.setBounds(20,50,120,20);   //set Layout pixels 
	l2.setBounds(20,100,150,20);  //set Layout pixels 
	t1.setBounds(190,50,100,20);  // set TextField Pixels
	t2.setBounds(190,100,100,20); // set TextField Pixels
	b1.setBounds(130,150,70,30);   //set Button pixels
	l3.setBounds(50,180,150,30);  //set Layout pixels
	
	f1.add(l1); // add label  in frame
	f1.add(l2);  // add label2 in frame
	f1.add(t1); //add textfield in frame
	f1.add(t2); //add textfield in frame
	f1.add(b1); //add button in frame
	f1.add(l3); //// add label3  in frame
	
  }
}