https://nados.io/question/pattern-17

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n=sc.nextInt();
        int sp=n/2;
        int i=1;
        for(int x=0;x<n;x++)
        {
            if(x!=n/2)
            {
                for(int y=1;y<=sp;y++)
                {
                System.out.print("\t");
                }
            }
            else
            {
                for(int y=1;y<=sp;y++)
                {
                    System.out.print("*\t");
                }
            }

            for(int y=1;y<=i;y++)
            {
                System.out.print("*\t");
            }
            if(x>=n/2)
            {
                i--;
            }
            else
            {
                i++;
            }
            System.out.println();
            
        }

    }
}