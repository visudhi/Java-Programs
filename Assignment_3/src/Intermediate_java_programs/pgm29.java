//pgm to find hcf of 2 numbers

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm29
{
    public static void main(String[] args)
    {
        int x1,x2,i=1,hcf=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1");
        x1=sc.nextInt();
        System.out.println("enter a number2");
        x2=sc.nextInt();

        while(i<=x1 && i<=x2)
        {
            if(x1%i==0 && x2%i==0)
            {
                hcf=i;
                
            }
            i++;
           
        }
        System.out.println("Hcf of the 2 numbers is "+hcf+"\n");
        
        sc.close();

        

    }
}
