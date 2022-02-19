https://nados.io/question/any-base-to-decimal

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here


   int i=1;
   int sum=0;

      while(n!=0)
      {
         int r=n%10;
         int add=r*i;
         sum=sum+add;
         n=n/10;
         i=i*b;
      }

      return sum;
   }
  }