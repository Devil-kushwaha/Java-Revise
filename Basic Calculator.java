import java.util.Scanner;
class Basic_Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter yout choice\n1-Add\n2-Subtract\n3-Multiply\n4-Divide");
        int ch=sc.nextInt();
        System.out.println("Enter two numbers");
        int a =sc.nextInt();
        int b=sc.nextInt();
        if(ch==1){
            System.out.println(a+b);
        }
        else if(ch==2){
            System.out.println(a-b);
        }
        else if(ch==3){
            System.out.println(a*b);
        }
        else if(ch==4){
            System.out.println(a/b);
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}