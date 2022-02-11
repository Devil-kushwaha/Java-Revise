/* https://nados.io/question/print-fibonacci-numbers-till-n */

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0,b=1,sum=0;

      for(int x=1;x<=n;x++)
      {
        if(x==1)
        {
          System.out.println(a);
        }
        else if(x==2)
        {
          System.out.println(b);
        }
        else
        {
          sum=a+b;
          System.out.println(sum);
          a=b;
          b=sum;
        }
      }
   }
  }