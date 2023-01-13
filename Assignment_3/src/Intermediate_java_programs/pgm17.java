//pgm to find  factorial of a number

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm17
{
    public static void main(String[] args)
    {
        int N,fact=1,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        N=sc.nextInt();
        while(i<=N)
        {
        fact=fact*i;//while (i<=N or N!=0) fact=*N and N-- also works
           i++;
        }
        System.out.println(fact);
        
        
        
        sc.close();
    }
}
