https://nados.io/question/pattern-3

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n=sc.nextInt();

        for(int x=n;x>=1;x--)
        {
            for(int y=1;y<=n;y++)
            {
                if(y>=x)
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