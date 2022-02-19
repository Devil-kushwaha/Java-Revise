https://nados.io/question/decimal-to-any-base

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int b=sc.nextInt();
      int value=getValueInBase(n,b);
      System.out.println(value);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int val=0;
       int noz=1;
       while(n!=0)
       {
           int r=n%b;
            val=r*noz+val;
            noz=noz*10;
            n=n/b;
       }
       return val;

   }
  }