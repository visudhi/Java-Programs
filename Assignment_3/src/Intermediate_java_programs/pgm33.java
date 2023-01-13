//pgm to find leap year

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm33
{
    public static void main(String[] args)
    {
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        year=sc.nextInt();
        sc.close();
        if(year %4==0 || year%400==0 )
        {
            System.out.println("It is a leap year");
        }
        else if(year%4==0 && year%100!=0)
        {
            System.out.println("It is not a leap year");
        }
    }
}
