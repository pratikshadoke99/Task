public class star1 
{
          public static void main(String[] args)
          {
                    
                    for(int i=0;i<4;i++)
                    {
                              
                              for(int j=0;j<4;j++)
                              {
                                        if(i>j)
                                        System.out.print("");
                                        else
                                        System.out.print("*");
                                        
                              }
                          System.out.println("");
                    }
                    
                    for (int i= 4; i>= 1; i--)  
                    {  
                              for (int j=4; j>i;j--)  
                              {  
                                        System.out.print(" ");  
                              }  
                              for (int k=1;k<=i;k++)  
                              {  
                                        System.out.print("*");  
                              }  
                              System.out.println("");  
                    } 
                     
          }
}
