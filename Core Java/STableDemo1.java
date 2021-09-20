package bank;

import javax.swing.*;    
public class STableDemo1 
{    
    /*JFrame table_f;    
    STableDemo1(){    
    table_f=new JFrame();    
    String table_data[][]={ {"1001","Cherry"}, {"1002","Candy"}, {"1003","Coco"}};    
    String table_column[]={"SID","SNAME"};         
    JTable table_jt=new JTable(table_data,table_column);    
    table_jt.setBounds(30,40,200,300);          
    JScrollPane table_sp=new JScrollPane(table_jt);    
    table_f.add(table_sp);          
    table_f.setSize(300,400);    
    table_f.setVisible(true);    
}     */
	/*STableDemo1()
	  {  
	        JFrame list_f= new JFrame();  
	        DefaultListModel<String> list_l1 = new DefaultListModel<>();  
	        list_l1.addElement("Red");  
	        list_l1.addElement("Pink");  
	        list_l1.addElement("Blue");  
	        list_l1.addElement("Black");  
	        
	        JList<String> list1 = new JList<>(list_l1);  
	        list1.setBounds(100,100, 75,75); 
	        
	        list_f.add(list1);  
	        list_f.setSize(400,400);  
	        list_f.setLayout(null);  
	        list_f.setVisible(true); 
	  }*/
public static void main(String[] args) 
{    
	JFrame password=new JFrame("password field demo");
	JPasswordField pass_val=new JPasswordField();
	JLabel l1=new JLabel("password");
	l1.setBounds(20,100,100,30);
	pass_val.setBounds(100, 100, 100, 30);
	password.add(pass_val);
	password.add(l1);
	password.setSize(300,300);
	password.setLayout(null);
	password.setVisible(true);
    new STableDemo1();    
}    
}