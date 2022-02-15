https://nados.io/question/pattern-6

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int st=n/2+1;
        int sp=1;

        for(int x=1;x<=n;x++)
        {
            for(int y=1;y<=st;y++)
            {
                System.out.print("*\t");
            }
            for(int y=1;y<=sp;y++)
            {
                System.out.print("\t");
            }
            for(int y=1;y<=st;y++)
            {
                System.out.print("*\t");
            }
            System.out.println();

            if(x<=n/2)
            {
                sp=sp+2;
                st=st-1;
            }
            else
            {
                sp=sp-2;
                st=st+1;
            }

        }

        // write ur code here

    }
}