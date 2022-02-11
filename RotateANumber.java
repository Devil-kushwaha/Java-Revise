/* https://nados.io/question/rotate-a-number */

import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     // write your code here  
     int n=sc.nextInt();
     int k=sc.nextInt();

 

     String ns=Integer.toString(n);
     int len=ns.length();

     if(k>len)
     {
       k=k%len;
     }

     if(k==0)
     {
       System.out.println(n);
     }

     else if(k>0)
     {
        for(int x=1;x<=k;x++)
        {
          int d=n%10;
          n=n/10;
          n=d*(int)Math.pow(10,len-1)+n;
        }
        System.out.println(n);
     }

      else
      {
        k=k*(-1);
        for(int x=1;x<=k;x++)
        {
          int div=(int)Math.pow(10,len-1);
          int d=n/div;
          n=n%div;
          n=n*10+d;
        }
        System.out.println(n);
      }

    }
   }