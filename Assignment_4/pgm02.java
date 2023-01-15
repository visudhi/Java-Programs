//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
public class pgm02 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int x=sc.nextInt();
        sc.close();
        EvenOrOdd(x);
    }
    static int EvenOrOdd(int x)
    {
        if(x%2==0)
        {
            System.out.println(x+ " is an even number");
           
        }
        else if(x%2!=0)
        {
            System.out.println(x+" is an odd number");
           
        }
        return x;
        
    }
}
