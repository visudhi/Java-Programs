/* Write a function to find if a number is a palindrome or not.
 Take number as parameter. */

import java.util.Scanner;
public class pgm10 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        sc.close();
        palindrome(x);
    }
    static void palindrome(int x)
    {
        int n=x,y,rev=0;
        while(x!=0)
        {
            y=x%10;
            x=x/10;
            rev=(rev*10)+y;
        }
        System.out.println("The reversed number is "+rev);

        if(rev==n)
        System.out.println("The number is a palindrome");
        else
        System.out.println("The number is not a palindrome");
    }
}
