//pgm to find the commision percentage

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm06
{
    public static void main(String[] args) 
    {
        double commision,amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        amount=sc.nextInt();
        System.out.println("enter the commision amount= ");
        commision=sc.nextInt();
        
        computeValue(amount, commision);
        sc.close();
    
    }

    public static void computeValue(double a, double b){
        double commision_percentage;
        commision_percentage=(b/a)*100;
        System.out.println("The commision percentage= "+ commision_percentage + " %");
    }
}