https://nados.io/question/pattern-1

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // write ur code here
        for(int x=1;x<=n;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}