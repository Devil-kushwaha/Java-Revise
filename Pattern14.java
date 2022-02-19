https://nados.io/question/pattern-14

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n=sc.nextInt();
        int mult=1;
        for(int x=1;x<=10;x++)
        {
            mult=n*x;
            System.out.println(n+" * "+x+" = "+mult);
        } 

    }
}