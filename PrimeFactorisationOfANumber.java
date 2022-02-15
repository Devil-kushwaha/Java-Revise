https://nados.io/question/prime-factorisation-of-a-number

import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=2;

  while(n!=1)
  {
    if(n%m==0)
    {
      System.out.print(m+" ");
      n=n/m;
    }
    else
    {
      m++;
    }
  }
 }
}