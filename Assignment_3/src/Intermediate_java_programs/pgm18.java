//pgm to find find Ncr and Npr
//Npr = N!/(N-r)!
//Ncr= N!/(r!*(N-r)!)
//N!=N*(N-1)*(N-2)*(N-3).....0! 

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm18
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int fact=1,fact1=1,fact2=1,N,r,x,Npr,Ncr; //int i=1;
        System.out.println("enter a number");
        N=sc.nextInt();
        sc.close();
        System.out.println("enter the value of r");
        r=sc.nextInt();
        x=N-r;
        while(N!=0)
        {
            fact=fact*N;
            N--;
        }  
        while(x!=0)
        {
            fact1=fact1*(x);
            (x)--;
        }
        Npr=(fact)/(fact1);
        System.out.println(Npr);

        while(r!=0)
        {
            fact2=fact2*r;
            r--;
        }
        Ncr=Npr/fact2;
        System.out.println(Ncr);

    }
}