/*Write a function that returns the sum of first n natural numbers. */
import java.util.Scanner;
public class pgm14 
{
    public static void main(String[] args) 
    {
        //1+2+3+4
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number upto which the sum is to be printed");
        int x= sc.nextInt();
        sc.close();
        System.out.println(nSum(x));
            
        

    }
    static int nSum(int x)
    {
        int sum=0;
        for(int i=0;i<=x;i++)
        {
            sum+=i;

        }

        return sum;
    }

}
