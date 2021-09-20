package bank;

public class join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 
		  Pranita1 p=new Pranita1();
		  Gunjan g=new Gunjan();
		  Ragini r=new Ragini();
		  
		  p.start();
		  try{
			  p.join();
		  }
		  catch(Exception e){
			  System.out.println(e);
		  }
		  g.start();
		  
		  r.start();
		  try{
			  g.join();
		  }
		  catch(Exception e){
			  System.out.println(e);
		  }
	}
}
	   

class Pranita1 extends Thread {
	public void run(){
		for(int i=1;i<=5;i++)
		{
			System.out.println("This is Pranita C : "+i);
		
	}
	
}
}
class Gunjan extends Thread{
	public void run(){
		for(int i=1;i<=5;i++)
		{
			System.out.println("This is Gunjan : "+i);
			
		}
	}
}

class Ragini extends Thread{
	public void run(){
		for(int i=1;i<=5;i++)
		{
			System.out.println("This is Ragini : "+i);
			
		}
	}
}
