//pgm to find the sum of N numbers

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm15
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double n,sum=0,arr[];
        //1+2+3+4+5+6
        System.out.println("enter the value of n");
        n=sc.nextDouble();
        System.out.println("enter the "+n+" numbers");
        arr= new double[(int) n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextDouble();
        }

        System.out.println("The entered numbers are:");
        for(int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("\n"+"The sum of the entered "+n+" numbers is "+sum+"\n");
        sc.close();
    }
}

//why for each loop dosent work in array inputs with java

/*For-each cannot be used to initialize any array or 
Collection, because it loops over the current 
contents of the array or Collection, 
giving you each value one at a time. 
The variable in a for-each is not a proxy 
for an array or Collection reference. 
The compiler does not replace your " i " (from " int i ") 
with " array [index] ". */
