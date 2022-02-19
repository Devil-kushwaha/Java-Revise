https://nados.io/question/pattern-12

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write ur code here
        int n=sc.nextInt();
        int a=0;
        int b=1;

        for(int x=1;x<=n;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print(a+"\t");
                int sum=a+b;
                a=b;
                b=sum;
            }
            System.out.println();
        }
    }
}