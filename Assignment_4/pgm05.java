//Define a method that returns the product 
//of two numbers entered by user.
import java.util.Scanner;
public class pgm05 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int x1=sc.nextInt();
        int x2= sc.nextInt();
        product(x1,x2);
        sc.close();
    }
    static void product(int x1,int x2)
    {
        int product =x1*x2;
        System.out.println("The product of "+x1+" and "+x2+" is "+ product);

    }
}
