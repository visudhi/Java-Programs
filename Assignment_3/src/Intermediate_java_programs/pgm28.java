//pgm to find whether a number is a palindrome or not

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm28
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int x1,rev=0;
        System.out.println("enter a number");
        int n=sc.nextInt();
        int n1=n;

        sc.close();
        while(n!=0)
        {
            
            x1=n%10;//1//5//1
            n=n/10;//15//1
            rev=rev*10+x1;
            
        }
        System.out.println(rev);

        if(n1==rev)
        {
            System.out.println("The number is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
        

    }   
}
