package bank;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class msg {
	JFrame optionpane;
	msg()
	{
		optionpane=new JFrame();
		//JOptionPane.showMessageDialog(optionpane,"hello,welcome to edubridge");
		//JOptionPane.showMessageDialog(optionpane,"Successfully Updated.","edubridgeindia",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showInputDialog(optionpane,"Enter your name");	
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new msg();
	}

}
