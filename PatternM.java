https://nados.io/question/pattern-m

import java.util.*;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
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
                else if(x==mid && y==mid)
                {
                    System.out.print("*\t");
                }
                else if(x<mid)
                {
                    if(x==y||(x+y)==(n+1))
                    {
                        System.out.print("*\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}