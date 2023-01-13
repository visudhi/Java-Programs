//pgm to find perfect number

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm32 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int x= sc.nextInt();
        int n=1;
        int sum=0;
        sc.close();
        while(x%n==0)
        {
            sum+=n;
            if(sum==n)
            {
            System.out.println("Perfect number");
            }
            n++;
        }

    }
}