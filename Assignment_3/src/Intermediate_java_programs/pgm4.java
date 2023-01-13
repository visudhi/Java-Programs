//program 3  modified for decimals averages

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm4 {
    public static void main(String[] args) {
        double n,sum=0,avg=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the quantity of numbers you want to find average of ");
        n=sc.nextDouble();
        System.out.println("enter the  "+(int)n+" numbers");
        double n1[]=new double[(int) n];
       
        for(int i=0;i<n1.length;i++)
        {
            n1[i]=sc.nextInt();   
        }
        
        for(int i=0;i<n1.length;i++)
        {
            sum+=n1[i];  
        }
        avg= ((sum)/(n));
        System.out.println("The avg of the entered " + (int) n+ " nos is "+ avg);
        sc.close();
}
}
