package bank;

public class throw1 {
	public static void check(int age) {
		if(age<18) {
			throw new ArithmeticException("sorry you are not eligible");
		}
		else {
			System.out.println("welcome to the part of vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(100);
		System.out.println("rest of the code");

	}

}
