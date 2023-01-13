//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class pgm7 {
    public static void main(String[] args) {
       // 0,1,1,2,3,5,8,13,21
        int c=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to generate fibonacci series");
        n=sc.nextInt();
        int a=0;
        int b=1;

        System.out.println("fibonacci series upto "+n+" is :-");

        while(c<=n){
            System.out.println(c+"");
            a=b;
            b=c;
            c=a+b;
        }

    }
}
