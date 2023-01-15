//Write a program to print the sum of two numbers 
//entered by user by defining your own method.
import java.util.Scanner;
public class pgm04
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        add(x,y);
        sc.close();
    }

    static void add(int x1,int y1)
    {
        int sum1=x1+y1;
        System.out.println("sum of "+x1+" and "+y1+" is "+sum1);
    }
}
