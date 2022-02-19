https://nados.io/question/any-base-subtraction

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int c=0;
       int diff=0;
       int d;
       int i=1;
       while(n2!=0)
       {
           int r2=n2%10;
           r2=r2+c;
           int r1=n1%10;
           if(r2>=r1)
           {
               d=r2-r1;
               c=0;
           }
           else
           {
               r2=r2+b;
               d=r2-r1;
               c=-1;
           }
           diff=i*d+diff;
           i=i*10;
           n2=n2/10;
           n1=n1/10;
       }
       return diff;
       
   }
  
  }