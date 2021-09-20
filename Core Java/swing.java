package bank;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.*;

import javax.swing.*;

//public class swing {
	public class swing extends Frame implements MouseMotionListener{
	/*public swing()
	{
		//JFrame jf = new JFrame("Edubridge Learning Pvt Ltd"); 
		setTitle("Edubridge Learning Pvt Ltd");//Creating a JFrame with name MyWindow
		JButton btn = new JButton("button");//Creating a Button named Say Hello
		add(btn);                            //adding button to frame
		setLayout(new FlowLayout());        //setting layout using FlowLayout object
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //setting close  operation.
		setSize(400, 400);                   //setting size
		setVisible(true);                    //setting frame visibility
	}*/
		/*public swing()
		{
		 JButton bt=new JButton("Yes");
		 JButton bt1=new JButton("No");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLayout(new FlowLayout());          //setting layout using FlowLayout object
		    setSize(400, 400);                    //setting size of Jframe
		    add(bt);             //adding Yes button to frame.
		    add(bt1);             //adding No button to frame.

		    setVisible(true);
		 
		 
		}*/
		/*public swing()
		{
		 JTextField jtf = new JTextField(20);  //creating JTextField.
		    add(jtf);                             //adding JTextField to frame.
		    setLayout(new FlowLayout());
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setSize(400, 400);
		    setVisible(true);
		}*/
		/*public swing()
		{
		JCheckBox jcb = new JCheckBox("yes");   //creating JCheckBox.
	    add(jcb);                               //adding JCheckBox to frame.
	    jcb = new JCheckBox("no");              //creating JCheckBox.
	    add(jcb);                               //adding JCheckBox to frame.
	    jcb = new JCheckBox("maybe");           //creating JCheckBox.
	    add(jcb);                               //adding JCheckBox to frame.
	    setLayout(new FlowLayout());
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(400, 400);
	    setVisible(true);
		}*/
		/*public swing()
		{
		 JRadioButton jcb = new JRadioButton("A");	//creating JRadioButton.
		  add(jcb);					//adding JRadioButton to frame.
		  jcb = new JRadioButton("B");			//creating JRadioButton.
		  add(jcb);					//adding JRadioButton to frame.
		  jcb = new JRadioButton("C");			//creating JRadioButton.
		  add(jcb);					//adding JRadioButton to frame.
		  jcb = new JRadioButton("none");
		  add(jcb);
		  setLayout(new FlowLayout());
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setSize(400, 400);
		  setVisible(true);
		}*/
		/*public swing()
		{
			 Frame ck_groupf= new Frame("Edubridge : CheckboxGroup");    
			    CheckboxGroup obj = new CheckboxGroup();  
			    Checkbox ckBox1 = new Checkbox("Yes", obj, true);    
			    ckBox1.setBounds(100,100, 50,50);    
			    Checkbox ckBox2 = new Checkbox("No", obj, false);    
			    ckBox2.setBounds(100,150, 50,50);   
			    Checkbox ckBox3 = new Checkbox("Maybe", obj, true);    
			    ckBox3.setBounds(100,400, 50,50); 
			   
			    ck_groupf.add(ckBox1);    
			    ck_groupf.add(ckBox2);    
			    ck_groupf.add(ckBox3); 
			    ck_groupf.setSize(400,400);    
			    ck_groupf.setLayout(null);    
			    ck_groupf.setVisible(true);  
		}*/
		public swing()
		{
		addMouseMotionListener(this);  

	    setSize(800,800);  
	    setLayout(null);  
	    setVisible(true);  
	  }  
	  @Override
	  public void mouseDragged(MouseEvent a) {  
	    Graphics mM_g=getGraphics();  
	    mM_g.setColor(Color.PINK);  
	    mM_g.fillOval(a.getX(),a.getY(),30,30);  
	  }  
	 
	  public void mouseMoved(MouseEvent e) {
	  	// TODO Auto-generated method stub
	  	
	  } 
	
	  public static void main(String[] args) {  
	    new swing();  
	  }
	 
	}
	


