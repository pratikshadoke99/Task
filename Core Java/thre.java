package bank;

public class thre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number n=new number();
		alpha a=new alpha();
		n.start();
		a.start();
		
		System.out.println("get to know the state of threads");
		System.out.println(n.getState());
		System.out.println(a.getState());
		
		System.out.println("get to know the priority");
		System.out.println(n.getPriority());
		System.out.println(a.getPriority());
		
		System.out.println("print the name of thread");
		System.out.println(n.getName());
		System.out.println(a.getName());
		
		System.out.println("set the name");
		n.setName("pooja");
		a.setName("komal");
		
		System.out.println("current thread");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("get to know the set of thread ");
		System.out.println(n.getState());
		System.out.println(a.getState());
		
		System.out.println("finding live or alive state");
		if(n.isAlive()) {
			System.out.println("pooja thread is alive");
		}
		else
		{
			System.out.println("number thread is alive");
		}
		if(n.isAlive()) {
			System.out.println("komal thread is alive");
		}
		else
		{
			System.out.println("alpha thread is alive");
		}
	}

}
class number extends Thread{
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
}
class alpha extends Thread{
	public static char a='A';
	public void run() {
		
		for(a='A';a<='Z';++a)
			System.out.println(a);
		
	}
}
