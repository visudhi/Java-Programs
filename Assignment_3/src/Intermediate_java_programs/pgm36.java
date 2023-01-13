//Write a program to print the sum of negative numbers, sum of positive even numbers 
//and the sum of positive odd numbers from a list of numbers (N) entered by the user. 
//The list terminates when the user enters a zero.

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm36 {
    
    public static void main(String[] args)
    
    {
        
        int arr[],n,sum1=0,sum2=0,sum4=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the count of nos you wish to enter");
        n=sc.nextInt();
        
        System.out.println("enter the numbers");
        arr= new int[n];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        sc.close();
        for(int j=0;j<=arr[j];j++)
        {
            if(arr[j]<0)
            {
                (sum1)+=Math.abs(arr[j]);
                
            }
            
            if(arr[j]>0)
            {
                if(arr[j]%2==0)
                sum2+=arr[j];

                if(arr[j]%2!=0)
                sum4+=arr[j];


            }

        }
        System.out.println("The total sum according to the program condition is");
        System.out.println("sum of negative nos is "+sum1);
        System.out.println("sum of positive even nos is "+sum2);
        System.out.println("sum of positive odd numbers is "+ sum4);
      
    }
}
