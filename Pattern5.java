https://nados.io/question/pattern-5

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n/2;
        int st=1;
        // write ur code here

        for(int x=1;x<=n;x++)
        {
            for(int y=1;y<=sp;y++)
            {
                System.out.print("\t");
            }
            for(int y=1;y<=st;y++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            if(x<=(n/2))
            {
                st=st+2;
                sp=sp-1;
            }
            else
            {
                st=st-2;
                sp=sp+1;
            }
        }

    }
}