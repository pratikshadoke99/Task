import java.util.Scanner;
class main1
{
          public static void main(String args[])
          {
                    addtion a=new addtion();
                    a.add();
                    multiplication m=new multiplication();
                    m.mul();
                    substraction s=new substraction();
                    s.sub();
                    division d=new division();
                    d.div();
                    
          }
}
class addtion
{
       void add()
       {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any two integer");
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("addtion=");
       System.out.println(a+b);
       }  
}
class multiplication
{
       void mul()
       {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any two integer");
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("multiplication=");
        System.out.println(a*b);
       }  
}
class substraction
{
       void sub()
       {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any two integer");
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("substraction=");
        System.out.println(a-b);
       }  
}
class division
{
       void div()
       {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any two integer");
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("division=");
        System.out.println(a/b);
       }  
}
