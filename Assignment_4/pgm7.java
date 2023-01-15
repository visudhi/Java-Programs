//Define a method to find out if a number is prime or not.
import java.util.Scanner;
public class pgm7
{

    public static void main(String[] args)
    {
        int x;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number");
        x=sc.nextInt();
        sc.close();
        isPrime(x);
    }
    
    static void isPrime(int x)
    {
        int i=2,count=0;
        while(i<x)
        {
        
            if(x%i==0)
            {
                count++;
                break;
            }
            i++;
        }
        

        if(count==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("Not prime");
        }

        
        
    }

}