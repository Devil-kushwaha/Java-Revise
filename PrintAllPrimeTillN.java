/* https://nados.io/question/print-all-primes-till-n */

import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int flag=0;

        for(int x=low;x<=high;x++)
        {
            flag=0;
            for(int y=2;y*y<=x;y++)
            {
                if(x%y==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(x);
            }
        }
    }
}