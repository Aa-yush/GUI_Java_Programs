/* Program :- Performed all operations of Calculator using GUI
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
import java.awt.event.*;

public class Calculator implements ActionListener{
	
static String ops ="",var1 = "",var2 = ""; // class members 
static TextField t1=new TextField();    // class member

	public static void main(String[] args){		
		Frame f1=new Frame("Calculator");    // Frame with titile Calculator
		f1.setSize(450,560);   // Size of Frame
		f1.setResizable(false);  // Restrict to size expand
		f1.setVisible(true);    // make visible Frame
		
		Font font1 = new Font("SansSerif", Font.BOLD, 28); // Object of TextField
		t1.setFont(font1);    				// set FontSize of Text Field
		Button B1=new Button("0");  		// Button 0
		Button B2=new Button("1");  		// Button 1
		Button B3=new Button("2");  		// Button 2
		Button B4=new Button("3");  		// Button 3
		Button B5=new Button("4");  		// Button 4
		Button B6=new Button("5");  		// Button 5
		Button B7=new Button("6");  		// Button 6
		Button B8=new Button("7");  		// Button 7
		Button B9=new Button("8");  		// Button 8
		Button B10=new Button("9");  		// Button 9
		Button B11=new Button(".");  		// Button .
		Button B12=new Button("/");  		// Button /
		Button B13=new Button("*");  		// Button *
		Button B14=new Button("+");  		// Button +
		Button B15=new Button("-");  		// Button -
		Button B16=new Button("=");  		// Button =
		Button B17=new Button("Clear");  	// Button Clear
		
		f1.setLayout(null);   				// set own Layout 
		t1.setBounds(20,30,350,100);  		//set Layout
		B17.setBounds(370,30,50,100);  		//set Layout
 		B8.setBounds(20,130,100,100);  		//set Layout
		B9.setBounds(120,130,100,100); 		//set Layout
		B10.setBounds(220,130,100,100); 	//set Layout
		B12.setBounds(320,130,100,100);  	//set Layout
		B5.setBounds(20,230,100,100);  		//set Layout
        B6.setBounds(120,230,100,100); 		//set Layout
		B7.setBounds(220,230,100,100); 		//set Layout
		B13.setBounds(320,230,100,100); 	//set Layout
		B2.setBounds(20,330,100,100); 		//set Layout
		B3.setBounds(120,330,100,100);  	//set Layout
		B4.setBounds(220,330,100,100); 		//set Layout
		B15.setBounds(320,330,100,100); 	//set Layout
		B11.setBounds(20,430,100,100); 		//set Layout
		B1.setBounds(120,430,100,100); 		//set Layout
		B16.setBounds(220,430,100,100);  	//set Layout
		B14.setBounds(320,430,100,100); 	//set Layout


		f1.add(t1); // add button on Frame
		f1.add(B17);
		f1.add(B8);
		f1.add(B9);
		f1.add(B10);
		f1.add(B12);
		f1.add(B5);
		f1.add(B6);
		f1.add(B7);
		f1.add(B13);
		f1.add(B2);
		f1.add(B3);
		f1.add(B4);
		f1.add(B15);		
		f1.add(B11);
		f1.add(B1);
		f1.add(B16);
		f1.add(B14);
		
		B1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		String str="0";  
		String s=t1.getText();   // get value of TextField
		t1.setText(s+str);   // Add more values
		
		
		}
		});

		B2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		String str="1";
		String s=t1.getText();	// get value of TextField
		t1.setText(s+str);   // Add more values
		
		
		}
		});
		
		B3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
		String str="2";
		
		String s=t1.getText();	// get value of TextField
		t1.setText(s+str);  // Add more values
		
		}
		});
		
		B4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
		String str="3";
		
		String s=t1.getText();	// get value of TextField
		t1.setText(s+str);   // Add more values
		
		}
		});
		
		B5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
		String str="4";
		
		String s=t1.getText();	// get value of TextField
		t1.setText(s+str);  // Add more values
		
		}
		});
		
		
		B6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
		String str="5";
		
		String s=t1.getText();	// get value of TextField
		t1.setText(s+str);  // Add more values
		
		}
		});
		
		B7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
		String str="6";
		
		String s=t1.getText();	// get value of TextField
		t1.setText(s+str);  // Add more values
		
		}
		});
		
		B8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
		String str="7";
		
		String s=t1.getText();	// get value of TextField
		t1.setText(s+str);  // Add more values
		
		}
		});
		
		B9.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
		String str="8";
		
		String s=t1.getText();	// get value of TextField
		t1.setText(s+str);  // Add more values
		
		}
		});
		
		B10.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
		String str="9";
		
		String s=t1.getText();	// get value of TextField
		t1.setText(s+str);  // Add more values
		
		}
		});
		
		B11.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
		String str=".";
		
		String s=t1.getText();	// get value of TextField
		t1.setText(s+str);  // Add more values
		
		}
		});
		
		B17.addActionListener(new ActionListener(){   // clear button
		public void actionPerformed(ActionEvent e){
			
		String str=null;		
		t1.setText(str);   // set textField null
		
		}
		});
		
		f1.addWindowListener(new WindowAdapter(){   // Closing Function
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
		});
		
		
		Calculator c = new Calculator();
		B14.addActionListener(c);
		B16.addActionListener(c);
		B15.addActionListener(c);
		B13.addActionListener(c);
		B12.addActionListener(c);
	} // End of main function

	public void actionPerformed(ActionEvent e){
	if(e.getActionCommand()=="+"){ // gives you a String representing the action command
	ops="+";                       // assign "+" as String in ops variable
	var1 = t1.getText();           // first number will be assign in var1
	t1.setText("");                // set textField blank 
	}
	else if (e.getActionCommand()=="-"){
		ops="-";
		var1=t1.getText();
		t1.setText("");
	}
	else if(e.getActionCommand()=="*"){
		ops="*";
		var1=t1.getText();
		t1.setText("");
	}
	else if( e.getActionCommand()=="/"){
		ops="/";
		var1=t1.getText();
		t1.setText("");
	}
		if(e.getActionCommand() == "="){
		switch(ops){
		case "+":String data=(Float.valueOf(var1)+Float.valueOf(t1.getText()))+"";
				t1.setText(data);
				break;
		
		case "-":String data1=(Float.valueOf(var1)-Float.valueOf(t1.getText()))+"";
				t1.setText(data1);
				break;
		
		case "*":String data2=(Float.valueOf(var1)*Float.valueOf(t1.getText()))+"";
				t1.setText(data2);
				break;
				
		case "/":String data3=(Float.valueOf(var1)/Float.valueOf(t1.getText()))+"";
				t1.setText(data3);
				break;
		
		}
	}
	
	}
} // End of class