package bank;

import javax.swing.*;  
class SMenuDemo1  
{  
  JMenu m_menu, m_submenu;  
  JMenuItem menu_i1, menu_i3, menu_i4, menu_i5,menu_i6,menu_i7,menu_i8;  
  SMenuDemo1()
  {  
    JFrame menu_f= new JFrame("Menu and MenuItem Example");  
    JMenuBar menu_mb=new JMenuBar();  
    m_menu=new JMenu("Country");  
    m_submenu=new JMenu("maharastra");  
    menu_i1=new JMenuItem("goa");  
    //menu_i2=new JMenuItem("maharastra");  
    menu_i3=new JMenuItem("tamilnadu");  
    menu_i4=new JMenuItem("pune");  
    menu_i5=new JMenuItem("mumbai");
    menu_i6=new JMenuItem("thane"); 
    menu_i7=new JMenuItem("Yavatmal"); 
    m_menu.add(menu_i1); 
    //m_menu.add(menu_i2); 
    m_menu.add(m_submenu);
    m_menu.add(menu_i3);  
    m_submenu.add(menu_i4); 
    m_submenu.add(menu_i5); 
    m_submenu.add(menu_i6);
    m_submenu.add(menu_i7);
    //m_menu.add(m_submenu);  
    menu_mb.add(m_menu);  
    menu_f.setJMenuBar(menu_mb);  
    menu_f.setSize(500,500);  
    menu_f.setLayout(null);  
    menu_f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new SMenuDemo1();  
  }
}