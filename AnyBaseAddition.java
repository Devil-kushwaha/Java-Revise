https://nados.io/question/any-base-addition

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int c=0,i=1,sum=0;
       while(n1!=0||n2!=0)
       {
           int r1=n1%10;
           int r2=n2%10;
           int add=r1+r2+c;
           if(add>=b)
           {
               c=1;
           }
           else
           {
               c=0;
           }
           int r=add%b;
           sum=r*i+sum;
           n1=n1/10;
           n2=n2/10;
           i=i*10;
       }
           sum=c*i+sum;
       return sum;
   }
  }