//pgm to find sum of digits of a number
package Intermediate_java_programs;

import java.util.Scanner;

public class pgm34{
    public static void main(String[] args) 
    {
        int x,y,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        x= sc.nextInt();
        //1234
        while(x!=0)
        {
            y=x%10;
            x=x/10;
            sum+=y;
           
        }
        System.out.println(sum);
        sc.close();

        
    }
}