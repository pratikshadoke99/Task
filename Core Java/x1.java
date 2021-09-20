import java.util.Scanner;
class  x1
{
          public static void main(String[] args)
          {
                    for(int i=0;i<5;i++)
                    {
                              for(int j=0;j<5;j++)
                              {      
                                      
                                        //if(j==i || j==3-i+1)
                                        if(i==j || i+j==4)
                                        System.out.print("*");
                                        System.out.print(" ");
                              }
                    System.out.println();
	          }            
         }
}
