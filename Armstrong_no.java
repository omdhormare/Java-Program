import java.util.*;
class check
{
         public static void main(String[] args)
           {
                    int sum=0,n1,n,d;
                     Scanner s=new Scanner(System.in);
                      System.out.print("Enter Number : ");
                      n=s.nextInt();
                      n1=n;
                      while(n>0)                      
                      {
                           d=n%10;
                            sum=sum+d*d*d;
                           n=n/10;      
                       }
                   if(sum==n1)
                         System.out.print("Armstrong Number...");
                   else
                          System.out.print("Not Armstrong Number...");            
           }
}