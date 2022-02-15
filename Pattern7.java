https://nados.io/question/pattern-7

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n=sc.nextInt();
        int sp=0;
        int st=1;

        for(int x=1;x<=n;x++)
        {
            for(int y=1;y<=x;y++)
            {
                if(x==y)
                {
                    System.out.print("*\t");
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