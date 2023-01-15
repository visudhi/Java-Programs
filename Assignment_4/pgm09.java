import java.util.Scanner;

/*Write a program to print the factorial of a number 
by defining a method named 'Factorial'. 
Factorial of any number n is represented by n! 
and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1 */ 

public class pgm09 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int x= sc.nextInt();
        sc.close();
        Factorial(x);
    }
    static void Factorial(int x)
    {
        int i=1,n;
        n=x;
        while((n-i)!=1)
        {
            x=x*(n-i);
            ++i;  
        } 
        System.out.println(x); 
    }
}
