//pgm to find compound interest

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm13
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double ci,p,t,r,n;
        System.out.println("enter the principle");
        p=sc.nextDouble();
        System.out.println("enter the time in years");
        t=sc.nextDouble();
        System.out.println("enter the rate");
        r=sc.nextDouble();
        System.out.println("Enter the no of times interest is compounded yearly");
        n=sc.nextDouble();

        ci=p*(Math.pow((1+(r/n)),n*t));
        double amount=ci+p;
        System.out.println("The compound interest is "+ci);
        System.out.println("The amount after "+t+" years is "+amount);
        sc.close();

    }



}
