/* Write a function that returns all 
prime numbers between two given numbers.*/
import java.util.Scanner;
public class pgm13
{
  public static void main(String[] args) 
  {  
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a range (2 numbers) to find the prime numbers between them");
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.close();
            for(int i=a;i<=b;i++)
            {
                if(checkPrime(i))
                {
                    System.out.print(i+" " );
                }
            }
  }
	public static boolean checkPrime(int num)
            {
            
            // 0, 1 and negative numbers are not prime
            if(num<2)
                {
                    return false;
                }
            else
                {
                int x= num/2;
                for(int i=2;i<x;i++)
                    {
                    if(num%i==0)
                        {
                        return false;
                        }
                    }
	            }
	    // the number would be prime if we reach here
	            return true;
	        }
}
