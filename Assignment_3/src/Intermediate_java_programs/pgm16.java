//pgm to find armstrong number

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm16
{
    public static void main(String[] args)
    {
        //153=1,5,3 =>1^3 + 5^3 + 3^3=153
        //  153/10=15  153%10=3
        //  15/10=1    15%10=5
        //  1/10=0     1%10=1
        int n,r,sum=0,n1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        n1=n;

        while(n!=0)
        {
            r=n%10;
            n=n/10;
            sum+=Math.pow(r, 3);
        }

        if(sum==n1)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("not an armstrong number");
        }

        sc.close();
        
        
    }
}
