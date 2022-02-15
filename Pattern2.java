https://nados.io/question/pattern-2

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n=sc.nextInt();
        for(int x=1;x<=n;x++)
        {
            for(int y=n;y>=x;y--)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}