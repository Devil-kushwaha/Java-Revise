https://nados.io/question/pythagorean-triplet

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int h,p,base;

    if(a>b && a>c)
    {
      h=a;
      p=b;
      base=c;
    }
    else if(b>a && b>c)
    {
      h=b;
      p=a;
      base=c;
    }
    else
    {
      h=c;
      p=a;
      base=b;
    }

    if((h*h)==(p*p)+(base*base))
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }

   }
  }