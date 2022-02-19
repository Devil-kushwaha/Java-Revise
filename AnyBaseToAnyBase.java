https://nados.io/question/any-base-to-any-base

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int decimal=sourceToDecimal(n,sourceBase);
     int dest=decimalToDest(decimal,destBase);
     System.out.println(dest);
   }   

   //Converting number from source base to decimal

   public static int sourceToDecimal(int n,int b)
   {
     int i=1;
     int sum=0;
     while(n!=0)
     {
       int r=n%10;
        int add=r*i;
        sum=sum+add;
        i=i*b;
        n=n/10;
     }
     return sum;
   }

   //Converting number from decimal to destination base

   public static int decimalToDest(int n,int b)
   {
     int i=1;
     int sum=0;
     while(n!=0)
     {
       int r=n%b;
       int add=r*i;
       sum=sum+add;
       i=i*10;
       n=n/b;
     }
     return sum;
   }
   
  }