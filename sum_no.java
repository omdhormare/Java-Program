import java.util.*;
class sum
{
        public static void main(String[] args)
            {
                      int sum=0,n,i;
                      Scanner s=new Scanner(System.in);
                      System.out.print("Enter Number : " );
                      n=s.nextInt();
                     for(i=1;i<=n;i++)
                   {
                           sum=sum+i;
                   }
                 System.out.println("Sum Of Number : "+sum);
            }
}