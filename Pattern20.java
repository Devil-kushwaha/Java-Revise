https://nados.io/question/pattern-20

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n=sc.nextInt();
        int mid=n/2+1;

        for(int x=1;x<=n;x++)
        {
            for(int y=1;y<=n;y++)
            {
                if(y==1||y==n)
                {
                    System.out.print("*\t");
                }
                else if(y==mid && x==mid)
                {
                    System.out.print("*\t");
                }
                else if(x>mid)
                {
                    if((x+y)==(n+1)||x==y)
                    {
                    System.out.print("*\t");
                    }
                    else
                    {
                    System.out.print("\t");
                    }
                }
                else
                {
                    System.out.print("\t");
                }
                
            }
            System.out.println();
        }

    }
}