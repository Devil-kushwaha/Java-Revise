https://nados.io/question/pattern-4

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // write ur code here
        for(int x=1;x<=n;x++)
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